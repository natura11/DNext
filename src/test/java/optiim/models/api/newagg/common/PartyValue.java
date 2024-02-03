package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.newagg.corporate.OrganizationIdentification;
import optiim.models.api.newagg.individual.Disability;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@type",
        "gender",
        "placeOfBirth",
        "countryOfBirth",
        "nationality",
        "birthDate",
        "givenName",
        "familyName",
        "middleName",
        "fullName",
        "name",
        "tradingName",
        "organizationIdentification",
        "partyCharacteristic",
        "industry",
        "individualIdentification",
        "contactMedium",
        "disability",
        "marketSegment",
        "attachment"
})
@Generated("jsonschema2pojo")
public class PartyValue {
    @JsonProperty("@type")
    private String type;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("placeOfBirth")
    private String placeOfBirth;
    @JsonProperty("countryOfBirth")
    private String countryOfBirth;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("birthDate")
    private String birthDate;
    @JsonProperty("givenName")
    private String givenName;
    @JsonProperty("familyName")
    private String familyName;
    @JsonProperty("middleName")
    private String middleName;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tradingName")
    private String tradingName;
    @JsonProperty("organizationIdentification")
    private List<OrganizationIdentification> organizationIdentification = null;
    @JsonProperty("partyCharacteristic")
    private List<PartyCharacteristic> partyCharacteristic = null;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("individualIdentification")
    private List<IndividualIdentification> individualIdentification = null;
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;
    @JsonProperty("disability")
    private List<Disability> disability = null;
    @JsonProperty("marketSegment")
    private List<MarketSegment> marketSegment = null;
    @JsonProperty("attachment")
    private List<Attachment> attachment = null;

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("placeOfBirth")
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    @JsonProperty("placeOfBirth")
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @JsonProperty("countryOfBirth")
    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    @JsonProperty("countryOfBirth")
    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    @JsonProperty("nationality")
    public String getNationality() {
        return nationality;
    }

    @JsonProperty("nationality")
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty("birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("givenName")
    public String getGivenName() {
        return givenName;
    }

    @JsonProperty("givenName")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    @JsonProperty("familyName")
    public String getFamilyName() {
        return familyName;
    }

    @JsonProperty("familyName")
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

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

    @JsonProperty("individualIdentification")
    public List<OrganizationIdentification> getOrganizationIdentification() {
        return organizationIdentification;
    }

    @JsonProperty("individualIdentification")
    public void setOrganizationIdentification(List<OrganizationIdentification> organizationIdentification) {
        this.organizationIdentification = organizationIdentification;
    }

    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    @JsonProperty("industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @JsonProperty("partyCharacteristic")
    public List<PartyCharacteristic> getPartyCharacteristic() {
        return partyCharacteristic;
    }

    @JsonProperty("partyCharacteristic")
    public void setPartyCharacteristic(List<PartyCharacteristic> partyCharacteristic) {
        this.partyCharacteristic = partyCharacteristic;
    }

    @JsonProperty("individualIdentification")
    public List<IndividualIdentification> getIndividualIdentification() {
        return individualIdentification;
    }

    @JsonProperty("individualIdentification")
    public void setIndividualIdentification(List<IndividualIdentification> individualIdentification) {
        this.individualIdentification = individualIdentification;
    }

    @JsonProperty("contactMedium")
    public List<ContactMedium> getContactMedium() {
        return contactMedium;
    }

    @JsonProperty("contactMedium")
    public void setContactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
    }

    @JsonProperty("disability")
    public List<Disability> getDisability() {
        return disability;
    }

    @JsonProperty("disability")
    public void setDisability(List<Disability> disability) {
        this.disability = disability;
    }

    @JsonProperty("marketSegment")
    public List<MarketSegment> getMarketSegment() {
        return marketSegment;
    }

    @JsonProperty("marketSegment")
    public void setMarketSegment(List<MarketSegment> marketSegment) {
        this.marketSegment = marketSegment;
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