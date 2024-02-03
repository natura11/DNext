package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@type",
        "name",
        "roleType",
        "attachment",
        "engagedParty",
        "contactMedium"
})
@Generated("jsonschema2pojo")
public class PartyRoleValue {
    @JsonProperty("@type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("roleType")
    private RoleType roleType;
    @JsonProperty("attachment")
    private List<Attachment> attachment = null;
    @JsonProperty("engagedParty")
    private EngagedParty engagedParty;
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("roleType")
    public RoleType getRoleType() {
        return roleType;
    }

    @JsonProperty("roleType")
    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    @JsonProperty("attachment")
    public List<Attachment> getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(List<Attachment> attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("engagedParty")
    public EngagedParty getEngagedParty() {
        return engagedParty;
    }

    @JsonProperty("engagedParty")
    public void setEngagedParty(EngagedParty engagedParty) {
        this.engagedParty = engagedParty;
    }

    @JsonProperty("contactMedium")
    public List<ContactMedium> getContactMedium() {
        return contactMedium;
    }

    @JsonProperty("contactMedium")
    public void setContactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
    }
}