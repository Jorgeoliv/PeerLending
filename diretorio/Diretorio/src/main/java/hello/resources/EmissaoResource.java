package hello.resources;

import hello.representations.Emissao;
import hello.representations.Leilao;

import com.google.common.base.Optional;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;

@Path("/emissao")
@Produces(MediaType.APPLICATION_JSON)
public class EmissaoResource {
    private HashMap<String, ArrayList<Emissao>> emissoesAtivas = new HashMap<>();
    private HashMap<String, ArrayList<Emissao>> emissoesFinalizadas = new HashMap<>();

    public EmissaoResource(){

        System.out.println("Fui criada!");
    }

    //Emissoes ativas
    @GET
    public ArrayList<Emissao> getEmissoesAtivasEmpresa(@QueryParam("empresa") Optional<String> empresa) {

        if(!empresa.isPresent()) {

            ArrayList<Emissao> emissoes = new ArrayList<>();

            for(ArrayList<Emissao> aux: emissoesAtivas.values()){
                emissoes.addAll(aux);
            }
            return emissoes;
        }

        if(emissoesAtivas.get(empresa.get()) == null)
            return new ArrayList<>();
        return emissoesAtivas.get(empresa.get());
    }

    //emissoes Finalizadas
    @GET
    @Path("/finalizadas")
    public ArrayList<Emissao> getLeiloesFinalizados(@QueryParam("empresa") Optional<String> empresa){
        if(!empresa.isPresent()) {
            ArrayList<Emissao> emissoes = new ArrayList<>();
            for (ArrayList<Emissao> aux : emissoesFinalizadas.values()) {
                emissoes.addAll(aux);
            }
            return emissoes;
        }

        if(emissoesAtivas.get(empresa.get()) == null)
            return new ArrayList<>();
        return emissoesFinalizadas.get(empresa.get());
    }



    /**
     * Para a Exchange
     */
    @PUT
    @Path("/{empresa}/terminado/{id}")

    public Response terminaEmissao(@PathParam("empresa") String empresa, @PathParam("id") int id, Emissao em) {

        ArrayList<Emissao> emissoesA = emissoesAtivas.get(empresa);
        if(emissoesA == null){
            //dar erro
            return Response.status(Response.Status.NOT_FOUND).entity("Não existem emissoes ativas para a empresa: " + empresa).build();
        }

        if(em.id != id){
            return Response.status(Response.Status.NOT_FOUND).entity("Ids incompativeis no put das emissoes para a empresa: " + empresa).build();
        }
        try {
            Emissao emissao = emissoesA.stream().filter(l -> l.id == id).findFirst().get();

            System.out.println(emissao);
            emissao.terminado = true;
            emissao.propostas = em.propostas;
            emissao.sucesso = em.sucesso;

            ArrayList<Emissao> emissaoF = emissoesFinalizadas.get(empresa);
            if (emissaoF == null)
                emissaoF = new ArrayList<Emissao>();
            emissaoF.add(emissao);
            boolean continua = true;
            for (int i = 0; i < emissoesA.size() && continua; i++) {
                if (emissoesA.get(i).equals(emissao)) {
                    emissoesA.remove(i);
                    continua = false;
                }
            }

            emissoesAtivas.put(empresa, emissoesA);
            emissoesFinalizadas.put(empresa, emissaoF);

            System.out.println(emissoesAtivas.get(empresa));
            System.out.println(emissoesFinalizadas.get(empresa));

            return Response.ok(emissao).build();
        }catch(Exception exc){
            return Response.status(Response.Status.NOT_FOUND).entity("A emissão referida não se encontra ativa").build();
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(Emissao emissao) {
        if(emissoesAtivas.containsKey(emissao.empresa)){
            ArrayList<Emissao> l = emissoesAtivas.get(emissao.empresa);
            l.add(emissao);
            emissoesAtivas.put(emissao.empresa, l);
        }
        else{
            ArrayList<Emissao> l = new ArrayList<>();
            l.add(emissao);
            emissoesAtivas.put(emissao.empresa, l);
        }
        return Response.ok(emissao).build();
    }

}

