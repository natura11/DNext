package optiim.models.api.troubleticketmanagement.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "faveoContextUrl",
        "customFieldValuePair"
})
public class PiaExtension {

    @JsonProperty("faveoContextUrl")
    private String faveoContextUrl;
    @JsonProperty("customFieldValuePair")
    private Object customFieldValuePair;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("faveoContextUrl")
    public String getFaveoContextUrl() {
        return faveoContextUrl;
    }

    @JsonProperty("faveoContextUrl")
    public void setFaveoContextUrl(String faveoContextUrl) {
        this.faveoContextUrl = faveoContextUrl;
    }

    @JsonProperty("customFieldValuePair")
    public Object getCustomFieldValuePair() {
        return customFieldValuePair;
    }

    @JsonProperty("customFieldValuePair")
    public void setCustomFieldValuePair(Object customFieldValuePair) {
        this.customFieldValuePair = customFieldValuePair;
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