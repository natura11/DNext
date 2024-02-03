package optiim.models.api.newagg.individual;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "disabilityCode",
        "disabilityName"
})
@Generated("jsonschema2pojo")
public class Disability {
    @JsonProperty("disabilityCode")
    private String disabilityCode;
    @JsonProperty("disabilityName")
    private String disabilityName;

    @JsonProperty("disabilityCode")
    public String getDisabilityCode() {
        return disabilityCode;
    }

    @JsonProperty("disabilityCode")
    public void setDisabilityCode(String disabilityCode) {
        this.disabilityCode = disabilityCode;
    }

    @JsonProperty("disabilityName")
    public String getDisabilityName() {
        return disabilityName;
    }

    @JsonProperty("disabilityName")
    public void setDisabilityName(String disabilityName) {
        this.disabilityName = disabilityName;
    }
}