package imports.k8s;

/**
 * Eviction evicts a pod from its node subject to certain policies and safety constraints.
 * <p>
 * This is a subresource of Pod.  A request to cause such an eviction is created by POSTing to .../pods/<pod name>/evictions.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:35.967Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEvictionV1Beta1Props")
@software.amazon.jsii.Jsii.Proxy(KubeEvictionV1Beta1Props.Jsii$Proxy.class)
public interface KubeEvictionV1Beta1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * DeleteOptions may be provided.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.DeleteOptions getDeleteOptions() {
        return null;
    }

    /**
     * ObjectMeta describes the pod that is being evicted.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeEvictionV1Beta1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeEvictionV1Beta1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeEvictionV1Beta1Props> {
        private imports.k8s.DeleteOptions deleteOptions;
        private imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubeEvictionV1Beta1Props#getDeleteOptions}
         * @param deleteOptions DeleteOptions may be provided.
         * @return {@code this}
         */
        public Builder deleteOptions(imports.k8s.DeleteOptions deleteOptions) {
            this.deleteOptions = deleteOptions;
            return this;
        }

        /**
         * Sets the value of {@link KubeEvictionV1Beta1Props#getMetadata}
         * @param metadata ObjectMeta describes the pod that is being evicted.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeEvictionV1Beta1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeEvictionV1Beta1Props build() {
            return new Jsii$Proxy(deleteOptions, metadata);
        }
    }

    /**
     * An implementation for {@link KubeEvictionV1Beta1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeEvictionV1Beta1Props {
        private final imports.k8s.DeleteOptions deleteOptions;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.deleteOptions = software.amazon.jsii.Kernel.get(this, "deleteOptions", software.amazon.jsii.NativeType.forClass(imports.k8s.DeleteOptions.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.DeleteOptions deleteOptions, final imports.k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.deleteOptions = deleteOptions;
            this.metadata = metadata;
        }

        @Override
        public final imports.k8s.DeleteOptions getDeleteOptions() {
            return this.deleteOptions;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDeleteOptions() != null) {
                data.set("deleteOptions", om.valueToTree(this.getDeleteOptions()));
            }
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeEvictionV1Beta1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeEvictionV1Beta1Props.Jsii$Proxy that = (KubeEvictionV1Beta1Props.Jsii$Proxy) o;

            if (this.deleteOptions != null ? !this.deleteOptions.equals(that.deleteOptions) : that.deleteOptions != null) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.deleteOptions != null ? this.deleteOptions.hashCode() : 0;
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
