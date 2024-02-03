package optiim.models.api.customermanagement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "mediumType",
        "characteristic",
        "preferred",
        "@baseType",
        "@schemaLocation",
        "@type"
})
@Generated("jsonschema2pojo")
public class ContactMedium {

    @JsonProperty("mediumType")
    private String mediumType;
    @JsonProperty("characteristic")
    private Characteristic characteristic;
    @JsonProperty("preferred")
    private Boolean preferred;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@type")
    private String type;

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

    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    @JsonProperty("@baseType")
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    @JsonProperty("@schemaLocation")
    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

}