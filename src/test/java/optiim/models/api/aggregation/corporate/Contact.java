package optiim.models.api.aggregation.corporate;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.aggregation.corporate.ContactMedium;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "contactMedium"
})
@Generated("jsonschema2pojo")
public class Contact {

    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;

    @JsonProperty("contactMedium")
    public List<ContactMedium> getContactMedium() {
        return contactMedium;
    }

    @JsonProperty("contactMedium")
    public void setContactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
    }

}