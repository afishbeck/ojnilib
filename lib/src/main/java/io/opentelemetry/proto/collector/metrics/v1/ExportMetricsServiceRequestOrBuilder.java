// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opentelemetry/proto/collector/metrics/v1/metrics_service.proto

package io.opentelemetry.proto.collector.metrics.v1;

public interface ExportMetricsServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  java.util.List<io.opentelemetry.proto.metrics.v1.ResourceMetrics> 
      getResourceMetricsList();
  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.ResourceMetrics getResourceMetrics(int index);
  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  int getResourceMetricsCount();
  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  java.util.List<? extends io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder> 
      getResourceMetricsOrBuilderList();
  /**
   * <pre>
   * An array of ResourceMetrics.
   * For data coming from a single resource this array will typically contain one
   * element. Intermediary nodes (such as OpenTelemetry Collector) that receive
   * data from multiple origins typically batch the data before forwarding further and
   * in that case this array will contain multiple elements.
   * </pre>
   *
   * <code>repeated .opentelemetry.proto.metrics.v1.ResourceMetrics resource_metrics = 1;</code>
   */
  io.opentelemetry.proto.metrics.v1.ResourceMetricsOrBuilder getResourceMetricsOrBuilder(
      int index);
}
