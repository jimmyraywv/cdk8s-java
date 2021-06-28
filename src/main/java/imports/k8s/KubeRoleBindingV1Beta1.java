package imports.k8s;

/**
 * RoleBinding references a role, but does not contain it.
 * <p>
 * It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:36.017Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeRoleBindingV1Beta1")
public class KubeRoleBindingV1Beta1 extends org.cdk8s.ApiObject {

    protected KubeRoleBindingV1Beta1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeRoleBindingV1Beta1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeRoleBindingV1Beta1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.rbac.v1beta1.RoleBinding" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeRoleBindingV1Beta1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeRoleBindingV1Beta1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.rbac.v1beta1.RoleBinding".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeRoleBindingV1Beta1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeRoleBindingV1Beta1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.rbac.v1beta1.RoleBinding".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeRoleBindingV1Beta1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeRoleBindingV1Beta1> {
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
        private final imports.k8s.KubeRoleBindingV1Beta1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeRoleBindingV1Beta1Props.Builder();
        }

        /**
         * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace.
         * <p>
         * If the RoleRef cannot be resolved, the Authorizer must return an error.
         * <p>
         * @return {@code this}
         * @param roleRef RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. This parameter is required.
         */
        public Builder roleRef(final imports.k8s.RoleRef roleRef) {
            this.props.roleRef(roleRef);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.props.metadata(metadata);
            return this;
        }

        /**
         * Subjects holds references to the objects the role applies to.
         * <p>
         * @return {@code this}
         * @param subjects Subjects holds references to the objects the role applies to. This parameter is required.
         */
        public Builder subjects(final java.util.List<? extends imports.k8s.Subject> subjects) {
            this.props.subjects(subjects);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeRoleBindingV1Beta1}.
         */
        @Override
        public imports.k8s.KubeRoleBindingV1Beta1 build() {
            return new imports.k8s.KubeRoleBindingV1Beta1(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
