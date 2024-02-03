package optiim.models.api.troubleticketmanagement;

import java.util.List;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.troubleticketmanagement.response.RelatedParty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "description",
        "severity",
        "priority",
        "ticketType",
//        "piaExtension",
        "pExtension",
        "relatedParty"
})
@Generated("jsonschema2pojo")
public class IssueTypeRequest {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("ticketType")
    private String ticketType;
    @JsonProperty("pExtension")
    private PiaExtension pExtension;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("ticketType")
    public String getTicketType() {
        return ticketType;
    }

    @JsonProperty("ticketType")
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @JsonProperty("pExtension")
    public PiaExtension getPiaExtension() {
        return pExtension;
    }

    @JsonProperty("pExtension")
    public void setPiaExtension(PiaExtension pExtension) {
        this.pExtension = pExtension;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

}