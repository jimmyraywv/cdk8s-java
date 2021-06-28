package imports.k8s;

/**
 * Event is a report of an event somewhere in the cluster.
 * <p>
 * It generally denotes some state change in the system.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:35.965Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeEventV1Beta1")
public class KubeEventV1Beta1 extends org.cdk8s.ApiObject {

    protected KubeEventV1Beta1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeEventV1Beta1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeEventV1Beta1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.events.v1beta1.Event" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeEventV1Beta1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeEventV1Beta1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.events.v1beta1.Event".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeEventV1Beta1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeEventV1Beta1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.events.v1beta1.Event".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeEventV1Beta1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeEventV1Beta1> {
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
        private final imports.k8s.KubeEventV1Beta1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeEventV1Beta1Props.Builder();
        }

        /**
         * Required.
         * <p>
         * Time when this Event was first observed.
         * <p>
         * @return {@code this}
         * @param eventTime Required. This parameter is required.
         */
        public Builder eventTime(final java.time.Instant eventTime) {
            this.props.eventTime(eventTime);
            return this;
        }

        /**
         * What action was taken/failed regarding to the regarding object.
         * <p>
         * @return {@code this}
         * @param action What action was taken/failed regarding to the regarding object. This parameter is required.
         */
        public Builder action(final java.lang.String action) {
            this.props.action(action);
            return this;
        }

        /**
         * Deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedCount Deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedCount(final java.lang.Number deprecatedCount) {
            this.props.deprecatedCount(deprecatedCount);
            return this;
        }

        /**
         * Deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedFirstTimestamp Deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedFirstTimestamp(final java.time.Instant deprecatedFirstTimestamp) {
            this.props.deprecatedFirstTimestamp(deprecatedFirstTimestamp);
            return this;
        }

        /**
         * Deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedLastTimestamp Deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedLastTimestamp(final java.time.Instant deprecatedLastTimestamp) {
            this.props.deprecatedLastTimestamp(deprecatedLastTimestamp);
            return this;
        }

        /**
         * Deprecated field assuring backward compatibility with core.v1 Event type.
         * <p>
         * @return {@code this}
         * @param deprecatedSource Deprecated field assuring backward compatibility with core.v1 Event type. This parameter is required.
         */
        public Builder deprecatedSource(final imports.k8s.EventSource deprecatedSource) {
            this.props.deprecatedSource(deprecatedSource);
            return this;
        }

        /**
         * @return {@code this}
         * @param metadata This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * Optional.
         * <p>
         * A human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
         * <p>
         * @return {@code this}
         * @param note Optional. This parameter is required.
         */
        public Builder note(final java.lang.String note) {
            this.props.note(note);
            return this;
        }

        /**
         * Why the action was taken.
         * <p>
         * @return {@code this}
         * @param reason Why the action was taken. This parameter is required.
         */
        public Builder reason(final java.lang.String reason) {
            this.props.reason(reason);
            return this;
        }

        /**
         * The object this Event is about.
         * <p>
         * In most cases it's an Object reporting controller implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
         * <p>
         * @return {@code this}
         * @param regarding The object this Event is about. This parameter is required.
         */
        public Builder regarding(final imports.k8s.ObjectReference regarding) {
            this.props.regarding(regarding);
            return this;
        }

        /**
         * Optional secondary object for more complex actions.
         * <p>
         * E.g. when regarding object triggers a creation or deletion of related object.
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
         * @param reportingController Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This parameter is required.
         */
        public Builder reportingController(final java.lang.String reportingController) {
            this.props.reportingController(reportingController);
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
         * @returns a newly built instance of {@link imports.k8s.KubeEventV1Beta1}.
         */
        @Override
        public imports.k8s.KubeEventV1Beta1 build() {
            return new imports.k8s.KubeEventV1Beta1(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
