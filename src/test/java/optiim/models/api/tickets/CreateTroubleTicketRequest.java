package optiim.models.api.tickets;


import com.fasterxml.jackson.annotation.*;
import optiim.models.api.troubleticketmanagement.response.PiaExtension;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "description",
        "name",
        "priority",
        "severity",
        "ticketType",
        "relatedParty",
        "@type"
})

public class CreateTroubleTicketRequest {

    @JsonProperty("description")
    private String description;
    @JsonProperty("name")
    private String name;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("ticketType")
    private String ticketType;
    @JsonProperty("relatedParty")
    private RelatedPartyRequest relatedPartyRequest;
    @JsonProperty("piaExtension")
    private PiaExtension piaExtension;
    @JsonProperty("@type")
    private Object type;
   // @JsonIgnore
   // private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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

    @JsonProperty("@type")
    public Object getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("relatedParty")
    public RelatedPartyRequest getRelatedPartyRequest() {
        return relatedPartyRequest;
    }

    @JsonProperty("relatedParty")
    public void setRelatedPartyRequest(RelatedPartyRequest relatedPartyRequest) {
        this.relatedPartyRequest = relatedPartyRequest;
    }

    @JsonProperty("piaExtension")
    public PiaExtension getPiaExtension() {
        return piaExtension;
    }

    @JsonProperty("piaExtension")
    public void setPiaExtension(PiaExtension piaExtension) {
        this.piaExtension = piaExtension;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }


}
