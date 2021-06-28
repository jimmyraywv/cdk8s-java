package imports.k8s;

/**
 * SubjectAccessReview checks whether or not a user or group can perform an action.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:36.036Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeSubjectAccessReviewV1Beta1")
public class KubeSubjectAccessReviewV1Beta1 extends org.cdk8s.ApiObject {

    protected KubeSubjectAccessReviewV1Beta1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeSubjectAccessReviewV1Beta1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeSubjectAccessReviewV1Beta1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.authorization.v1beta1.SubjectAccessReview" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeSubjectAccessReviewV1Beta1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeSubjectAccessReviewV1Beta1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.authorization.v1beta1.SubjectAccessReview".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeSubjectAccessReviewV1Beta1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeSubjectAccessReviewV1Beta1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.authorization.v1beta1.SubjectAccessReview".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeSubjectAccessReviewV1Beta1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeSubjectAccessReviewV1Beta1> {
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
        private final imports.k8s.KubeSubjectAccessReviewV1Beta1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeSubjectAccessReviewV1Beta1Props.Builder();
        }

        /**
         * Spec holds information about the request being evaluated.
         * <p>
         * @return {@code this}
         * @param spec Spec holds information about the request being evaluated. This parameter is required.
         */
        public Builder spec(final imports.k8s.SubjectAccessReviewSpec spec) {
            this.props.spec(spec);
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
         * @returns a newly built instance of {@link imports.k8s.KubeSubjectAccessReviewV1Beta1}.
         */
        @Override
        public imports.k8s.KubeSubjectAccessReviewV1Beta1 build() {
            return new imports.k8s.KubeSubjectAccessReviewV1Beta1(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
