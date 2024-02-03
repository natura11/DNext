package optiim.models.api.aggregation.corporate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mediumType",
        "characteristic",
        "preferred"
})
@Generated("jsonschema2pojo")
public class ContactMedium {

    @JsonProperty("mediumType")
    private String mediumType;
    @JsonProperty("characteristic")
    private Characteristic characteristic;
    @JsonProperty("preferred")
    private Boolean preferred;

    @JsonProperty("mediumType")
    public String getMediumType() {
        return mediumType;
    }

    @JsonProperty("mediumType")
    public void setMediumType(String mediumType) {
        this.mediumType = mediumType;
    }

    @JsonProperty("characteristic")
    public Characteristic getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    @JsonProperty("preferred")
    public Boolean getPreferred() {
        return preferred;
    }

    @JsonProperty("preferred")
    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

}