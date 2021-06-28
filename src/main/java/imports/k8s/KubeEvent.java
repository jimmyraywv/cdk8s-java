package imports.k8s;

/**
 * Event is a report of an event somewhere in the cluster.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:35.959Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEvent")
public class KubeEvent extends org.cdk8s.ApiObject {

    protected KubeEvent(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeEvent(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeEvent.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.core.v1.Event" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeEvent(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeEventProps props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.core.v1.Event".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeEventProps props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeEvent.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.core.v1.Event".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeEvent}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeEvent> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param id a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String id) {
            return new Builder(scope, id);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String id;
        private final imports.k8s.KubeEventProps.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeEventProps.Builder();
        }

        /**
         * The object that this event is about.
         * <p>
         * @return {@code this}
         * @param involvedObject The object that this event is about. This parameter is required.
         */
        public Builder involvedObject(final imports.k8s.ObjectReference involvedObject) {
            this.props.involvedObject(involvedObject);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * What action was taken/failed regarding to the Regarding object.
         * <p>
         * @return {@code this}
         * @param action What action was taken/failed regarding to the Regarding object. This parameter is required.
         */
        public Builder action(final java.lang.String action) {
            this.props.action(action);
            return this;
        }

        /**
         * The number of times this event has occurred.
         * <p>
         * @return {@code this}
         * @param count The number of times this event has occurred. This parameter is required.
         */
        public Builder count(final java.lang.Number count) {
            this.props.count(count);
            return this;
        }

        /**
         * Time when this Event was first observed.
         * <p>
         * @return {@code this}
         * @param eventTime Time when this Event was first observed. This parameter is required.
         */
        public Builder eventTime(final java.time.Instant eventTime) {
            this.props.eventTime(eventTime);
            return this;
        }

        /**
         * The time at which the event was first recorded.
         * <p>
         * (Time of server receipt is in TypeMeta.)
         * <p>
         * @return {@code this}
         * @param firstTimestamp The time at which the event was first recorded. This parameter is required.
         */
        public Builder firstTimestamp(final java.time.Instant firstTimestamp) {
            this.props.firstTimestamp(firstTimestamp);
            return this;
        }

        /**
         * The time at which the most recent occurrence of this event was recorded.
         * <p>
         * @return {@code this}
         * @param lastTimestamp The time at which the most recent occurrence of this event was recorded. This parameter is required.
         */
        public Builder lastTimestamp(final java.time.Instant lastTimestamp) {
            this.props.lastTimestamp(lastTimestamp);
            return this;
        }

        /**
         * A human-readable description of the status of this operation.
         * <p>
         * @return {@code this}
         * @param message A human-readable description of the status of this operation. This parameter is required.
         */
        public Builder message(final java.lang.String message) {
            this.props.message(message);
            return this;
        }

        /**
         * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
         * <p>
         * @return {@code this}
         * @param reason This should be a short, machine understandable string that gives the reason for the transition into the object's current status. This parameter is required.
         */
        public Builder reason(final java.lang.String reason) {
            this.props.reason(reason);
            return this;
        }

        /**
         * Optional secondary object for more complex actions.
         * <p>
         * @return {@code this}
         * @param related Optional secondary object for more complex actions. This parameter is required.
         */
        public Builder related(final imports.k8s.ObjectReference related) {
            this.props.related(related);
            return this;
        }

        /**
         * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
         * <p>
         * @return {@code this}
         * @param reportingComponent Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This parameter is required.
         */
        public Builder reportingComponent(final java.lang.String reportingComponent) {
            this.props.reportingComponent(reportingComponent);
            return this;
        }

        /**
         * ID of the controller instance, e.g. `kubelet-xyzf`.
         * <p>
         * @return {@code this}
         * @param reportingInstance ID of the controller instance, e.g. `kubelet-xyzf`. This parameter is required.
         */
        public Builder reportingInstance(final java.lang.String reportingInstance) {
            this.props.reportingInstance(reportingInstance);
            return this;
        }

        /**
         * Data about the Event series this event represents or nil if it's a singleton Event.
         * <p>
         * @return {@code this}
         * @param series Data about the Event series this event represents or nil if it's a singleton Event. This parameter is required.
         */
        public Builder series(final imports.k8s.EventSeries series) {
            this.props.series(series);
            return this;
        }

        /**
         * The component reporting this event.
         * <p>
         * Should be a short machine understandable string.
         * <p>
         * @return {@code this}
         * @param source The component reporting this event. This parameter is required.
         */
        public Builder source(final imports.k8s.EventSource source) {
            this.props.source(source);
            return this;
        }

        /**
         * Type of this event (Normal, Warning), new types could be added in the future.
         * <p>
         * @return {@code this}
         * @param type Type of this event (Normal, Warning), new types could be added in the future. This parameter is required.
         */
        public Builder type(final java.lang.String type) {
            this.props.type(type);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeEvent}.
         */
        @Override
        public imports.k8s.KubeEvent build() {
            return new imports.k8s.KubeEvent(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
