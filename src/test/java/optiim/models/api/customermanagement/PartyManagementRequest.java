package optiim.models.api.customermanagement;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "gender",
        "placeOfBirth",
        "countryOfBirth",
        "nationality",
        "birthDate",
        "givenName",
        "familyName",
        "middleName",
        "partyCharacteristic",
        "individualIdentification",
        "contactMedium",
        "externalReference",
        "languageAbility",
        "skill",
        "disability",
        "otherName"
})
@Generated("jsonschema2pojo")
public class PartyManagementRequest {

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
    @JsonProperty("partyCharacteristic")
    private List<PartyCharacteristic> partyCharacteristic = null;
    @JsonProperty("individualIdentification")
    private List<IndividualIdentification> individualIdentification = null;
    @JsonProperty("contactMedium")
    private List<ContactMedium> contactMedium = null;
    @JsonProperty("externalReference")
    private List<Object> externalReference = null;
    @JsonProperty("languageAbility")
    private List<Object> languageAbility = null;
    @JsonProperty("skill")
    private List<Object> skill = null;
    @JsonProperty("disability")
    private List<Object> disability = null;
    @JsonProperty("otherName")
    private List<Object> otherName = null;

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

    @JsonProperty("externalReference")
    public List<Object> getExternalReference() {
        return externalReference;
    }

    @JsonProperty("externalReference")
    public void setExternalReference(List<Object> externalReference) {
        this.externalReference = externalReference;
    }

    @JsonProperty("languageAbility")
    public List<Object> getLanguageAbility() {
        return languageAbility;
    }

    @JsonProperty("languageAbility")
    public void setLanguageAbility(List<Object> languageAbility) {
        this.languageAbility = languageAbility;
    }

    @JsonProperty("skill")
    public List<Object> getSkill() {
        return skill;
    }

    @JsonProperty("skill")
    public void setSkill(List<Object> skill) {
        this.skill = skill;
    }

    @JsonProperty("disability")
    public List<Object> getDisability() {
        return disability;
    }

    @JsonProperty("disability")
    public void setDisability(List<Object> disability) {
        this.disability = disability;
    }

    @JsonProperty("otherName")
    public List<Object> getOtherName() {
        return otherName;
    }

    @JsonProperty("otherName")
    public void setOtherName(List<Object> otherName) {
        this.otherName = otherName;
    }

}