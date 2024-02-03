package optiim.models.api.customermanagement;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "engagedParty",
        "account",
        "agreement",
        "characteristic",
        "creditProfile",
        "paymentMethod",
        "relatedParty",
        "contactMedium"
})
@Generated("jsonschema2pojo")
public class CustomerManagementRequest {

    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
    @JsonProperty("engagedParty")
    private EngagedParty engagedParty;
    @JsonProperty("account")
    private List<Object> account = null;
    @JsonProperty("agreement")
    private List<Object> agreement = null;
    @JsonProperty("characteristic")
    private List<Characteristic> characteristic = null;
    @JsonProperty("creditProfile")
    private List<Object> creditProfile = null;
    @JsonProperty("paymentMethod")
    private List<Object> paymentMethod = null;
    @JsonProperty("relatedParty")
    private List<Object> relatedParty = null;
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("engagedParty")
    public EngagedParty getEngagedParty() {
        return engagedParty;
    }

    @JsonProperty("engagedParty")
    public void setEngagedParty(EngagedParty engagedParty) {
        this.engagedParty = engagedParty;
    }

    @JsonProperty("account")
    public List<Object> getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(List<Object> account) {
        this.account = account;
    }

    @JsonProperty("agreement")
    public List<Object> getAgreement() {
        return agreement;
    }

    @JsonProperty("agreement")
    public void setAgreement(List<Object> agreement) {
        this.agreement = agreement;
    }

    @JsonProperty("characteristic")
    public List<Characteristic> getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    @JsonProperty("creditProfile")
    public List<Object> getCreditProfile() {
        return creditProfile;
    }

    @JsonProperty("creditProfile")
    public void setCreditProfile(List<Object> creditProfile) {
        this.creditProfile = creditProfile;
    }

    @JsonProperty("paymentMethod")
    public List<Object> getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public void setPaymentMethod(List<Object> paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("relatedParty")
    public List<Object> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<Object> relatedParty) {
        this.relatedParty = relatedParty;
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