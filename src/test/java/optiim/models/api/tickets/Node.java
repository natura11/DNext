package optiim.models.api.tickets;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "type",
        "required_for_agent",
        "labels_for_form_field",
        "options"
})
public class Node {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("required_for_agent")
    private Object requiredForAgent;
    @JsonProperty("labels_for_form_field")
    private Object labelsForFormField;
    @JsonProperty("options")
    private List<Option> options = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("required_for_agent")
    public Object getRequiredForAgent() {
        return requiredForAgent;
    }

    @JsonProperty("required_for_agent")
    public void setRequiredForAgent(Object requiredForAgent) {
        this.requiredForAgent = requiredForAgent;
    }

    @JsonProperty("labels_for_form_field")
    public Object getLabelsForFormField() {
        return labelsForFormField;
    }

    @JsonProperty("labels_for_form_field")
    public void setLabelsForFormField(Object labelsForFormField) {
        this.labelsForFormField = labelsForFormField;
    }

    @JsonProperty("options")
    public List<Option> getOptions() {
        return options;
    }

    @JsonProperty("options")
    public void setOptions(List<Option> options) {
        this.options = options;
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