package optiim.models.api.tickets;

import com.fasterxml.jackson.annotation.*;
import optiim.models.api.troubleticketmanagement.response.Note;
import optiim.models.api.troubleticketmanagement.response.PiaExtension;
import optiim.models.api.troubleticketmanagement.response.RelatedParty;
import optiim.models.api.troubleticketmanagement.response.StatusChange;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        "requestedResolutionDate",
        "resolutionDate",
        "severity",
        "statusChangeDate",
        "statusChangeReason",
        "ticketType",
        "attachment",
        "channel",
        "note",
        "relatedEntity",
        "relatedParty",
        "status",
        "statusChange",
        "troubleTicketRelationship",
        "piaExtension",
        "@baseType",
        "@schemaLocation",
        "@type"
})
public class CreateTroubleTicketsResponse {

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
    @JsonProperty("requestedResolutionDate")
    private Object requestedResolutionDate;
    @JsonProperty("resolutionDate")
    private Object resolutionDate;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("statusChangeDate")
    private Object statusChangeDate;
    @JsonProperty("statusChangeReason")
    private Object statusChangeReason;
    @JsonProperty("ticketType")
    private String ticketType;
    @JsonProperty("attachment")
    private Object attachment;
    @JsonProperty("channel")
    private Object channel;
    @JsonProperty("note")
    private List<Note> note = null;
    @JsonProperty("relatedEntity")
    private Object relatedEntity;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("statusChange")
    private List<StatusChange> statusChange = null;
    @JsonProperty("troubleTicketRelationship")
    private Object troubleTicketRelationship;
    @JsonProperty("piaExtension")
    private PiaExtension piaExtension;
    @JsonProperty("@baseType")
    private Object baseType;
    @JsonProperty("@schemaLocation")
    private Object schemaLocation;
    @JsonProperty("@type")
    private String type;
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

    @JsonProperty("requestedResolutionDate")
    public Object getRequestedResolutionDate() {
        return requestedResolutionDate;
    }

    @JsonProperty("requestedResolutionDate")
    public void setRequestedResolutionDate(Object requestedResolutionDate) {
        this.requestedResolutionDate = requestedResolutionDate;
    }

    @JsonProperty("resolutionDate")
    public Object getResolutionDate() {
        return resolutionDate;
    }

    @JsonProperty("resolutionDate")
    public void setResolutionDate(Object resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("statusChangeDate")
    public Object getStatusChangeDate() {
        return statusChangeDate;
    }

    @JsonProperty("statusChangeDate")
    public void setStatusChangeDate(Object statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    @JsonProperty("statusChangeReason")
    public Object getStatusChangeReason() {
        return statusChangeReason;
    }

    @JsonProperty("statusChangeReason")
    public void setStatusChangeReason(Object statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
    }

    @JsonProperty("ticketType")
    public String getTicketType() {
        return ticketType;
    }

    @JsonProperty("ticketType")
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    @JsonProperty("attachment")
    public Object getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("channel")
    public Object getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Object channel) {
        this.channel = channel;
    }

    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(List<Note> note) {
        this.note = note;
    }

    @JsonProperty("relatedEntity")
    public Object getRelatedEntity() {
        return relatedEntity;
    }

    @JsonProperty("relatedEntity")
    public void setRelatedEntity(Object relatedEntity) {
        this.relatedEntity = relatedEntity;
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

    @JsonProperty("troubleTicketRelationship")
    public Object getTroubleTicketRelationship() {
        return troubleTicketRelationship;
    }

    @JsonProperty("troubleTicketRelationship")
    public void setTroubleTicketRelationship(Object troubleTicketRelationship) {
        this.troubleTicketRelationship = troubleTicketRelationship;
    }

    @JsonProperty("piaExtension")
    public PiaExtension getPiaExtension() {
        return piaExtension;
    }

    @JsonProperty("piaExtension")
    public void setPiaExtension(PiaExtension piaExtension) {
        this.piaExtension = piaExtension;
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
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
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