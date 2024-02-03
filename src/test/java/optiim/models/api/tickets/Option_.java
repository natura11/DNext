package optiim.models.api.tickets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "labels",
        "nodes"
})
public class Option_ {

    @JsonProperty("labels")
    private Object labels;
    @JsonProperty("nodes")
    private List<Object> nodes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("labels")
    public Object getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(Object labels) {
        this.labels = labels;
    }

    @JsonProperty("nodes")
    public List<Object> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<Object> nodes) {
        this.nodes = nodes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}