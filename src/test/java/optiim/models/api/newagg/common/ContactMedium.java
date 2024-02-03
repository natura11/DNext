package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mediumType",
        "characteristic"
})
@Generated("jsonschema2pojo")
public class ContactMedium {
    @JsonProperty("mediumType")
    private String mediumType;
    @JsonProperty("characteristic")
    private Characteristic characteristic;

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
}