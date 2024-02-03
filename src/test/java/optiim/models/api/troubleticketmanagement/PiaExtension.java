package optiim.models.api.troubleticketmanagement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customFieldValuePair"
})
@Generated("jsonschema2pojo")
public class PiaExtension {

    @JsonProperty("customFieldValuePair")
    private List<CustomFieldValuePair> customFieldValuePair = null;

    @JsonProperty("customFieldValuePair")
    public List<CustomFieldValuePair> getCustomFieldValuePair() {
        return customFieldValuePair;
    }

    @JsonProperty("customFieldValuePair")
    public void setCustomFieldValuePair(List<CustomFieldValuePair> customFieldValuePair) {
        this.customFieldValuePair = customFieldValuePair;
    }

}