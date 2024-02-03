package optiim.models.api.aggregation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "contact"
})
@Generated("jsonschema2pojo")
public class AccountObject {

    @JsonProperty("contact")
    private List<Contact> contact=null;

    @JsonProperty("contact")
    public List<Contact> getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }
}