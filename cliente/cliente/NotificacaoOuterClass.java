// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Notificacao.proto

package cliente;

public final class NotificacaoOuterClass {
  private NotificacaoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code cliente.TipoNotificacao}
   */
  public enum TipoNotificacao
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CRIACAOLEILAO = 1;</code>
     */
    CRIACAOLEILAO(1),
    /**
     * <code>LICITACAOLEILAO = 2;</code>
     */
    LICITACAOLEILAO(2),
    /**
     * <code>CRIACOEMISSAO = 3;</code>
     */
    CRIACOEMISSAO(3),
    /**
     * <code>LICITACAOEMISSAO = 4;</code>
     */
    LICITACAOEMISSAO(4),
    ;

    /**
     * <code>CRIACAOLEILAO = 1;</code>
     */
    public static final int CRIACAOLEILAO_VALUE = 1;
    /**
     * <code>LICITACAOLEILAO = 2;</code>
     */
    public static final int LICITACAOLEILAO_VALUE = 2;
    /**
     * <code>CRIACOEMISSAO = 3;</code>
     */
    public static final int CRIACOEMISSAO_VALUE = 3;
    /**
     * <code>LICITACAOEMISSAO = 4;</code>
     */
    public static final int LICITACAOEMISSAO_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TipoNotificacao valueOf(int value) {
      return forNumber(value);
    }

    public static TipoNotificacao forNumber(int value) {
      switch (value) {
        case 1: return CRIACAOLEILAO;
        case 2: return LICITACAOLEILAO;
        case 3: return CRIACOEMISSAO;
        case 4: return LICITACAOEMISSAO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TipoNotificacao>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TipoNotificacao> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TipoNotificacao>() {
            public TipoNotificacao findValueByNumber(int number) {
              return TipoNotificacao.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return cliente.NotificacaoOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final TipoNotificacao[] VALUES = values();

    public static TipoNotificacao valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TipoNotificacao(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:cliente.TipoNotificacao)
  }

  public interface NotificacaoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:cliente.Notificacao)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
     */
    boolean hasTipo();
    /**
     * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
     */
    cliente.NotificacaoOuterClass.TipoNotificacao getTipo();

    /**
     * <code>required string empresa = 2;</code>
     */
    boolean hasEmpresa();
    /**
     * <code>required string empresa = 2;</code>
     */
    java.lang.String getEmpresa();
    /**
     * <code>required string empresa = 2;</code>
     */
    com.google.protobuf.ByteString
        getEmpresaBytes();

    /**
     * <code>required int64 montante = 3;</code>
     */
    boolean hasMontante();
    /**
     * <code>required int64 montante = 3;</code>
     */
    long getMontante();

    /**
     * <code>optional float taxa = 4;</code>
     */
    boolean hasTaxa();
    /**
     * <code>optional float taxa = 4;</code>
     */
    float getTaxa();
  }
  /**
   * Protobuf type {@code cliente.Notificacao}
   */
  public  static final class Notificacao extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:cliente.Notificacao)
      NotificacaoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Notificacao.newBuilder() to construct.
    private Notificacao(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Notificacao() {
      tipo_ = 1;
      empresa_ = "";
      montante_ = 0L;
      taxa_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Notificacao(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              cliente.NotificacaoOuterClass.TipoNotificacao value = cliente.NotificacaoOuterClass.TipoNotificacao.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                tipo_ = rawValue;
              }
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              empresa_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              montante_ = input.readInt64();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              taxa_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cliente.NotificacaoOuterClass.internal_static_cliente_Notificacao_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cliente.NotificacaoOuterClass.internal_static_cliente_Notificacao_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cliente.NotificacaoOuterClass.Notificacao.class, cliente.NotificacaoOuterClass.Notificacao.Builder.class);
    }

    private int bitField0_;
    public static final int TIPO_FIELD_NUMBER = 1;
    private int tipo_;
    /**
     * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
     */
    public boolean hasTipo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
     */
    public cliente.NotificacaoOuterClass.TipoNotificacao getTipo() {
      @SuppressWarnings("deprecation")
      cliente.NotificacaoOuterClass.TipoNotificacao result = cliente.NotificacaoOuterClass.TipoNotificacao.valueOf(tipo_);
      return result == null ? cliente.NotificacaoOuterClass.TipoNotificacao.CRIACAOLEILAO : result;
    }

    public static final int EMPRESA_FIELD_NUMBER = 2;
    private volatile java.lang.Object empresa_;
    /**
     * <code>required string empresa = 2;</code>
     */
    public boolean hasEmpresa() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string empresa = 2;</code>
     */
    public java.lang.String getEmpresa() {
      java.lang.Object ref = empresa_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          empresa_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string empresa = 2;</code>
     */
    public com.google.protobuf.ByteString
        getEmpresaBytes() {
      java.lang.Object ref = empresa_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        empresa_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MONTANTE_FIELD_NUMBER = 3;
    private long montante_;
    /**
     * <code>required int64 montante = 3;</code>
     */
    public boolean hasMontante() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int64 montante = 3;</code>
     */
    public long getMontante() {
      return montante_;
    }

    public static final int TAXA_FIELD_NUMBER = 4;
    private float taxa_;
    /**
     * <code>optional float taxa = 4;</code>
     */
    public boolean hasTaxa() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional float taxa = 4;</code>
     */
    public float getTaxa() {
      return taxa_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTipo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEmpresa()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMontante()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, tipo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, empresa_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, montante_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFloat(4, taxa_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, tipo_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, empresa_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, montante_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, taxa_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cliente.NotificacaoOuterClass.Notificacao)) {
        return super.equals(obj);
      }
      cliente.NotificacaoOuterClass.Notificacao other = (cliente.NotificacaoOuterClass.Notificacao) obj;

      boolean result = true;
      result = result && (hasTipo() == other.hasTipo());
      if (hasTipo()) {
        result = result && tipo_ == other.tipo_;
      }
      result = result && (hasEmpresa() == other.hasEmpresa());
      if (hasEmpresa()) {
        result = result && getEmpresa()
            .equals(other.getEmpresa());
      }
      result = result && (hasMontante() == other.hasMontante());
      if (hasMontante()) {
        result = result && (getMontante()
            == other.getMontante());
      }
      result = result && (hasTaxa() == other.hasTaxa());
      if (hasTaxa()) {
        result = result && (
            java.lang.Float.floatToIntBits(getTaxa())
            == java.lang.Float.floatToIntBits(
                other.getTaxa()));
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTipo()) {
        hash = (37 * hash) + TIPO_FIELD_NUMBER;
        hash = (53 * hash) + tipo_;
      }
      if (hasEmpresa()) {
        hash = (37 * hash) + EMPRESA_FIELD_NUMBER;
        hash = (53 * hash) + getEmpresa().hashCode();
      }
      if (hasMontante()) {
        hash = (37 * hash) + MONTANTE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getMontante());
      }
      if (hasTaxa()) {
        hash = (37 * hash) + TAXA_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getTaxa());
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cliente.NotificacaoOuterClass.Notificacao parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(cliente.NotificacaoOuterClass.Notificacao prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code cliente.Notificacao}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:cliente.Notificacao)
        cliente.NotificacaoOuterClass.NotificacaoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cliente.NotificacaoOuterClass.internal_static_cliente_Notificacao_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cliente.NotificacaoOuterClass.internal_static_cliente_Notificacao_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cliente.NotificacaoOuterClass.Notificacao.class, cliente.NotificacaoOuterClass.Notificacao.Builder.class);
      }

      // Construct using cliente.NotificacaoOuterClass.Notificacao.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tipo_ = 1;
        bitField0_ = (bitField0_ & ~0x00000001);
        empresa_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        montante_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        taxa_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cliente.NotificacaoOuterClass.internal_static_cliente_Notificacao_descriptor;
      }

      @java.lang.Override
      public cliente.NotificacaoOuterClass.Notificacao getDefaultInstanceForType() {
        return cliente.NotificacaoOuterClass.Notificacao.getDefaultInstance();
      }

      @java.lang.Override
      public cliente.NotificacaoOuterClass.Notificacao build() {
        cliente.NotificacaoOuterClass.Notificacao result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public cliente.NotificacaoOuterClass.Notificacao buildPartial() {
        cliente.NotificacaoOuterClass.Notificacao result = new cliente.NotificacaoOuterClass.Notificacao(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tipo_ = tipo_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.empresa_ = empresa_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.montante_ = montante_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.taxa_ = taxa_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cliente.NotificacaoOuterClass.Notificacao) {
          return mergeFrom((cliente.NotificacaoOuterClass.Notificacao)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cliente.NotificacaoOuterClass.Notificacao other) {
        if (other == cliente.NotificacaoOuterClass.Notificacao.getDefaultInstance()) return this;
        if (other.hasTipo()) {
          setTipo(other.getTipo());
        }
        if (other.hasEmpresa()) {
          bitField0_ |= 0x00000002;
          empresa_ = other.empresa_;
          onChanged();
        }
        if (other.hasMontante()) {
          setMontante(other.getMontante());
        }
        if (other.hasTaxa()) {
          setTaxa(other.getTaxa());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasTipo()) {
          return false;
        }
        if (!hasEmpresa()) {
          return false;
        }
        if (!hasMontante()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cliente.NotificacaoOuterClass.Notificacao parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cliente.NotificacaoOuterClass.Notificacao) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int tipo_ = 1;
      /**
       * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
       */
      public boolean hasTipo() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
       */
      public cliente.NotificacaoOuterClass.TipoNotificacao getTipo() {
        @SuppressWarnings("deprecation")
        cliente.NotificacaoOuterClass.TipoNotificacao result = cliente.NotificacaoOuterClass.TipoNotificacao.valueOf(tipo_);
        return result == null ? cliente.NotificacaoOuterClass.TipoNotificacao.CRIACAOLEILAO : result;
      }
      /**
       * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
       */
      public Builder setTipo(cliente.NotificacaoOuterClass.TipoNotificacao value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        tipo_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>required .cliente.TipoNotificacao tipo = 1 [default = CRIACAOLEILAO];</code>
       */
      public Builder clearTipo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tipo_ = 1;
        onChanged();
        return this;
      }

      private java.lang.Object empresa_ = "";
      /**
       * <code>required string empresa = 2;</code>
       */
      public boolean hasEmpresa() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string empresa = 2;</code>
       */
      public java.lang.String getEmpresa() {
        java.lang.Object ref = empresa_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            empresa_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string empresa = 2;</code>
       */
      public com.google.protobuf.ByteString
          getEmpresaBytes() {
        java.lang.Object ref = empresa_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          empresa_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string empresa = 2;</code>
       */
      public Builder setEmpresa(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        empresa_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string empresa = 2;</code>
       */
      public Builder clearEmpresa() {
        bitField0_ = (bitField0_ & ~0x00000002);
        empresa_ = getDefaultInstance().getEmpresa();
        onChanged();
        return this;
      }
      /**
       * <code>required string empresa = 2;</code>
       */
      public Builder setEmpresaBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        empresa_ = value;
        onChanged();
        return this;
      }

      private long montante_ ;
      /**
       * <code>required int64 montante = 3;</code>
       */
      public boolean hasMontante() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int64 montante = 3;</code>
       */
      public long getMontante() {
        return montante_;
      }
      /**
       * <code>required int64 montante = 3;</code>
       */
      public Builder setMontante(long value) {
        bitField0_ |= 0x00000004;
        montante_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 montante = 3;</code>
       */
      public Builder clearMontante() {
        bitField0_ = (bitField0_ & ~0x00000004);
        montante_ = 0L;
        onChanged();
        return this;
      }

      private float taxa_ ;
      /**
       * <code>optional float taxa = 4;</code>
       */
      public boolean hasTaxa() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional float taxa = 4;</code>
       */
      public float getTaxa() {
        return taxa_;
      }
      /**
       * <code>optional float taxa = 4;</code>
       */
      public Builder setTaxa(float value) {
        bitField0_ |= 0x00000008;
        taxa_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional float taxa = 4;</code>
       */
      public Builder clearTaxa() {
        bitField0_ = (bitField0_ & ~0x00000008);
        taxa_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:cliente.Notificacao)
    }

    // @@protoc_insertion_point(class_scope:cliente.Notificacao)
    private static final cliente.NotificacaoOuterClass.Notificacao DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cliente.NotificacaoOuterClass.Notificacao();
    }

    public static cliente.NotificacaoOuterClass.Notificacao getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Notificacao>
        PARSER = new com.google.protobuf.AbstractParser<Notificacao>() {
      @java.lang.Override
      public Notificacao parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Notificacao(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Notificacao> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Notificacao> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public cliente.NotificacaoOuterClass.Notificacao getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cliente_Notificacao_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cliente_Notificacao_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021Notificacao.proto\022\007cliente\"u\n\013Notifica" +
      "cao\0225\n\004tipo\030\001 \002(\0162\030.cliente.TipoNotifica" +
      "cao:\rCRIACAOLEILAO\022\017\n\007empresa\030\002 \002(\t\022\020\n\010m" +
      "ontante\030\003 \002(\003\022\014\n\004taxa\030\004 \001(\002*b\n\017TipoNotif" +
      "icacao\022\021\n\rCRIACAOLEILAO\020\001\022\023\n\017LICITACAOLE" +
      "ILAO\020\002\022\021\n\rCRIACOEMISSAO\020\003\022\024\n\020LICITACAOEM" +
      "ISSAO\020\004"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_cliente_Notificacao_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cliente_Notificacao_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cliente_Notificacao_descriptor,
        new java.lang.String[] { "Tipo", "Empresa", "Montante", "Taxa", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}