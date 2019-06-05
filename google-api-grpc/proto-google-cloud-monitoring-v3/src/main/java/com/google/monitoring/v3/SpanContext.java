// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/span_context.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The context of a span, attached to google.api.Distribution.Exemplars
 * in google.api.Distribution values during aggregation.
 * It contains the name of a span with format:
 *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.SpanContext}
 */
public final class SpanContext extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.SpanContext)
    SpanContextOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SpanContext.newBuilder() to construct.
  private SpanContext(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SpanContext() {
    spanName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SpanContext();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SpanContext(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              spanName_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.SpanContextProto
        .internal_static_google_monitoring_v3_SpanContext_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.SpanContextProto
        .internal_static_google_monitoring_v3_SpanContext_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.SpanContext.class,
            com.google.monitoring.v3.SpanContext.Builder.class);
  }

  public static final int SPAN_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spanName_;
  /**
   *
   *
   * <pre>
   * The resource name of the span in the following format:
   *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
   * [TRACE_ID] is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array.
   * [SPAN_ID] is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array.
   * </pre>
   *
   * <code>string span_name = 1;</code>
   */
  public java.lang.String getSpanName() {
    java.lang.Object ref = spanName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spanName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The resource name of the span in the following format:
   *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
   * [TRACE_ID] is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array.
   * [SPAN_ID] is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array.
   * </pre>
   *
   * <code>string span_name = 1;</code>
   */
  public com.google.protobuf.ByteString getSpanNameBytes() {
    java.lang.Object ref = spanName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      spanName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getSpanNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spanName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpanNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spanName_);
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
    if (!(obj instanceof com.google.monitoring.v3.SpanContext)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.SpanContext other = (com.google.monitoring.v3.SpanContext) obj;

    if (!getSpanName().equals(other.getSpanName())) return false;
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
    hash = (37 * hash) + SPAN_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpanName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.SpanContext parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.SpanContext parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.SpanContext parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.SpanContext prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The context of a span, attached to google.api.Distribution.Exemplars
   * in google.api.Distribution values during aggregation.
   * It contains the name of a span with format:
   *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.SpanContext}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.SpanContext)
      com.google.monitoring.v3.SpanContextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.SpanContextProto
          .internal_static_google_monitoring_v3_SpanContext_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.SpanContextProto
          .internal_static_google_monitoring_v3_SpanContext_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.SpanContext.class,
              com.google.monitoring.v3.SpanContext.Builder.class);
    }

    // Construct using com.google.monitoring.v3.SpanContext.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      spanName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.SpanContextProto
          .internal_static_google_monitoring_v3_SpanContext_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.SpanContext getDefaultInstanceForType() {
      return com.google.monitoring.v3.SpanContext.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.SpanContext build() {
      com.google.monitoring.v3.SpanContext result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.SpanContext buildPartial() {
      com.google.monitoring.v3.SpanContext result = new com.google.monitoring.v3.SpanContext(this);
      result.spanName_ = spanName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.SpanContext) {
        return mergeFrom((com.google.monitoring.v3.SpanContext) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.SpanContext other) {
      if (other == com.google.monitoring.v3.SpanContext.getDefaultInstance()) return this;
      if (!other.getSpanName().isEmpty()) {
        spanName_ = other.spanName_;
        onChanged();
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
      com.google.monitoring.v3.SpanContext parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.SpanContext) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spanName_ = "";
    /**
     *
     *
     * <pre>
     * The resource name of the span in the following format:
     *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
     * [TRACE_ID] is a unique identifier for a trace within a project;
     * it is a 32-character hexadecimal encoding of a 16-byte array.
     * [SPAN_ID] is a unique identifier for a span within a trace; it
     * is a 16-character hexadecimal encoding of an 8-byte array.
     * </pre>
     *
     * <code>string span_name = 1;</code>
     */
    public java.lang.String getSpanName() {
      java.lang.Object ref = spanName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spanName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the span in the following format:
     *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
     * [TRACE_ID] is a unique identifier for a trace within a project;
     * it is a 32-character hexadecimal encoding of a 16-byte array.
     * [SPAN_ID] is a unique identifier for a span within a trace; it
     * is a 16-character hexadecimal encoding of an 8-byte array.
     * </pre>
     *
     * <code>string span_name = 1;</code>
     */
    public com.google.protobuf.ByteString getSpanNameBytes() {
      java.lang.Object ref = spanName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        spanName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The resource name of the span in the following format:
     *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
     * [TRACE_ID] is a unique identifier for a trace within a project;
     * it is a 32-character hexadecimal encoding of a 16-byte array.
     * [SPAN_ID] is a unique identifier for a span within a trace; it
     * is a 16-character hexadecimal encoding of an 8-byte array.
     * </pre>
     *
     * <code>string span_name = 1;</code>
     */
    public Builder setSpanName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      spanName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the span in the following format:
     *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
     * [TRACE_ID] is a unique identifier for a trace within a project;
     * it is a 32-character hexadecimal encoding of a 16-byte array.
     * [SPAN_ID] is a unique identifier for a span within a trace; it
     * is a 16-character hexadecimal encoding of an 8-byte array.
     * </pre>
     *
     * <code>string span_name = 1;</code>
     */
    public Builder clearSpanName() {

      spanName_ = getDefaultInstance().getSpanName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The resource name of the span in the following format:
     *     projects/[PROJECT_ID]/traces/[TRACE_ID]/spans/[SPAN_ID]
     * [TRACE_ID] is a unique identifier for a trace within a project;
     * it is a 32-character hexadecimal encoding of a 16-byte array.
     * [SPAN_ID] is a unique identifier for a span within a trace; it
     * is a 16-character hexadecimal encoding of an 8-byte array.
     * </pre>
     *
     * <code>string span_name = 1;</code>
     */
    public Builder setSpanNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      spanName_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.SpanContext)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.SpanContext)
  private static final com.google.monitoring.v3.SpanContext DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.SpanContext();
  }

  public static com.google.monitoring.v3.SpanContext getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpanContext> PARSER =
      new com.google.protobuf.AbstractParser<SpanContext>() {
        @java.lang.Override
        public SpanContext parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SpanContext(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SpanContext> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpanContext> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.SpanContext getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
