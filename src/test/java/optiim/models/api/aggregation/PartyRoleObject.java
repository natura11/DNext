package optiim.models.api.aggregation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "roleType",
        "attachment"
})
@Generated("jsonschema2pojo")
public class PartyRoleObject {

    @JsonProperty("roleType")
    private RoleType roleType;
    @JsonProperty("attachment")
    private List<Attachment> attachment = null;

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

}