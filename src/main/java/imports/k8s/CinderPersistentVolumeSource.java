package imports.k8s;

/**
 * Represents a cinder volume resource in Openstack.
 * <p>
 * A Cinder volume must exist before mounting to a container. The volume must also be in the same region as the kubelet. Cinder volumes support ownership management and SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.30.0 (build adae23f)", date = "2021-06-28T03:55:35.865Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CinderPersistentVolumeSource")
@software.amazon.jsii.Jsii.Proxy(CinderPersistentVolumeSource.Jsii$Proxy.class)
public interface CinderPersistentVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * volume id used to identify the volume in cinder More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeID();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Optional: Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Optional: points to a secret object containing parameters used to connect to OpenStack.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.SecretReference getSecretRef() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CinderPersistentVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CinderPersistentVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CinderPersistentVolumeSource> {
        private java.lang.String volumeId;
        private java.lang.String fsType;
        private java.lang.Boolean readOnly;
        private imports.k8s.SecretReference secretRef;

        /**
         * Sets the value of {@link CinderPersistentVolumeSource#getVolumeId}
         * @param volumeId volume id used to identify the volume in cinder More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md. This parameter is required.
         * @return {@code this}
         */
        public Builder volumeId(java.lang.String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        /**
         * Sets the value of {@link CinderPersistentVolumeSource#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link CinderPersistentVolumeSource#getReadOnly}
         * @param readOnly Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link CinderPersistentVolumeSource#getSecretRef}
         * @param secretRef Optional: points to a secret object containing parameters used to connect to OpenStack.
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.SecretReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CinderPersistentVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CinderPersistentVolumeSource build() {
            return new Jsii$Proxy(volumeId, fsType, readOnly, secretRef);
        }
    }

    /**
     * An implementation for {@link CinderPersistentVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CinderPersistentVolumeSource {
        private final java.lang.String volumeId;
        private final java.lang.String fsType;
        private final java.lang.Boolean readOnly;
        private final imports.k8s.SecretReference secretRef;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumeId = software.amazon.jsii.Kernel.get(this, "volumeID", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readOnly = software.amazon.jsii.Kernel.get(this, "readOnly", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.secretRef = software.amazon.jsii.Kernel.get(this, "secretRef", software.amazon.jsii.NativeType.forClass(imports.k8s.SecretReference.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String volumeId, final java.lang.String fsType, final java.lang.Boolean readOnly, final imports.k8s.SecretReference secretRef) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumeId = java.util.Objects.requireNonNull(volumeId, "volumeId is required");
            this.fsType = fsType;
            this.readOnly = readOnly;
            this.secretRef = secretRef;
        }

        @Override
        public final java.lang.String getVolumeID() {
            return this.volumeId;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public final java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public final imports.k8s.SecretReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("volumeID", om.valueToTree(this.getVolumeID()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CinderPersistentVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CinderPersistentVolumeSource.Jsii$Proxy that = (CinderPersistentVolumeSource.Jsii$Proxy) o;

            if (!volumeId.equals(that.volumeId)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            return this.secretRef != null ? this.secretRef.equals(that.secretRef) : that.secretRef == null;
        }

        @Override
        public final int hashCode() {
            int result = this.volumeId.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            return result;
        }
    }
}
