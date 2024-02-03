package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "status",
        "engagedParty",
        "account",
        "characteristic",
        "relatedParty",
        "contactMedium",
        "id"
})
@Generated("jsonschema2pojo")
public class CustomerValue {
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
    @JsonProperty("engagedParty")
    private EngagedParty engagedParty;
    @JsonProperty("account")
    private List<Account> account = null;
    @JsonProperty("characteristic")
    private List<PartyCharacteristic> characteristic = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;
    @JsonProperty("id")
    private String id;

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
    public List<Account> getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(List<Account> account) {
        this.account = account;
    }

    @JsonProperty("characteristic")
    public List<PartyCharacteristic> getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(List<PartyCharacteristic> characteristic) {
        this.characteristic = characteristic;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
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

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }
}