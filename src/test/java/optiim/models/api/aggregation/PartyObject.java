package optiim.models.api.aggregation;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "individualObject"
})
@Generated("jsonschema2pojo")
public class PartyObject {

    @JsonProperty("individualObject")
    private IndividualObject individualObject;

    @JsonProperty("individualObject")
    public IndividualObject getIndividualObject() {
        return individualObject;
    }

    @JsonProperty("individualObject")
    public void setIndividualObject(IndividualObject individualObject) {
        this.individualObject = individualObject;
    }

}