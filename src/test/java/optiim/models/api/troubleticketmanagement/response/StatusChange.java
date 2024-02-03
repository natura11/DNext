package optiim.models.api.troubleticketmanagement.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "changeDate",
        "changeReason",
        "status",
        "@baseType",
        "@schemaLocation",
        "@type"
})
public class StatusChange {

    @JsonProperty("changeDate")
    private String changeDate;
    @JsonProperty("changeReason")
    private Object changeReason;
    @JsonProperty("status")
    private String status;
    @JsonProperty("@baseType")
    private Object baseType;
    @JsonProperty("@schemaLocation")
    private Object schemaLocation;
    @JsonProperty("@type")
    private Object type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("changeDate")
    public String getChangeDate() {
        return changeDate;
    }

    @JsonProperty("changeDate")
    public void setChangeDate(String changeDate) {
        this.changeDate = changeDate;
    }

    @JsonProperty("changeReason")
    public Object getChangeReason() {
        return changeReason;
    }

    @JsonProperty("changeReason")
    public void setChangeReason(Object changeReason) {
        this.changeReason = changeReason;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("@baseType")
    public Object getBaseType() {
        return baseType;
    }

    @JsonProperty("@baseType")
    public void setBaseType(Object baseType) {
        this.baseType = baseType;
    }

    @JsonProperty("@schemaLocation")
    public Object getSchemaLocation() {
        return schemaLocation;
    }

    @JsonProperty("@schemaLocation")
    public void setSchemaLocation(Object schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    @JsonProperty("@type")
    public Object getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(Object type) {
        this.type = type;
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