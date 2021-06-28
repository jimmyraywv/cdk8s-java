package imports.k8s;

/**
 * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:35.896Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.EventSeries")
@software.amazon.jsii.Jsii.Proxy(EventSeries.Jsii$Proxy.class)
public interface EventSeries extends software.amazon.jsii.JsiiSerializable {

    /**
     * Number of occurrences in this series up to the last heartbeat time.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getCount();

    /**
     * Time when last Event from the series was seen before last heartbeat.
     */
    @org.jetbrains.annotations.NotNull java.time.Instant getLastObservedTime();

    /**
     * Information whether this series is ongoing or finished.
     * <p>
     * Deprecated. Planned removal for 1.18
     */
    @org.jetbrains.annotations.NotNull java.lang.String getState();

    /**
     * @return a {@link Builder} of {@link EventSeries}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link EventSeries}
     */
    public static final class Builder implements software.amazon.jsii.Builder<EventSeries> {
        private java.lang.Number count;
        private java.time.Instant lastObservedTime;
        private java.lang.String state;

        /**
         * Sets the value of {@link EventSeries#getCount}
         * @param count Number of occurrences in this series up to the last heartbeat time. This parameter is required.
         * @return {@code this}
         */
        public Builder count(java.lang.Number count) {
            this.count = count;
            return this;
        }

        /**
         * Sets the value of {@link EventSeries#getLastObservedTime}
         * @param lastObservedTime Time when last Event from the series was seen before last heartbeat. This parameter is required.
         * @return {@code this}
         */
        public Builder lastObservedTime(java.time.Instant lastObservedTime) {
            this.lastObservedTime = lastObservedTime;
            return this;
        }

        /**
         * Sets the value of {@link EventSeries#getState}
         * @param state Information whether this series is ongoing or finished. This parameter is required.
         *              Deprecated. Planned removal for 1.18
         * @return {@code this}
         */
        public Builder state(java.lang.String state) {
            this.state = state;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link EventSeries}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public EventSeries build() {
            return new Jsii$Proxy(count, lastObservedTime, state);
        }
    }

    /**
     * An implementation for {@link EventSeries}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements EventSeries {
        private final java.lang.Number count;
        private final java.time.Instant lastObservedTime;
        private final java.lang.String state;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.count = software.amazon.jsii.Kernel.get(this, "count", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.lastObservedTime = software.amazon.jsii.Kernel.get(this, "lastObservedTime", software.amazon.jsii.NativeType.forClass(java.time.Instant.class));
            this.state = software.amazon.jsii.Kernel.get(this, "state", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number count, final java.time.Instant lastObservedTime, final java.lang.String state) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.count = java.util.Objects.requireNonNull(count, "count is required");
            this.lastObservedTime = java.util.Objects.requireNonNull(lastObservedTime, "lastObservedTime is required");
            this.state = java.util.Objects.requireNonNull(state, "state is required");
        }

        @Override
        public final java.lang.Number getCount() {
            return this.count;
        }

        @Override
        public final java.time.Instant getLastObservedTime() {
            return this.lastObservedTime;
        }

        @Override
        public final java.lang.String getState() {
            return this.state;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("count", om.valueToTree(this.getCount()));
            data.set("lastObservedTime", om.valueToTree(this.getLastObservedTime()));
            data.set("state", om.valueToTree(this.getState()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.EventSeries"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EventSeries.Jsii$Proxy that = (EventSeries.Jsii$Proxy) o;

            if (!count.equals(that.count)) return false;
            if (!lastObservedTime.equals(that.lastObservedTime)) return false;
            return this.state.equals(that.state);
        }

        @Override
        public final int hashCode() {
            int result = this.count.hashCode();
            result = 31 * result + (this.lastObservedTime.hashCode());
            result = 31 * result + (this.state.hashCode());
            return result;
        }
    }
}
