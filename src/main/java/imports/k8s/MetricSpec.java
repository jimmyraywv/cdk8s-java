package imports.k8s;

/**
 * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:36.055Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MetricSpec")
@software.amazon.jsii.Jsii.Proxy(MetricSpec.Jsii$Proxy.class)
public interface MetricSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * type is the type of metric source.
     * <p>
     * It should be one of "Object", "Pods" or "Resource", each mapping to a matching field in the object.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * external refers to a global metric that is not associated with any Kubernetes object.
     * <p>
     * It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ExternalMetricSource getExternal() {
        return null;
    }

    /**
     * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMetricSource getObject() {
        return null;
    }

    /**
     * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
     * <p>
     * The values will be averaged together before being compared to the target value.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodsMetricSource getPods() {
        return null;
    }

    /**
     * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ResourceMetricSource getResource() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetricSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetricSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetricSpec> {
        private java.lang.String type;
        private imports.k8s.ExternalMetricSource external;
        private imports.k8s.ObjectMetricSource object;
        private imports.k8s.PodsMetricSource pods;
        private imports.k8s.ResourceMetricSource resource;

        /**
         * Sets the value of {@link MetricSpec#getType}
         * @param type type is the type of metric source. This parameter is required.
         *             It should be one of "Object", "Pods" or "Resource", each mapping to a matching field in the object.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpec#getExternal}
         * @param external external refers to a global metric that is not associated with any Kubernetes object.
         *                 It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
         * @return {@code this}
         */
        public Builder external(imports.k8s.ExternalMetricSource external) {
            this.external = external;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpec#getObject}
         * @param object object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
         * @return {@code this}
         */
        public Builder object(imports.k8s.ObjectMetricSource object) {
            this.object = object;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpec#getPods}
         * @param pods pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).
         *             The values will be averaged together before being compared to the target value.
         * @return {@code this}
         */
        public Builder pods(imports.k8s.PodsMetricSource pods) {
            this.pods = pods;
            return this;
        }

        /**
         * Sets the value of {@link MetricSpec#getResource}
         * @param resource resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
         * @return {@code this}
         */
        public Builder resource(imports.k8s.ResourceMetricSource resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetricSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetricSpec build() {
            return new Jsii$Proxy(type, external, object, pods, resource);
        }
    }

    /**
     * An implementation for {@link MetricSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetricSpec {
        private final java.lang.String type;
        private final imports.k8s.ExternalMetricSource external;
        private final imports.k8s.ObjectMetricSource object;
        private final imports.k8s.PodsMetricSource pods;
        private final imports.k8s.ResourceMetricSource resource;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.external = software.amazon.jsii.Kernel.get(this, "external", software.amazon.jsii.NativeType.forClass(imports.k8s.ExternalMetricSource.class));
            this.object = software.amazon.jsii.Kernel.get(this, "object", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMetricSource.class));
            this.pods = software.amazon.jsii.Kernel.get(this, "pods", software.amazon.jsii.NativeType.forClass(imports.k8s.PodsMetricSource.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(imports.k8s.ResourceMetricSource.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String type, final imports.k8s.ExternalMetricSource external, final imports.k8s.ObjectMetricSource object, final imports.k8s.PodsMetricSource pods, final imports.k8s.ResourceMetricSource resource) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(type, "type is required");
            this.external = external;
            this.object = object;
            this.pods = pods;
            this.resource = resource;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final imports.k8s.ExternalMetricSource getExternal() {
            return this.external;
        }

        @Override
        public final imports.k8s.ObjectMetricSource getObject() {
            return this.object;
        }

        @Override
        public final imports.k8s.PodsMetricSource getPods() {
            return this.pods;
        }

        @Override
        public final imports.k8s.ResourceMetricSource getResource() {
            return this.resource;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getExternal() != null) {
                data.set("external", om.valueToTree(this.getExternal()));
            }
            if (this.getObject() != null) {
                data.set("object", om.valueToTree(this.getObject()));
            }
            if (this.getPods() != null) {
                data.set("pods", om.valueToTree(this.getPods()));
            }
            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.MetricSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetricSpec.Jsii$Proxy that = (MetricSpec.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.external != null ? !this.external.equals(that.external) : that.external != null) return false;
            if (this.object != null ? !this.object.equals(that.object) : that.object != null) return false;
            if (this.pods != null ? !this.pods.equals(that.pods) : that.pods != null) return false;
            return this.resource != null ? this.resource.equals(that.resource) : that.resource == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.external != null ? this.external.hashCode() : 0);
            result = 31 * result + (this.object != null ? this.object.hashCode() : 0);
            result = 31 * result + (this.pods != null ? this.pods.hashCode() : 0);
            result = 31 * result + (this.resource != null ? this.resource.hashCode() : 0);
            return result;
        }
    }
}
