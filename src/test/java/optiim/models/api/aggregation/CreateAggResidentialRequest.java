package optiim.models.api.aggregation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.aggregation.corporate.PaymentMethodObject;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerObject",
        "individualObject",
        "accountObject",
        "paymentMethodObject",
        "relatedPartyObject"
})
@Generated("jsonschema2pojo")
public class CreateAggResidentialRequest {

    @JsonProperty("customerObject")
    private CustomerObject customerObject;
    @JsonProperty("individualObject")
    private IndividualObject individualObject;
    @JsonProperty("accountObject")
    private List<AccountObject> accountObject;
    @JsonProperty("paymentMethodObject")
    private PaymentMethodObject paymentMethodObject;
    @JsonProperty("relatedPartyObject")
    private List<RelatedPartyObject> relatedPartyObject =null;

    @JsonProperty("customerObject")
    public CustomerObject getCustomerObject() {
        return customerObject;
    }

    @JsonProperty("customerObject")
    public void setCustomerObject(CustomerObject customerObject) {
        this.customerObject = customerObject;
    }

    @JsonProperty("individualObject")
    public IndividualObject getIndividualObject() {
        return individualObject;
    }

    @JsonProperty("individualObject")
    public void setIndividualObject(IndividualObject individualObject) {
        this.individualObject = individualObject;
    }

    @JsonProperty("relatedPartyObject")
    public List<RelatedPartyObject> getRelatedPartyObject() {
        return relatedPartyObject;
    }

    @JsonProperty("relatedPartyObject")
    public void setRelatedPartyObject(List<RelatedPartyObject> relatedPartyObject) {
        this.relatedPartyObject = relatedPartyObject;
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
}