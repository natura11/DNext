package optiim.models.api.aggregation.corporate;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.aggregation.corporate.Contact;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ratingType",
        "description",
        "billStructure",
        "characteristic",
        "contact"
})
@Generated("jsonschema2pojo")
public class AccountObject {
    @JsonProperty("ratingType")
    private String ratingType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("billStructure")
    private BillStructure billStructure;
    @JsonProperty("characteristic")
    private List<Characteristic> characteristic = null;
    @JsonProperty("contact")
    private Contact contact;

    @JsonProperty("ratingType")
    public String getRatingType() {
        return ratingType;
    }

    @JsonProperty("ratingType")
    public void setRatingType(String ratingType) {
        this.ratingType = ratingType;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("billStructure")
    public BillStructure getBillStructure() {
        return billStructure;
    }

    @JsonProperty("billStructure")
    public void setBillStructure(BillStructure billStructure) {
        this.billStructure = billStructure;
    }

    @JsonProperty("characteristic")
    public List<Characteristic> getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }
}