// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package name.abuchen.portfolio.model.proto.v1;

/**
 * Protobuf type {@code name.abuchen.portfolio.PDecimalValue}
 */
public final class PDecimalValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:name.abuchen.portfolio.PDecimalValue)
    PDecimalValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PDecimalValue.newBuilder() to construct.
  private PDecimalValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PDecimalValue() {
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PDecimalValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PDecimalValue(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            scale_ = input.readUInt32();
            break;
          }
          case 16: {

            precision_ = input.readUInt32();
            break;
          }
          case 26: {

            value_ = input.readBytes();
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
    return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PDecimalValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PDecimalValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            name.abuchen.portfolio.model.proto.v1.PDecimalValue.class, name.abuchen.portfolio.model.proto.v1.PDecimalValue.Builder.class);
  }

  public static final int SCALE_FIELD_NUMBER = 1;
  private int scale_;
  /**
   * <code>uint32 scale = 1;</code>
   * @return The scale.
   */
  @java.lang.Override
  public int getScale() {
    return scale_;
  }

  public static final int PRECISION_FIELD_NUMBER = 2;
  private int precision_;
  /**
   * <code>uint32 precision = 2;</code>
   * @return The precision.
   */
  @java.lang.Override
  public int getPrecision() {
    return precision_;
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString value_;
  /**
   * <code>bytes value = 3;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (scale_ != 0) {
      output.writeUInt32(1, scale_);
    }
    if (precision_ != 0) {
      output.writeUInt32(2, precision_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(3, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scale_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, scale_);
    }
    if (precision_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, precision_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, value_);
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
    if (!(obj instanceof name.abuchen.portfolio.model.proto.v1.PDecimalValue)) {
      return super.equals(obj);
    }
    name.abuchen.portfolio.model.proto.v1.PDecimalValue other = (name.abuchen.portfolio.model.proto.v1.PDecimalValue) obj;

    if (getScale()
        != other.getScale()) return false;
    if (getPrecision()
        != other.getPrecision()) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + getScale();
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + getPrecision();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue parseFrom(
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
  public static Builder newBuilder(name.abuchen.portfolio.model.proto.v1.PDecimalValue prototype) {
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
   * Protobuf type {@code name.abuchen.portfolio.PDecimalValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:name.abuchen.portfolio.PDecimalValue)
      name.abuchen.portfolio.model.proto.v1.PDecimalValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PDecimalValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PDecimalValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              name.abuchen.portfolio.model.proto.v1.PDecimalValue.class, name.abuchen.portfolio.model.proto.v1.PDecimalValue.Builder.class);
    }

    // Construct using name.abuchen.portfolio.model.proto.v1.PDecimalValue.newBuilder()
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
      scale_ = 0;

      precision_ = 0;

      value_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return name.abuchen.portfolio.model.proto.v1.ClientProtos.internal_static_name_abuchen_portfolio_PDecimalValue_descriptor;
    }

    @java.lang.Override
    public name.abuchen.portfolio.model.proto.v1.PDecimalValue getDefaultInstanceForType() {
      return name.abuchen.portfolio.model.proto.v1.PDecimalValue.getDefaultInstance();
    }

    @java.lang.Override
    public name.abuchen.portfolio.model.proto.v1.PDecimalValue build() {
      name.abuchen.portfolio.model.proto.v1.PDecimalValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public name.abuchen.portfolio.model.proto.v1.PDecimalValue buildPartial() {
      name.abuchen.portfolio.model.proto.v1.PDecimalValue result = new name.abuchen.portfolio.model.proto.v1.PDecimalValue(this);
      result.scale_ = scale_;
      result.precision_ = precision_;
      result.value_ = value_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof name.abuchen.portfolio.model.proto.v1.PDecimalValue) {
        return mergeFrom((name.abuchen.portfolio.model.proto.v1.PDecimalValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(name.abuchen.portfolio.model.proto.v1.PDecimalValue other) {
      if (other == name.abuchen.portfolio.model.proto.v1.PDecimalValue.getDefaultInstance()) return this;
      if (other.getScale() != 0) {
        setScale(other.getScale());
      }
      if (other.getPrecision() != 0) {
        setPrecision(other.getPrecision());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      name.abuchen.portfolio.model.proto.v1.PDecimalValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (name.abuchen.portfolio.model.proto.v1.PDecimalValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int scale_ ;
    /**
     * <code>uint32 scale = 1;</code>
     * @return The scale.
     */
    @java.lang.Override
    public int getScale() {
      return scale_;
    }
    /**
     * <code>uint32 scale = 1;</code>
     * @param value The scale to set.
     * @return This builder for chaining.
     */
    public Builder setScale(int value) {
      
      scale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 scale = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScale() {
      
      scale_ = 0;
      onChanged();
      return this;
    }

    private int precision_ ;
    /**
     * <code>uint32 precision = 2;</code>
     * @return The precision.
     */
    @java.lang.Override
    public int getPrecision() {
      return precision_;
    }
    /**
     * <code>uint32 precision = 2;</code>
     * @param value The precision to set.
     * @return This builder for chaining.
     */
    public Builder setPrecision(int value) {
      
      precision_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 precision = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrecision() {
      
      precision_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes value = 3;</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <code>bytes value = 3;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes value = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
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


    // @@protoc_insertion_point(builder_scope:name.abuchen.portfolio.PDecimalValue)
  }

  // @@protoc_insertion_point(class_scope:name.abuchen.portfolio.PDecimalValue)
  private static final name.abuchen.portfolio.model.proto.v1.PDecimalValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new name.abuchen.portfolio.model.proto.v1.PDecimalValue();
  }

  public static name.abuchen.portfolio.model.proto.v1.PDecimalValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PDecimalValue>
      PARSER = new com.google.protobuf.AbstractParser<PDecimalValue>() {
    @java.lang.Override
    public PDecimalValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PDecimalValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PDecimalValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PDecimalValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public name.abuchen.portfolio.model.proto.v1.PDecimalValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

