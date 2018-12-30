package exchange;

public class Proposta implements Comparable{

    public int id;
    public String cliente;
    public long montante;
    public float taxa;

    public Proposta(int id, String cliente, long montante, float taxa){
        this.id = id;
        this.cliente = cliente;
        this.montante = montante;
        this.taxa = taxa;
    }

    public int compareTo(Object o){
        Proposta p = (Proposta) o;
        if(taxa < p.taxa){
            return 1;
        }

        if(taxa > p.taxa){
            return -1;
        }

        if(montante < p.montante){
            return -1;
        }

        if(montante > p.montante){
            return 1;
        }
        
        return 0;
    }

    public String toString(){
        String res = "Proposta: {";
        res += "cliente: " + cliente;
        res += "; montante: " + montante;
        res += "; taxa: " + taxa + "}";

        return res;
    }
    
}