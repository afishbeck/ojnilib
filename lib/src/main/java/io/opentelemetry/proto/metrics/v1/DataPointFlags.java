// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/metrics/v1/metrics.proto

package io.opentelemetry.proto.metrics.v1;

/**
 * <pre>
 * DataPointFlags is defined as a protobuf 'uint32' type and is to be used as a
 * bit-field representing 32 distinct boolean flags.  Each flag defined in this
 * enum is a bit-mask.  To test the presence of a single flag in the flags of
 * a data point, for example, use an expression like:
 *   (point.flags &amp; FLAG_NO_RECORDED_VALUE) == FLAG_NO_RECORDED_VALUE
 * </pre>
 *
 * Protobuf enum {@code opentelemetry.proto.metrics.v1.DataPointFlags}
 */
public enum DataPointFlags
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>FLAG_NONE = 0;</code>
   */
  FLAG_NONE(0),
  /**
   * <pre>
   * This DataPoint is valid but has no recorded value.  This value
   * SHOULD be used to reflect explicitly missing data in a series, as
   * for an equivalent to the Prometheus "staleness marker".
   * </pre>
   *
   * <code>FLAG_NO_RECORDED_VALUE = 1;</code>
   */
  FLAG_NO_RECORDED_VALUE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>FLAG_NONE = 0;</code>
   */
  public static final int FLAG_NONE_VALUE = 0;
  /**
   * <pre>
   * This DataPoint is valid but has no recorded value.  This value
   * SHOULD be used to reflect explicitly missing data in a series, as
   * for an equivalent to the Prometheus "staleness marker".
   * </pre>
   *
   * <code>FLAG_NO_RECORDED_VALUE = 1;</code>
   */
  public static final int FLAG_NO_RECORDED_VALUE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DataPointFlags valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataPointFlags forNumber(int value) {
    switch (value) {
      case 0: return FLAG_NONE;
      case 1: return FLAG_NO_RECORDED_VALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataPointFlags>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataPointFlags> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataPointFlags>() {
          public DataPointFlags findValueByNumber(int number) {
            return DataPointFlags.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.opentelemetry.proto.metrics.v1.MetricsProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final DataPointFlags[] VALUES = values();

  public static DataPointFlags valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataPointFlags(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opentelemetry.proto.metrics.v1.DataPointFlags)
}

