package imports.k8s;

/**
 * RuntimeClassSpec is a specification of a RuntimeClass.
 * <p>
 * It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:36.095Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RuntimeClassSpec")
@software.amazon.jsii.Jsii.Proxy(RuntimeClassSpec.Jsii$Proxy.class)
public interface RuntimeClassSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class.
     * <p>
     * The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRuntimeHandler();

    /**
     * @return a {@link Builder} of {@link RuntimeClassSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RuntimeClassSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RuntimeClassSpec> {
        private java.lang.String runtimeHandler;

        /**
         * Sets the value of {@link RuntimeClassSpec#getRuntimeHandler}
         * @param runtimeHandler RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. This parameter is required.
         *                       The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called "runc" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
         * @return {@code this}
         */
        public Builder runtimeHandler(java.lang.String runtimeHandler) {
            this.runtimeHandler = runtimeHandler;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RuntimeClassSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RuntimeClassSpec build() {
            return new Jsii$Proxy(runtimeHandler);
        }
    }

    /**
     * An implementation for {@link RuntimeClassSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RuntimeClassSpec {
        private final java.lang.String runtimeHandler;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.runtimeHandler = software.amazon.jsii.Kernel.get(this, "runtimeHandler", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String runtimeHandler) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.runtimeHandler = java.util.Objects.requireNonNull(runtimeHandler, "runtimeHandler is required");
        }

        @Override
        public final java.lang.String getRuntimeHandler() {
            return this.runtimeHandler;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("runtimeHandler", om.valueToTree(this.getRuntimeHandler()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RuntimeClassSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RuntimeClassSpec.Jsii$Proxy that = (RuntimeClassSpec.Jsii$Proxy) o;

            return this.runtimeHandler.equals(that.runtimeHandler);
        }

        @Override
        public final int hashCode() {
            int result = this.runtimeHandler.hashCode();
            return result;
        }
    }
}
