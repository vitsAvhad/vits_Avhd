// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package name.abuchen.portfolio.model.proto.v1;

public interface PExchangeRateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:name.abuchen.portfolio.PExchangeRate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 date = 1;</code>
   * @return The date.
   */
  long getDate();

  /**
   * <code>.name.abuchen.portfolio.PDecimalValue value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.name.abuchen.portfolio.PDecimalValue value = 2;</code>
   * @return The value.
   */
  name.abuchen.portfolio.model.proto.v1.PDecimalValue getValue();
  /**
   * <code>.name.abuchen.portfolio.PDecimalValue value = 2;</code>
   */
  name.abuchen.portfolio.model.proto.v1.PDecimalValueOrBuilder getValueOrBuilder();
}
