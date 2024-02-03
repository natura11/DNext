package optiim.models.api.aggregation.corporate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "tradingName",
        "contactMedium",
        "organizationIdentification",
        "partyCharacteristic"
})
@Generated("jsonschema2pojo")
public class OrganizationObject {

    @JsonProperty("name")
    private String name;
    @JsonProperty("tradingName")
    private String tradingName;
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;
    @JsonProperty("organizationIdentification")
    private List<OrganizationIdentification> organizationIdentification = null;
    @JsonProperty("partyCharacteristic")
    private List<PartyCharacteristic> partyCharacteristic = null;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tradingName")
    public String getTradingName() {
        return tradingName;
    }

    @JsonProperty("tradingName")
    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    @JsonProperty("contactMedium")
    public List<ContactMedium> getContactMedium() {
        return contactMedium;
    }

    @JsonProperty("contactMedium")
    public void setContactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
    }

    @JsonProperty("organizationIdentification")
    public List<OrganizationIdentification> getOrganizationIdentification() {
        return organizationIdentification;
    }

    @JsonProperty("organizationIdentification")
    public void setOrganizationIdentification(List<OrganizationIdentification> organizationIdentification) {
        this.organizationIdentification = organizationIdentification;
    }

    @JsonProperty("partyCharacteristic")
    public List<PartyCharacteristic> getPartyCharacteristic() {
        return partyCharacteristic;
    }

    @JsonProperty("partyCharacteristic")
    public void setPartyCharacteristic(List<PartyCharacteristic> partyCharacteristic) {
        this.partyCharacteristic = partyCharacteristic;
    }

}