package optiim.models.api.tickets;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "labels",
        "nodes"
})
public class Option {

    @JsonProperty("labels")
    private Object labels;
    @JsonProperty("nodes")
    private List<Node_> nodes = null;
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
    public List<Node_> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<Node_> nodes) {
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