// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * An internal checker allows uptime checks to run on private/internal GCP
 * resources.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.InternalChecker}
 */
public final class InternalChecker extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.InternalChecker)
    InternalCheckerOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InternalChecker.newBuilder() to construct.
  private InternalChecker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InternalChecker() {
    name_ = "";
    displayName_ = "";
    network_ = "";
    gcpZone_ = "";
    peerProjectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InternalChecker();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private InternalChecker(
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

              name_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              displayName_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              network_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              gcpZone_ = s;
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              peerProjectId_ = s;
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
    return com.google.monitoring.v3.UptimeProto
        .internal_static_google_monitoring_v3_InternalChecker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.UptimeProto
        .internal_static_google_monitoring_v3_InternalChecker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.InternalChecker.class,
            com.google.monitoring.v3.InternalChecker.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * A unique resource name for this InternalChecker. The format is:
   *   `projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID]`.
   * PROJECT_ID is the stackdriver workspace project for the
   * uptime check config associated with the internal checker.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A unique resource name for this InternalChecker. The format is:
   *   `projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID]`.
   * PROJECT_ID is the stackdriver workspace project for the
   * uptime check config associated with the internal checker.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   *
   *
   * <pre>
   * The checker's human-readable name. The display name
   * should be unique within a Stackdriver Workspace in order to make it easier
   * to identify; however, uniqueness is not enforced.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The checker's human-readable name. The display name
   * should be unique within a Stackdriver Workspace in order to make it easier
   * to identify; however, uniqueness is not enforced.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  public com.google.protobuf.ByteString getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NETWORK_FIELD_NUMBER = 3;
  private volatile java.lang.Object network_;
  /**
   *
   *
   * <pre>
   * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
   * internal resource lives (ex: "default").
   * </pre>
   *
   * <code>string network = 3;</code>
   */
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
   * internal resource lives (ex: "default").
   * </pre>
   *
   * <code>string network = 3;</code>
   */
  public com.google.protobuf.ByteString getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GCP_ZONE_FIELD_NUMBER = 4;
  private volatile java.lang.Object gcpZone_;
  /**
   *
   *
   * <pre>
   * The GCP zone the uptime check should egress from. Only respected for
   * internal uptime checks, where internal_network is specified.
   * </pre>
   *
   * <code>string gcp_zone = 4;</code>
   */
  public java.lang.String getGcpZone() {
    java.lang.Object ref = gcpZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      gcpZone_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The GCP zone the uptime check should egress from. Only respected for
   * internal uptime checks, where internal_network is specified.
   * </pre>
   *
   * <code>string gcp_zone = 4;</code>
   */
  public com.google.protobuf.ByteString getGcpZoneBytes() {
    java.lang.Object ref = gcpZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      gcpZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PEER_PROJECT_ID_FIELD_NUMBER = 6;
  private volatile java.lang.Object peerProjectId_;
  /**
   *
   *
   * <pre>
   * The GCP project_id where the internal checker lives. Not necessary
   * the same as the workspace project.
   * </pre>
   *
   * <code>string peer_project_id = 6;</code>
   */
  public java.lang.String getPeerProjectId() {
    java.lang.Object ref = peerProjectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      peerProjectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The GCP project_id where the internal checker lives. Not necessary
   * the same as the workspace project.
   * </pre>
   *
   * <code>string peer_project_id = 6;</code>
   */
  public com.google.protobuf.ByteString getPeerProjectIdBytes() {
    java.lang.Object ref = peerProjectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      peerProjectId_ = b;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    if (!getNetworkBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, network_);
    }
    if (!getGcpZoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, gcpZone_);
    }
    if (!getPeerProjectIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, peerProjectId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDisplayNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    if (!getNetworkBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, network_);
    }
    if (!getGcpZoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, gcpZone_);
    }
    if (!getPeerProjectIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, peerProjectId_);
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
    if (!(obj instanceof com.google.monitoring.v3.InternalChecker)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.InternalChecker other = (com.google.monitoring.v3.InternalChecker) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDisplayName().equals(other.getDisplayName())) return false;
    if (!getNetwork().equals(other.getNetwork())) return false;
    if (!getGcpZone().equals(other.getGcpZone())) return false;
    if (!getPeerProjectId().equals(other.getPeerProjectId())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + GCP_ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getGcpZone().hashCode();
    hash = (37 * hash) + PEER_PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPeerProjectId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.InternalChecker parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.InternalChecker parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.InternalChecker parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.InternalChecker prototype) {
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
   * An internal checker allows uptime checks to run on private/internal GCP
   * resources.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.InternalChecker}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.InternalChecker)
      com.google.monitoring.v3.InternalCheckerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.UptimeProto
          .internal_static_google_monitoring_v3_InternalChecker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.UptimeProto
          .internal_static_google_monitoring_v3_InternalChecker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.InternalChecker.class,
              com.google.monitoring.v3.InternalChecker.Builder.class);
    }

    // Construct using com.google.monitoring.v3.InternalChecker.newBuilder()
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
      name_ = "";

      displayName_ = "";

      network_ = "";

      gcpZone_ = "";

      peerProjectId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.UptimeProto
          .internal_static_google_monitoring_v3_InternalChecker_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.InternalChecker getDefaultInstanceForType() {
      return com.google.monitoring.v3.InternalChecker.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.InternalChecker build() {
      com.google.monitoring.v3.InternalChecker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.InternalChecker buildPartial() {
      com.google.monitoring.v3.InternalChecker result =
          new com.google.monitoring.v3.InternalChecker(this);
      result.name_ = name_;
      result.displayName_ = displayName_;
      result.network_ = network_;
      result.gcpZone_ = gcpZone_;
      result.peerProjectId_ = peerProjectId_;
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
      if (other instanceof com.google.monitoring.v3.InternalChecker) {
        return mergeFrom((com.google.monitoring.v3.InternalChecker) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.InternalChecker other) {
      if (other == com.google.monitoring.v3.InternalChecker.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        onChanged();
      }
      if (!other.getGcpZone().isEmpty()) {
        gcpZone_ = other.gcpZone_;
        onChanged();
      }
      if (!other.getPeerProjectId().isEmpty()) {
        peerProjectId_ = other.peerProjectId_;
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
      com.google.monitoring.v3.InternalChecker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.InternalChecker) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * A unique resource name for this InternalChecker. The format is:
     *   `projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID]`.
     * PROJECT_ID is the stackdriver workspace project for the
     * uptime check config associated with the internal checker.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique resource name for this InternalChecker. The format is:
     *   `projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID]`.
     * PROJECT_ID is the stackdriver workspace project for the
     * uptime check config associated with the internal checker.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A unique resource name for this InternalChecker. The format is:
     *   `projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID]`.
     * PROJECT_ID is the stackdriver workspace project for the
     * uptime check config associated with the internal checker.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique resource name for this InternalChecker. The format is:
     *   `projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID]`.
     * PROJECT_ID is the stackdriver workspace project for the
     * uptime check config associated with the internal checker.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A unique resource name for this InternalChecker. The format is:
     *   `projects/[PROJECT_ID]/internalCheckers/[INTERNAL_CHECKER_ID]`.
     * PROJECT_ID is the stackdriver workspace project for the
     * uptime check config associated with the internal checker.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object displayName_ = "";
    /**
     *
     *
     * <pre>
     * The checker's human-readable name. The display name
     * should be unique within a Stackdriver Workspace in order to make it easier
     * to identify; however, uniqueness is not enforced.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The checker's human-readable name. The display name
     * should be unique within a Stackdriver Workspace in order to make it easier
     * to identify; however, uniqueness is not enforced.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public com.google.protobuf.ByteString getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The checker's human-readable name. The display name
     * should be unique within a Stackdriver Workspace in order to make it easier
     * to identify; however, uniqueness is not enforced.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder setDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The checker's human-readable name. The display name
     * should be unique within a Stackdriver Workspace in order to make it easier
     * to identify; however, uniqueness is not enforced.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder clearDisplayName() {

      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The checker's human-readable name. The display name
     * should be unique within a Stackdriver Workspace in order to make it easier
     * to identify; however, uniqueness is not enforced.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     */
    public Builder setDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      displayName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object network_ = "";
    /**
     *
     *
     * <pre>
     * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
     * internal resource lives (ex: "default").
     * </pre>
     *
     * <code>string network = 3;</code>
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
     * internal resource lives (ex: "default").
     * </pre>
     *
     * <code>string network = 3;</code>
     */
    public com.google.protobuf.ByteString getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
     * internal resource lives (ex: "default").
     * </pre>
     *
     * <code>string network = 3;</code>
     */
    public Builder setNetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      network_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
     * internal resource lives (ex: "default").
     * </pre>
     *
     * <code>string network = 3;</code>
     */
    public Builder clearNetwork() {

      network_ = getDefaultInstance().getNetwork();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
     * internal resource lives (ex: "default").
     * </pre>
     *
     * <code>string network = 3;</code>
     */
    public Builder setNetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      network_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object gcpZone_ = "";
    /**
     *
     *
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 4;</code>
     */
    public java.lang.String getGcpZone() {
      java.lang.Object ref = gcpZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        gcpZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 4;</code>
     */
    public com.google.protobuf.ByteString getGcpZoneBytes() {
      java.lang.Object ref = gcpZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gcpZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 4;</code>
     */
    public Builder setGcpZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      gcpZone_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 4;</code>
     */
    public Builder clearGcpZone() {

      gcpZone_ = getDefaultInstance().getGcpZone();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The GCP zone the uptime check should egress from. Only respected for
     * internal uptime checks, where internal_network is specified.
     * </pre>
     *
     * <code>string gcp_zone = 4;</code>
     */
    public Builder setGcpZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      gcpZone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object peerProjectId_ = "";
    /**
     *
     *
     * <pre>
     * The GCP project_id where the internal checker lives. Not necessary
     * the same as the workspace project.
     * </pre>
     *
     * <code>string peer_project_id = 6;</code>
     */
    public java.lang.String getPeerProjectId() {
      java.lang.Object ref = peerProjectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        peerProjectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The GCP project_id where the internal checker lives. Not necessary
     * the same as the workspace project.
     * </pre>
     *
     * <code>string peer_project_id = 6;</code>
     */
    public com.google.protobuf.ByteString getPeerProjectIdBytes() {
      java.lang.Object ref = peerProjectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        peerProjectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The GCP project_id where the internal checker lives. Not necessary
     * the same as the workspace project.
     * </pre>
     *
     * <code>string peer_project_id = 6;</code>
     */
    public Builder setPeerProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      peerProjectId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The GCP project_id where the internal checker lives. Not necessary
     * the same as the workspace project.
     * </pre>
     *
     * <code>string peer_project_id = 6;</code>
     */
    public Builder clearPeerProjectId() {

      peerProjectId_ = getDefaultInstance().getPeerProjectId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The GCP project_id where the internal checker lives. Not necessary
     * the same as the workspace project.
     * </pre>
     *
     * <code>string peer_project_id = 6;</code>
     */
    public Builder setPeerProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      peerProjectId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.InternalChecker)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.InternalChecker)
  private static final com.google.monitoring.v3.InternalChecker DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.InternalChecker();
  }

  public static com.google.monitoring.v3.InternalChecker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InternalChecker> PARSER =
      new com.google.protobuf.AbstractParser<InternalChecker>() {
        @java.lang.Override
        public InternalChecker parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new InternalChecker(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<InternalChecker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InternalChecker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.InternalChecker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
