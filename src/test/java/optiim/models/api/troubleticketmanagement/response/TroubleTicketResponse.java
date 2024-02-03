package optiim.models.api.troubleticketmanagement.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "href",
        "creationDate",
        "description",
        "expectedResolutionDate",
        "externalId",
        "lastUpdate",
        "name",
        "priority",
        "severity",
        "ticketType",
        "note",
        "relatedParty",
        "status",
        "statusChange",
        "piaExtension"
})
@Generated("jsonschema2pojo")
public class TroubleTicketResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("expectedResolutionDate")
    private String expectedResolutionDate;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("lastUpdate")
    private String lastUpdate;
    @JsonProperty("name")
    private String name;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("ticketType")
    private String ticketType;
    @JsonProperty("note")
    private List<Note> note = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusChange")
    private List<StatusChange> statusChange = null;
    @JsonProperty("piaExtension")
    private PiaExtension piaExtension;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("expectedResolutionDate")
    public String getExpectedResolutionDate() {
        return expectedResolutionDate;
    }

    @JsonProperty("expectedResolutionDate")
    public void setExpectedResolutionDate(String expectedResolutionDate) {
        this.expectedResolutionDate = expectedResolutionDate;
    }

    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("lastUpdate")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("lastUpdate")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("ticketType")
    public String getTicketType() {
        return ticketType;
    }

    @JsonProperty("ticketType")
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(List<Note> note) {
        this.note = note;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("statusChange")
    public List<StatusChange> getStatusChange() {
        return statusChange;
    }

    @JsonProperty("statusChange")
    public void setStatusChange(List<StatusChange> statusChange) {
        this.statusChange = statusChange;
    }

    @JsonProperty("piaExtension")
    public PiaExtension getPiaExtension() {
        return piaExtension;
    }

    @JsonProperty("piaExtension")
    public void setPiaExtension(PiaExtension piaExtension) {
        this.piaExtension = piaExtension;
    }

}