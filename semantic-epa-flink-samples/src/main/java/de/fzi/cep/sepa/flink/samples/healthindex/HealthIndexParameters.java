package de.fzi.cep.sepa.flink.samples.healthindex;

import de.fzi.cep.sepa.model.impl.graph.SepaInvocation;
import de.fzi.cep.sepa.runtime.param.BindingParameters;

/**
 * Created by riemer on 17.10.2016.
 */
public class HealthIndexParameters extends BindingParameters {

    private String frictionMapping;
    private String machineTypeMapping;
    private String timestampMapping;

    private HealthIndexVariables healthIndexVariables;

    public HealthIndexParameters(SepaInvocation graph, String frictionMapping, String timestampMapping, String machineTypeMapping, HealthIndexVariables healthIndexVariables) {
        super(graph);
        this.frictionMapping = frictionMapping;
        this.healthIndexVariables = healthIndexVariables;
        this.machineTypeMapping = machineTypeMapping;
        this.timestampMapping = timestampMapping;
    }


    public String getFrictionMapping() {
        return frictionMapping;
    }

    public void setFrictionMapping(String frictionMapping) {
        this.frictionMapping = frictionMapping;
    }

    public HealthIndexVariables getHealthIndexVariables() {
        return healthIndexVariables;
    }

    public void setHealthIndexVariables(HealthIndexVariables healthIndexVariables) {
        this.healthIndexVariables = healthIndexVariables;
    }

    public String getMachineTypeMapping() {
        return machineTypeMapping;
    }

    public void setMachineTypeMapping(String machineTypeMapping) {
        this.machineTypeMapping = machineTypeMapping;
    }

    public String getTimestampMapping() {
        return timestampMapping;
    }

    public void setTimestampMapping(String timestampMapping) {
        this.timestampMapping = timestampMapping;
    }
}