package optiim.models.api.troubleticketmanagement.response;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "value"
})
@Generated("jsonschema2pojo")
public class CustomFieldValuePair {

    @JsonProperty("id")
    private String id;
    @JsonProperty("value")
    private List<String> value = null;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("value")
    public List<String> getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(List<String> value) {
        this.value = value;
    }

}
