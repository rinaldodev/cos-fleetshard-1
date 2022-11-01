package org.bf2.cos.fleetshard.operator.service.observability;

import io.fabric8.kubernetes.api.model.ConfigMap;
import io.javaoperatorsdk.operator.api.reconciler.*;
import io.javaoperatorsdk.operator.processing.event.source.EventSource;

import java.util.HashMap;
import java.util.Map;

public class ObservabilityController implements Reconciler<ConfigMap>, EventSourceInitializer<ConfigMap> {

    @Override
    public Map<String, EventSource> prepareEventSources(EventSourceContext context) {
        return Map.of();
    }

    @Override
    public UpdateControl<ConfigMap> reconcile(ConfigMap map, Context context) {
        return UpdateControl.noUpdate();
    }

}
