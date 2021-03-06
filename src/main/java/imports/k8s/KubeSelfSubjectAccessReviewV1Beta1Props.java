package imports.k8s;

/**
 * SelfSubjectAccessReview checks whether or the current user can perform an action.
 * <p>
 * Not filling in a spec.namespace means "in all namespaces".  Self is a special case, because users should always be able to check whether they can perform an action
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:36.025Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeSelfSubjectAccessReviewV1Beta1Props")
@software.amazon.jsii.Jsii.Proxy(KubeSelfSubjectAccessReviewV1Beta1Props.Jsii$Proxy.class)
public interface KubeSelfSubjectAccessReviewV1Beta1Props extends software.amazon.jsii.JsiiSerializable {

    /**
     * Spec holds information about the request being evaluated.
     * <p>
     * user and groups must be empty
     */
    @org.jetbrains.annotations.NotNull imports.k8s.SelfSubjectAccessReviewSpec getSpec();

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link KubeSelfSubjectAccessReviewV1Beta1Props}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link KubeSelfSubjectAccessReviewV1Beta1Props}
     */
    public static final class Builder implements software.amazon.jsii.Builder<KubeSelfSubjectAccessReviewV1Beta1Props> {
        private imports.k8s.SelfSubjectAccessReviewSpec spec;
        private imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link KubeSelfSubjectAccessReviewV1Beta1Props#getSpec}
         * @param spec Spec holds information about the request being evaluated. This parameter is required.
         *             user and groups must be empty
         * @return {@code this}
         */
        public Builder spec(imports.k8s.SelfSubjectAccessReviewSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link KubeSelfSubjectAccessReviewV1Beta1Props#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link KubeSelfSubjectAccessReviewV1Beta1Props}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public KubeSelfSubjectAccessReviewV1Beta1Props build() {
            return new Jsii$Proxy(spec, metadata);
        }
    }

    /**
     * An implementation for {@link KubeSelfSubjectAccessReviewV1Beta1Props}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements KubeSelfSubjectAccessReviewV1Beta1Props {
        private final imports.k8s.SelfSubjectAccessReviewSpec spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = software.amazon.jsii.Kernel.get(this, "spec", software.amazon.jsii.NativeType.forClass(imports.k8s.SelfSubjectAccessReviewSpec.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final imports.k8s.SelfSubjectAccessReviewSpec spec, final imports.k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(spec, "spec is required");
            this.metadata = metadata;
        }

        @Override
        public final imports.k8s.SelfSubjectAccessReviewSpec getSpec() {
            return this.spec;
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

            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.KubeSelfSubjectAccessReviewV1Beta1Props"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            KubeSelfSubjectAccessReviewV1Beta1Props.Jsii$Proxy that = (KubeSelfSubjectAccessReviewV1Beta1Props.Jsii$Proxy) o;

            if (!spec.equals(that.spec)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public final int hashCode() {
            int result = this.spec.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
