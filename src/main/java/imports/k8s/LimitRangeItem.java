package imports.k8s;

/**
 * LimitRangeItem defines a min/max usage limit for any resource that matches on kind.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:36.052Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.LimitRangeItem")
@software.amazon.jsii.Jsii.Proxy(LimitRangeItem.Jsii$Proxy.class)
public interface LimitRangeItem extends software.amazon.jsii.JsiiSerializable {

    /**
     * Default resource requirement limit value by resource name if resource limit is omitted.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getDefaultValue() {
        return null;
    }

    /**
     * DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getDefaultRequest() {
        return null;
    }

    /**
     * Max usage constraints on this kind by resource name.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getMax() {
        return null;
    }

    /**
     * MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value;
     * <p>
     * this represents the max burst for the named resource.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getMaxLimitRequestRatio() {
        return null;
    }

    /**
     * Min usage constraints on this kind by resource name.
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, imports.k8s.Quantity> getMin() {
        return null;
    }

    /**
     * Type of resource that this limit applies to.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LimitRangeItem}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LimitRangeItem}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LimitRangeItem> {
        private java.util.Map<java.lang.String, imports.k8s.Quantity> defaultValue;
        private java.util.Map<java.lang.String, imports.k8s.Quantity> defaultRequest;
        private java.util.Map<java.lang.String, imports.k8s.Quantity> max;
        private java.util.Map<java.lang.String, imports.k8s.Quantity> maxLimitRequestRatio;
        private java.util.Map<java.lang.String, imports.k8s.Quantity> min;
        private java.lang.String type;

        /**
         * Sets the value of {@link LimitRangeItem#getDefaultValue}
         * @param defaultValue Default resource requirement limit value by resource name if resource limit is omitted.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder defaultValue(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> defaultValue) {
            this.defaultValue = (java.util.Map<java.lang.String, imports.k8s.Quantity>)defaultValue;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeItem#getDefaultRequest}
         * @param defaultRequest DefaultRequest is the default resource requirement request value by resource name if resource request is omitted.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder defaultRequest(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> defaultRequest) {
            this.defaultRequest = (java.util.Map<java.lang.String, imports.k8s.Quantity>)defaultRequest;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeItem#getMax}
         * @param max Max usage constraints on this kind by resource name.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder max(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> max) {
            this.max = (java.util.Map<java.lang.String, imports.k8s.Quantity>)max;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeItem#getMaxLimitRequestRatio}
         * @param maxLimitRequestRatio MaxLimitRequestRatio if specified, the named resource must have a request and limit that are both non-zero where limit divided by request is less than or equal to the enumerated value;.
         *                             this represents the max burst for the named resource.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder maxLimitRequestRatio(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> maxLimitRequestRatio) {
            this.maxLimitRequestRatio = (java.util.Map<java.lang.String, imports.k8s.Quantity>)maxLimitRequestRatio;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeItem#getMin}
         * @param min Min usage constraints on this kind by resource name.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder min(java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> min) {
            this.min = (java.util.Map<java.lang.String, imports.k8s.Quantity>)min;
            return this;
        }

        /**
         * Sets the value of {@link LimitRangeItem#getType}
         * @param type Type of resource that this limit applies to.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LimitRangeItem}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LimitRangeItem build() {
            return new Jsii$Proxy(defaultValue, defaultRequest, max, maxLimitRequestRatio, min, type);
        }
    }

    /**
     * An implementation for {@link LimitRangeItem}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LimitRangeItem {
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> defaultValue;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> defaultRequest;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> max;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> maxLimitRequestRatio;
        private final java.util.Map<java.lang.String, imports.k8s.Quantity> min;
        private final java.lang.String type;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.defaultValue = software.amazon.jsii.Kernel.get(this, "default", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.defaultRequest = software.amazon.jsii.Kernel.get(this, "defaultRequest", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.max = software.amazon.jsii.Kernel.get(this, "max", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.maxLimitRequestRatio = software.amazon.jsii.Kernel.get(this, "maxLimitRequestRatio", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.min = software.amazon.jsii.Kernel.get(this, "min", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Quantity.class)));
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> defaultValue, final java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> defaultRequest, final java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> max, final java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> maxLimitRequestRatio, final java.util.Map<java.lang.String, ? extends imports.k8s.Quantity> min, final java.lang.String type) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.defaultValue = (java.util.Map<java.lang.String, imports.k8s.Quantity>)defaultValue;
            this.defaultRequest = (java.util.Map<java.lang.String, imports.k8s.Quantity>)defaultRequest;
            this.max = (java.util.Map<java.lang.String, imports.k8s.Quantity>)max;
            this.maxLimitRequestRatio = (java.util.Map<java.lang.String, imports.k8s.Quantity>)maxLimitRequestRatio;
            this.min = (java.util.Map<java.lang.String, imports.k8s.Quantity>)min;
            this.type = type;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getDefaultRequest() {
            return this.defaultRequest;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getMax() {
            return this.max;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getMaxLimitRequestRatio() {
            return this.maxLimitRequestRatio;
        }

        @Override
        public final java.util.Map<java.lang.String, imports.k8s.Quantity> getMin() {
            return this.min;
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

            if (this.getDefaultValue() != null) {
                data.set("default", om.valueToTree(this.getDefaultValue()));
            }
            if (this.getDefaultRequest() != null) {
                data.set("defaultRequest", om.valueToTree(this.getDefaultRequest()));
            }
            if (this.getMax() != null) {
                data.set("max", om.valueToTree(this.getMax()));
            }
            if (this.getMaxLimitRequestRatio() != null) {
                data.set("maxLimitRequestRatio", om.valueToTree(this.getMaxLimitRequestRatio()));
            }
            if (this.getMin() != null) {
                data.set("min", om.valueToTree(this.getMin()));
            }
            if (this.getType() != null) {
                data.set("type", om.valueToTree(this.getType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LimitRangeItem"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LimitRangeItem.Jsii$Proxy that = (LimitRangeItem.Jsii$Proxy) o;

            if (this.defaultValue != null ? !this.defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
            if (this.defaultRequest != null ? !this.defaultRequest.equals(that.defaultRequest) : that.defaultRequest != null) return false;
            if (this.max != null ? !this.max.equals(that.max) : that.max != null) return false;
            if (this.maxLimitRequestRatio != null ? !this.maxLimitRequestRatio.equals(that.maxLimitRequestRatio) : that.maxLimitRequestRatio != null) return false;
            if (this.min != null ? !this.min.equals(that.min) : that.min != null) return false;
            return this.type != null ? this.type.equals(that.type) : that.type == null;
        }

        @Override
        public final int hashCode() {
            int result = this.defaultValue != null ? this.defaultValue.hashCode() : 0;
            result = 31 * result + (this.defaultRequest != null ? this.defaultRequest.hashCode() : 0);
            result = 31 * result + (this.max != null ? this.max.hashCode() : 0);
            result = 31 * result + (this.maxLimitRequestRatio != null ? this.maxLimitRequestRatio.hashCode() : 0);
            result = 31 * result + (this.min != null ? this.min.hashCode() : 0);
            result = 31 * result + (this.type != null ? this.type.hashCode() : 0);
            return result;
        }
    }
}
