package optiim.models.api.aggregation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "individualObject",
        "partyRoleObject"
})
@Generated("jsonschema2pojo")
public class RelatedPartyObject {

    @JsonProperty("individualObject")
    private IndividualObject individualObject;
    @JsonProperty("partyRoleObject")
    private PartyRoleObject partyRoleObject;

    @JsonProperty("individualObject")
    public IndividualObject getIndividualObject() {
        return individualObject;
    }

    @JsonProperty("individualObject")
    public void setIndividualObject(IndividualObject individualObject) {
        this.individualObject = individualObject;
    }

    @JsonProperty("partyRoleObject")
    public PartyRoleObject getPartyRoleObject() {
        return partyRoleObject;
    }

    @JsonProperty("partyRoleObject")
    public void setPartyRoleObject(PartyRoleObject partyRoleObject) {
        this.partyRoleObject = partyRoleObject;
    }

}