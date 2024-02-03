package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ratingType",
        "description",
        "billStructure",
        "characteristic",
        "name",
        "accountType",
        "relatedParty",
        "contact",
        "defaultPaymentMethod",
        "attachment"
})
@Generated("jsonschema2pojo")
public class AccountValue {
    @JsonProperty("ratingType")
    private String ratingType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("billStructure")
    private BillStructure billStructure;
    @JsonProperty("characteristic")
    private List<PartyCharacteristic> characteristic = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("contact")
    private List<Contact> contact = null;
    @JsonProperty("defaultPaymentMethod")
    private DefaultPaymentMethod defaultPaymentMethod;
    @JsonProperty("attachment")
    private List<Attachment> attachment = null;

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
    public List<PartyCharacteristic> getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(List<PartyCharacteristic> characteristic) {
        this.characteristic = characteristic;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("contact")
    public List<Contact> getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    @JsonProperty("defaultPaymentMethod")
    public DefaultPaymentMethod getDefaultPaymentMethod() {
        return defaultPaymentMethod;
    }

    @JsonProperty("defaultPaymentMethod")
    public void setDefaultPaymentMethod(DefaultPaymentMethod defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
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