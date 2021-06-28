package imports.k8s;

/**
 * Event is a report of an event somewhere in the cluster.
 * <p>
 * It generally denotes some state change in the system.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:35.966Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEventV1Beta1Props")
@software.amazon.jsii.Jsii.Proxy(KubeEventV1Beta1Props.Jsii$Proxy.class)
public interface KubeEventV1Beta1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required.
     * <p>
     * Time when this Event was first observed.
     */
    @org.jetbrains.annotations.NotNull java.time.Instant getEventTime();

    /**
     * What action was taken/failed regarding to the regarding object.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAction() {
        return null;
    }

    /**
     * Deprecated field assuring backward compatibility with core.v1 Event type.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getDeprecatedCount() {
        return null;
    }

    /**
     * Deprecated field assuring backward compatibility with core.v1 Event type.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getDeprecatedFirstTimestamp() {
        return null;
    }

    /**
     * Deprecated field assuring backward compatibility with core.v1 Event type.
     */
    default @org.jetbrains.annotations.Nullable java.time.Instant getDeprecatedLastTimestamp() {
        return null;
    }

    /**
     * Deprecated field assuring backward compatibility with core.v1 Event type.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EventSource getDeprecatedSource() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Optional.
     * <p>
     * A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNote() {
        return null;
    }

    /**
     * Why the action was taken.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReason() {
        return null;
    }

    /**
     * The object this Event is about.
     * <p>
     * In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectReference getRegarding() {
        return null;
    }

    /**
     * Optional secondary object for more complex actions.
     * <p>
     * E.g. when regarding object triggers a creation or deletion of related object.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectReference getRelated() {
        return null;
    }

    /**
     * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReportingController() {
        return null;
    }

    /**
     * ID of the controller instance, e.g. `kubelet-xyzf`.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReportingInstance() {
        return null;
    }

    /**
     * Data about the Event series this event represents or nil if it's a singleton Event.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.EventSeries getSeries() {
        return null;
    }

    /**
     * Type of this event (Normal, Warning), new types could be added in the future.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeEventV1Beta1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeEventV1Beta1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeEventV1Beta1Props> {
        private java.time.Instant eventTime;
        private java.lang.String action;
        private java.lang.Number deprecatedCount;
        private java.time.Instant deprecatedFirstTimestamp;
        private java.time.Instant deprecatedLastTimestamp;
        private imports.k8s.EventSource deprecatedSource;
        private imports.k8s.ObjectMeta metadata;
        private java.lang.String note;
        private java.lang.String reason;
        private imports.k8s.ObjectReference regarding;
        private imports.k8s.ObjectReference related;
        private java.lang.String reportingController;
        private java.lang.String reportingInstance;
        private imports.k8s.EventSeries series;
        private java.lang.String type;

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getEventTime}
         * @param eventTime Required. This parameter is required.
         *                  Time when this Event was first observed.
         * @return {@code this}
         */
        public Builder eventTime(java.time.Instant eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getAction}
         * @param action What action was taken/failed regarding to the regarding object.
         * @return {@code this}
         */
        public Builder action(java.lang.String action) {
            this.action = action;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getDeprecatedCount}
         * @param deprecatedCount Deprecated field assuring backward compatibility with core.v1 Event type.
         * @return {@code this}
         */
        public Builder deprecatedCount(java.lang.Number deprecatedCount) {
            this.deprecatedCount = deprecatedCount;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getDeprecatedFirstTimestamp}
         * @param deprecatedFirstTimestamp Deprecated field assuring backward compatibility with core.v1 Event type.
         * @return {@code this}
         */
        public Builder deprecatedFirstTimestamp(java.time.Instant deprecatedFirstTimestamp) {
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getDeprecatedLastTimestamp}
         * @param deprecatedLastTimestamp Deprecated field assuring backward compatibility with core.v1 Event type.
         * @return {@code this}
         */
        public Builder deprecatedLastTimestamp(java.time.Instant deprecatedLastTimestamp) {
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getDeprecatedSource}
         * @param deprecatedSource Deprecated field assuring backward compatibility with core.v1 Event type.
         * @return {@code this}
         */
        public Builder deprecatedSource(imports.k8s.EventSource deprecatedSource) {
            this.deprecatedSource = deprecatedSource;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getNote}
         * @param note Optional.
         *             A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
         * @return {@code this}
         */
        public Builder note(java.lang.String note) {
            this.note = note;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getReason}
         * @param reason Why the action was taken.
         * @return {@code this}
         */
        public Builder reason(java.lang.String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getRegarding}
         * @param regarding The object this Event is about.
         *                  In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
         * @return {@code this}
         */
        public Builder regarding(imports.k8s.ObjectReference regarding) {
            this.regarding = regarding;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getRelated}
         * @param related Optional secondary object for more complex actions.
         *                E.g. when regarding object triggers a creation or deletion of related object.
         * @return {@code this}
         */
        public Builder related(imports.k8s.ObjectReference related) {
            this.related = related;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getReportingController}
         * @param reportingController Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
         * @return {@code this}
         */
        public Builder reportingController(java.lang.String reportingController) {
            this.reportingController = reportingController;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getReportingInstance}
         * @param reportingInstance ID of the controller instance, e.g. `kubelet-xyzf`.
         * @return {@code this}
         */
        public Builder reportingInstance(java.lang.String reportingInstance) {
            this.reportingInstance = reportingInstance;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getSeries}
         * @param series Data about the Event series this event represents or nil if it's a singleton Event.
         * @return {@code this}
         */
        public Builder series(imports.k8s.EventSeries series) {
            this.series = series;
            return this;
        }

        /**
         * Sets the value of {@link KubeEventV1Beta1Props#getType}
         * @param type Type of this event (Normal, Warning), new types could be added in the future.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeEventV1Beta1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeEventV1Beta1Props build() {
            return new Jsii$Proxy(eventTime, action, deprecatedCount, deprecatedFirstTimestamp, deprecatedLastTimestamp, deprecatedSource, metadata, note, reason, regarding, related, reportingController, reportingInstance, series, type);
        }
    }

    /**
     * An implementation for {@link KubeEventV1Beta1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeEventV1Beta1Props {
        private final java.time.Instant eventTime;
        private final java.lang.String action;
        private final java.lang.Number deprecatedCount;
        private final java.time.Instant deprecatedFirstTimestamp;
        private final java.time.Instant deprecatedLastTimestamp;
        private final imports.k8s.EventSource deprecatedSource;
        private final imports.k8s.ObjectMeta metadata;
        private final java.lang.String note;
        private final java.lang.String reason;
        private final imports.k8s.ObjectReference regarding;
        private final imports.k8s.ObjectReference related;
        private final java.lang.String reportingController;
        private final java.lang.String reportingInstance;
        private final imports.k8s.EventSeries series;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.eventTime = software.amazon.jsii.Kernel.get(this, "eventTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.action = software.amazon.jsii.Kernel.get(this, "action", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.deprecatedCount = software.amazon.jsii.Kernel.get(this, "deprecatedCount", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.deprecatedFirstTimestamp = software.amazon.jsii.Kernel.get(this, "deprecatedFirstTimestamp", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.deprecatedLastTimestamp = software.amazon.jsii.Kernel.get(this, "deprecatedLastTimestamp", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.deprecatedSource = software.amazon.jsii.Kernel.get(this, "deprecatedSource", software.amazon.jsii.NativeType.forClass(imports.k8s.EventSource.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.note = software.amazon.jsii.Kernel.get(this, "note", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reason = software.amazon.jsii.Kernel.get(this, "reason", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.regarding = software.amazon.jsii.Kernel.get(this, "regarding", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class));
            this.related = software.amazon.jsii.Kernel.get(this, "related", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectReference.class));
            this.reportingController = software.amazon.jsii.Kernel.get(this, "reportingController", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.reportingInstance = software.amazon.jsii.Kernel.get(this, "reportingInstance", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.series = software.amazon.jsii.Kernel.get(this, "series", software.amazon.jsii.NativeType.forClass(imports.k8s.EventSeries.class));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.time.Instant eventTime, final java.lang.String action, final java.lang.Number deprecatedCount, final java.time.Instant deprecatedFirstTimestamp, final java.time.Instant deprecatedLastTimestamp, final imports.k8s.EventSource deprecatedSource, final imports.k8s.ObjectMeta metadata, final java.lang.String note, final java.lang.String reason, final imports.k8s.ObjectReference regarding, final imports.k8s.ObjectReference related, final java.lang.String reportingController, final java.lang.String reportingInstance, final imports.k8s.EventSeries series, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eventTime = java.util.Objects.requireNonNull(eventTime, "eventTime is required");
            this.action = action;
            this.deprecatedCount = deprecatedCount;
            this.deprecatedFirstTimestamp = deprecatedFirstTimestamp;
            this.deprecatedLastTimestamp = deprecatedLastTimestamp;
            this.deprecatedSource = deprecatedSource;
            this.metadata = metadata;
            this.note = note;
            this.reason = reason;
            this.regarding = regarding;
            this.related = related;
            this.reportingController = reportingController;
            this.reportingInstance = reportingInstance;
            this.series = series;
            this.type = type;
        }

        @Override
        public final java.time.Instant getEventTime() {
            return this.eventTime;
        }

        @Override
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override
        public final java.lang.Number getDeprecatedCount() {
            return this.deprecatedCount;
        }

        @Override
        public final java.time.Instant getDeprecatedFirstTimestamp() {
            return this.deprecatedFirstTimestamp;
        }

        @Override
        public final java.time.Instant getDeprecatedLastTimestamp() {
            return this.deprecatedLastTimestamp;
        }

        @Override
        public final imports.k8s.EventSource getDeprecatedSource() {
            return this.deprecatedSource;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.lang.String getNote() {
            return this.note;
        }

        @Override
        public final java.lang.String getReason() {
            return this.reason;
        }

        @Override
        public final imports.k8s.ObjectReference getRegarding() {
            return this.regarding;
        }

        @Override
        public final imports.k8s.ObjectReference getRelated() {
            return this.related;
        }

        @Override
        public final java.lang.String getReportingController() {
            return this.reportingController;
        }

        @Override
        public final java.lang.String getReportingInstance() {
            return this.reportingInstance;
        }

        @Override
        public final imports.k8s.EventSeries getSeries() {
            return this.series;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("eventTime", om.valueToTree(this.getEventTime()));
            if (this.getAction() != null) {
                data.set("action", om.valueToTree(this.getAction()));
            }
            if (this.getDeprecatedCount() != null) {
                data.set("deprecatedCount", om.valueToTree(this.getDeprecatedCount()));
            }
            if (this.getDeprecatedFirstTimestamp() != null) {
                data.set("deprecatedFirstTimestamp", om.valueToTree(this.getDeprecatedFirstTimestamp()));
            }
            if (this.getDeprecatedLastTimestamp() != null) {
                data.set("deprecatedLastTimestamp", om.valueToTree(this.getDeprecatedLastTimestamp()));
            }
            if (this.getDeprecatedSource() != null) {
                data.set("deprecatedSource", om.valueToTree(this.getDeprecatedSource()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getNote() != null) {
                data.set("note", om.valueToTree(this.getNote()));
            }
            if (this.getReason() != null) {
                data.set("reason", om.valueToTree(this.getReason()));
            }
            if (this.getRegarding() != null) {
                data.set("regarding", om.valueToTree(this.getRegarding()));
            }
            if (this.getRelated() != null) {
                data.set("related", om.valueToTree(this.getRelated()));
            }
            if (this.getReportingController() != null) {
                data.set("reportingController", om.valueToTree(this.getReportingController()));
            }
            if (this.getReportingInstance() != null) {
                data.set("reportingInstance", om.valueToTree(this.getReportingInstance()));
            }
            if (this.getSeries() != null) {
                data.set("series", om.valueToTree(this.getSeries()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeEventV1Beta1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeEventV1Beta1Props.Jsii$Proxy that = (KubeEventV1Beta1Props.Jsii$Proxy) o;

            if (!eventTime.equals(that.eventTime)) return false;
            if (this.action != null ? !this.action.equals(that.action) : that.action != null) return false;
            if (this.deprecatedCount != null ? !this.deprecatedCount.equals(that.deprecatedCount) : that.deprecatedCount != null) return false;
            if (this.deprecatedFirstTimestamp != null ? !this.deprecatedFirstTimestamp.equals(that.deprecatedFirstTimestamp) : that.deprecatedFirstTimestamp != null) return false;
            if (this.deprecatedLastTimestamp != null ? !this.deprecatedLastTimestamp.equals(that.deprecatedLastTimestamp) : that.deprecatedLastTimestamp != null) return false;
            if (this.deprecatedSource != null ? !this.deprecatedSource.equals(that.deprecatedSource) : that.deprecatedSource != null) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            if (this.note != null ? !this.note.equals(that.note) : that.note != null) return false;
            if (this.reason != null ? !this.reason.equals(that.reason) : that.reason != null) return false;
            if (this.regarding != null ? !this.regarding.equals(that.regarding) : that.regarding != null) return false;
            if (this.related != null ? !this.related.equals(that.related) : that.related != null) return false;
            if (this.reportingController != null ? !this.reportingController.equals(that.reportingController) : that.reportingController != null) return false;
            if (this.reportingInstance != null ? !this.reportingInstance.equals(that.reportingInstance) : that.reportingInstance != null) return false;
            if (this.series != null ? !this.series.equals(that.series) : that.series != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.eventTime.hashCode();
            result = 31 * result + (this.action != null ? this.action.hashCode() : 0);
            result = 31 * result + (this.deprecatedCount != null ? this.deprecatedCount.hashCode() : 0);
            result = 31 * result + (this.deprecatedFirstTimestamp != null ? this.deprecatedFirstTimestamp.hashCode() : 0);
            result = 31 * result + (this.deprecatedLastTimestamp != null ? this.deprecatedLastTimestamp.hashCode() : 0);
            result = 31 * result + (this.deprecatedSource != null ? this.deprecatedSource.hashCode() : 0);
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.note != null ? this.note.hashCode() : 0);
            result = 31 * result + (this.reason != null ? this.reason.hashCode() : 0);
            result = 31 * result + (this.regarding != null ? this.regarding.hashCode() : 0);
            result = 31 * result + (this.related != null ? this.related.hashCode() : 0);
            result = 31 * result + (this.reportingController != null ? this.reportingController.hashCode() : 0);
            result = 31 * result + (this.reportingInstance != null ? this.reportingInstance.hashCode() : 0);
            result = 31 * result + (this.series != null ? this.series.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
