package io.jimmyray.app;

import imports.k8s.*;
import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartProps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartProps options) {
        super(scope, id, options);

        Map<String,String> labelsMap = Map.of("app","cdk8s-read-only","env","dev", "owner", "jimmy");

        ObjectMeta nsMeta = ObjectMeta.builder()
                .name("cdk8s-read-only")
                .labels(labelsMap)
                .build();

        KubeNamespace.Builder.create(this,"cdk8s-ns")
                .metadata(nsMeta)
                .build();

        // LoadBalancer Service
        final String serviceType = "LoadBalancer";
        final Map<String, String> selector = new HashMap<>();
        selector.put("app", "cdk8s-read-only");
        final List<ServicePort> servicePorts = new ArrayList<>();
        final ServicePort servicePort = new ServicePort.Builder()
                .port(80)
                .targetPort(IntOrString.fromNumber(8080))
                .build();
        servicePorts.add(servicePort);
        final ServiceSpec serviceSpec = new ServiceSpec.Builder()
                .type(serviceType)
                .selector(selector)
                .ports(servicePorts)
                .build();
        final KubeServiceProps serviceProps = new KubeServiceProps.Builder()
                .metadata(
                        ObjectMeta.builder().name("cdk8s-read-only")
                        .namespace("cdk8s-read-only")
                        .labels(labelsMap)
                        .build()
                )
                .spec(serviceSpec)
                .build();

        new KubeService(this, "service", serviceProps);

        // Deployment
        final LabelSelector labelSelector = new LabelSelector.Builder().matchLabels(selector).build();
        final ObjectMeta templateMeta = new ObjectMeta.Builder()
                .labels(labelsMap).build();
        final ObjectMeta deployMeta = new ObjectMeta.Builder().namespace("cdk8s-read-only")
                .labels(labelsMap).name("cdk8s-read-only").build();
        final List<ContainerPort> containerPorts = new ArrayList<>();
        final ContainerPort containerPort = new ContainerPort.Builder()
                .containerPort(8080)
                .build();
        containerPorts.add(containerPort);
        final List<Container> containers = new ArrayList<>();
        final Container container = new Container.Builder()
                .name("cdk8s-read-only")
                .image("public.ecr.aws/r2l1x4g2/go-http-server:v0.1.0-23ffe0a715")
                .ports(containerPorts)
                .build();
        containers.add(container);
        final PodSpec podSpec = new PodSpec.Builder()
                .containers(containers)
                .build();
        final PodTemplateSpec podTemplateSpec = new PodTemplateSpec.Builder()
                .metadata(templateMeta)
                .spec(podSpec)
                .build();
        final DeploymentSpec deploymentSpec = new DeploymentSpec.Builder()
                .replicas(1)
                .selector(labelSelector)
                .template(podTemplateSpec)
                .revisionHistoryLimit(3)
                .build();
        final KubeDeploymentProps deploymentProps = new KubeDeploymentProps.Builder()
                .metadata(deployMeta)
                .spec(deploymentSpec)
                .build();

        new KubeDeployment(this, "deployment", deploymentProps);
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "tmp");
        app.synth();
    }
}