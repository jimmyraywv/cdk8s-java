package imports.k8s;

/**
 * StorageClass describes the parameters for a class of storage for which PersistentVolumes can be dynamically provisioned.
 * <p>
 * StorageClasses are non-namespaced; the name of the storage class according to etcd is in ObjectMeta.Name.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:36.035Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.KubeStorageClassV1Beta1")
public class KubeStorageClassV1Beta1 extends org.cdk8s.ApiObject {

    protected KubeStorageClassV1Beta1(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected KubeStorageClassV1Beta1(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    static {
        GVK = software.amazon.jsii.JsiiObject.jsiiStaticGet(imports.k8s.KubeStorageClassV1Beta1.class, "GVK", software.amazon.jsii.NativeType.forClass(org.cdk8s.GroupVersionKind.class));
    }

    /**
     * Defines a "io.k8s.api.storage.v1beta1.StorageClass" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param id a scope-local name for the object. This parameter is required.
     * @param props initialization props. This parameter is required.
     */
    public KubeStorageClassV1Beta1(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String id, final @org.jetbrains.annotations.NotNull imports.k8s.KubeStorageClassV1Beta1Props props) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(id, "id is required"), java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Renders a Kubernetes manifest for "io.k8s.api.storage.v1beta1.StorageClass".
     * <p>
     * This can be used to inline resource manifests inside other objects (e.g. as templates).
     * <p>
     * @param props initialization props. This parameter is required.
     */
    public static @org.jetbrains.annotations.NotNull java.lang.Object manifest(final @org.jetbrains.annotations.NotNull imports.k8s.KubeStorageClassV1Beta1Props props) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.KubeStorageClassV1Beta1.class, "manifest", software.amazon.jsii.NativeType.forClass(java.lang.Object.class), new Object[] { java.util.Objects.requireNonNull(props, "props is required") });
    }

    /**
     * Returns the apiVersion and kind for "io.k8s.api.storage.v1beta1.StorageClass".
     */
    public final static org.cdk8s.GroupVersionKind GVK;

    /**
     * A fluent builder for {@link imports.k8s.KubeStorageClassV1Beta1}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.KubeStorageClassV1Beta1> {
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
        private final imports.k8s.KubeStorageClassV1Beta1Props.Builder props;

        private Builder(final software.constructs.Construct scope, final java.lang.String id) {
            this.scope = scope;
            this.id = id;
            this.props = new imports.k8s.KubeStorageClassV1Beta1Props.Builder();
        }

        /**
         * Provisioner indicates the type of the provisioner.
         * <p>
         * @return {@code this}
         * @param provisioner Provisioner indicates the type of the provisioner. This parameter is required.
         */
        public Builder provisioner(final java.lang.String provisioner) {
            this.props.provisioner(provisioner);
            return this;
        }

        /**
         * Restrict the node topologies where volumes can be dynamically provisioned.
         * <p>
         * Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
         * <p>
         * @return {@code this}
         * @param allowedTopologies Restrict the node topologies where volumes can be dynamically provisioned. This parameter is required.
         */
        public Builder allowedTopologies(final java.util.List<? extends imports.k8s.TopologySelectorTerm> allowedTopologies) {
            this.props.allowedTopologies(allowedTopologies);
            return this;
        }

        /**
         * AllowVolumeExpansion shows whether the storage class allow volume expand.
         * <p>
         * @return {@code this}
         * @param allowVolumeExpansion AllowVolumeExpansion shows whether the storage class allow volume expand. This parameter is required.
         */
        public Builder allowVolumeExpansion(final java.lang.Boolean allowVolumeExpansion) {
            this.props.allowVolumeExpansion(allowVolumeExpansion);
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
         * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
         * <p>
         * @return {@code this}
         * @param mountOptions Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid. This parameter is required.
         */
        public Builder mountOptions(final java.util.List<java.lang.String> mountOptions) {
            this.props.mountOptions(mountOptions);
            return this;
        }

        /**
         * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
         * <p>
         * @return {@code this}
         * @param parameters Parameters holds the parameters for the provisioner that should create volumes of this storage class. This parameter is required.
         */
        public Builder parameters(final java.util.Map<java.lang.String, java.lang.String> parameters) {
            this.props.parameters(parameters);
            return this;
        }

        /**
         * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy.
         * <p>
         * Defaults to Delete.
         * <p>
         * Default: Delete.
         * <p>
         * @return {@code this}
         * @param reclaimPolicy Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. This parameter is required.
         */
        public Builder reclaimPolicy(final java.lang.String reclaimPolicy) {
            this.props.reclaimPolicy(reclaimPolicy);
            return this;
        }

        /**
         * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.
         * <p>
         * When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
         * <p>
         * @return {@code this}
         * @param volumeBindingMode VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound. This parameter is required.
         */
        public Builder volumeBindingMode(final java.lang.String volumeBindingMode) {
            this.props.volumeBindingMode(volumeBindingMode);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.KubeStorageClassV1Beta1}.
         */
        @Override
        public imports.k8s.KubeStorageClassV1Beta1 build() {
            return new imports.k8s.KubeStorageClassV1Beta1(
                this.scope,
                this.id,
                this.props.build()
            );
        }
    }
}
