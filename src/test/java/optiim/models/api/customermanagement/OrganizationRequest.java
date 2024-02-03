package optiim.models.api.customermanagement;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "tradingName",
        "contactMedium",
        "creditRating",
        "externalReference",
        "organizationChildRelationship",
        "organizationIdentification",
        "otherName",
        "partyCharacteristic",
        "relatedParty",
        "taxExemptionCertificate"
})
@Generated("jsonschema2pojo")
public class OrganizationRequest {

    @JsonProperty("name")
    private String name;
    @JsonProperty("tradingName")
    private String tradingName;
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;
    @JsonProperty("creditRating")
    private List<Object> creditRating = null;
    @JsonProperty("externalReference")
    private List<Object> externalReference = null;
    @JsonProperty("organizationChildRelationship")
    private List<Object> organizationChildRelationship = null;
    @JsonProperty("organizationIdentification")
    private List<OrganizationIdentification> organizationIdentification = null;
    @JsonProperty("otherName")
    private List<Object> otherName = null;
    @JsonProperty("partyCharacteristic")
    private List<PartyCharacteristic> partyCharacteristic = null;
    @JsonProperty("relatedParty")
    private List<optiim.models.api.customermanagement.RelatedParty> relatedParty = null;
    @JsonProperty("taxExemptionCertificate")
    private List<Object> taxExemptionCertificate = null;

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

    @JsonProperty("creditRating")
    public List<Object> getCreditRating() {
        return creditRating;
    }

    @JsonProperty("creditRating")
    public void setCreditRating(List<Object> creditRating) {
        this.creditRating = creditRating;
    }

    @JsonProperty("externalReference")
    public List<Object> getExternalReference() {
        return externalReference;
    }

    @JsonProperty("externalReference")
    public void setExternalReference(List<Object> externalReference) {
        this.externalReference = externalReference;
    }

    @JsonProperty("organizationChildRelationship")
    public List<Object> getOrganizationChildRelationship() {
        return organizationChildRelationship;
    }

    @JsonProperty("organizationChildRelationship")
    public void setOrganizationChildRelationship(List<Object> organizationChildRelationship) {
        this.organizationChildRelationship = organizationChildRelationship;
    }

    @JsonProperty("organizationIdentification")
    public List<OrganizationIdentification> getOrganizationIdentification() {
        return organizationIdentification;
    }

    @JsonProperty("organizationIdentification")
    public void setOrganizationIdentification(List<OrganizationIdentification> organizationIdentification) {
        this.organizationIdentification = organizationIdentification;
    }

    @JsonProperty("otherName")
    public List<Object> getOtherName() {
        return otherName;
    }

    @JsonProperty("otherName")
    public void setOtherName(List<Object> otherName) {
        this.otherName = otherName;
    }

    @JsonProperty("partyCharacteristic")
    public List<PartyCharacteristic> getPartyCharacteristic() {
        return partyCharacteristic;
    }

    @JsonProperty("partyCharacteristic")
    public void setPartyCharacteristic(List<PartyCharacteristic> partyCharacteristic) {
        this.partyCharacteristic = partyCharacteristic;
    }

    @JsonProperty("relatedParty")
    public List<optiim.models.api.customermanagement.RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<optiim.models.api.customermanagement.RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("taxExemptionCertificate")
    public List<Object> getTaxExemptionCertificate() {
        return taxExemptionCertificate;
    }

    @JsonProperty("taxExemptionCertificate")
    public void setTaxExemptionCertificate(List<Object> taxExemptionCertificate) {
        this.taxExemptionCertificate = taxExemptionCertificate;
    }

}