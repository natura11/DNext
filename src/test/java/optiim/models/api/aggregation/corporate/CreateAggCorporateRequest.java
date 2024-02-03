package optiim.models.api.aggregation.corporate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.aggregation.CustomerObject;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "relatedPartyObject",
        "organizationObject",
        "accountObject",
        "paymentMethodObject",
        "customerObject"
})
@Generated("jsonschema2pojo")
public class CreateAggCorporateRequest {

    @JsonProperty("relatedPartyObject")
    private List<RelatedPartyObject> relatedPartyObject = null;
    @JsonProperty("organizationObject")
    private OrganizationObject organizationObject;
    @JsonProperty("accountObject")
    private List<AccountObject> accountObject;
    @JsonProperty("paymentMethodObject")
    private PaymentMethodObject paymentMethodObject;
    @JsonProperty("customerObject")
    private CustomerObject customerObject;

    @JsonProperty("relatedPartyObject")
    public List<RelatedPartyObject> getRelatedPartyObject() {
        return relatedPartyObject;
    }

    @JsonProperty("relatedPartyObject")
    public void setRelatedPartyObject(List<RelatedPartyObject> relatedPartyObject) {
        this.relatedPartyObject = relatedPartyObject;
    }

    @JsonProperty("organizationObject")
    public OrganizationObject getOrganizationObject() {
        return organizationObject;
    }

    @JsonProperty("organizationObject")
    public void setOrganizationObject(OrganizationObject organizationObject) {
        this.organizationObject = organizationObject;
    }

    @JsonProperty("accountObject")
    public List<AccountObject> getAccountObject() {
        return accountObject;
    }

    @JsonProperty("accountObject")
    public void setAccountObject(List<AccountObject> accountObject) {
        this.accountObject = accountObject;
    }

    @JsonProperty("paymentMethodObject")
    public PaymentMethodObject getPaymentMethodObject() {
        return paymentMethodObject;
    }

    @JsonProperty("paymentMethodObject")
    public void setPaymentMethodObject(PaymentMethodObject paymentMethodObject) {
        this.paymentMethodObject = paymentMethodObject;
    }

    @JsonProperty("customerObject")
    public CustomerObject getCustomerObject() {
        return customerObject;
    }

    @JsonProperty("customerObject")
    public void setCustomerObject(CustomerObject customerObject) {
        this.customerObject = customerObject;
    }

}