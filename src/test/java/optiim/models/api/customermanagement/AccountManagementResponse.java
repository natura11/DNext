package optiim.models.api.customermanagement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.troubleticketmanagement.response.RelatedParty;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paymentPlan",
        "id",
        "href",
        "accountType",
        "name",
        "accountBalance",
        "accountRelationship",
        "contact",
        "relatedParty",
        "taxExemption",
        "@baseType",
        "@type",
        "externalReference"
})
@Generated("jsonschema2pojo")
public class AccountManagementResponse {

    @JsonProperty("paymentPlan")
    private List<Object> paymentPlan = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("accountType")
    private String accountType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("accountBalance")
    private List<Object> accountBalance = null;
    @JsonProperty("accountRelationship")
    private List<AccountRelationship> accountRelationship = null;
    @JsonProperty("contact")
    private List<Object> contact = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("taxExemption")
    private List<Object> taxExemption = null;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("externalReference")
    private List<Object> externalReference = null;

    @JsonProperty("paymentPlan")
    public List<Object> getPaymentPlan() {
        return paymentPlan;
    }

    @JsonProperty("paymentPlan")
    public void setPaymentPlan(List<Object> paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("accountType")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("accountType")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("accountBalance")
    public List<Object> getAccountBalance() {
        return accountBalance;
    }

    @JsonProperty("accountBalance")
    public void setAccountBalance(List<Object> accountBalance) {
        this.accountBalance = accountBalance;
    }

    @JsonProperty("accountRelationship")
    public List<AccountRelationship> getAccountRelationship() {
        return accountRelationship;
    }

    @JsonProperty("accountRelationship")
    public void setAccountRelationship(List<AccountRelationship> accountRelationship) {
        this.accountRelationship = accountRelationship;
    }

    @JsonProperty("contact")
    public List<Object> getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(List<Object> contact) {
        this.contact = contact;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("taxExemption")
    public List<Object> getTaxExemption() {
        return taxExemption;
    }

    @JsonProperty("taxExemption")
    public void setTaxExemption(List<Object> taxExemption) {
        this.taxExemption = taxExemption;
    }

    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    @JsonProperty("@baseType")
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("externalReference")
    public List<Object> getExternalReference() {
        return externalReference;
    }

    @JsonProperty("externalReference")
    public void setExternalReference(List<Object> externalReference) {
        this.externalReference = externalReference;
    }

}