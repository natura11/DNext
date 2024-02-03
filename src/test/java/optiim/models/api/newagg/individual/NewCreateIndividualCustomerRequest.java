package optiim.models.api.newagg.individual;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.newagg.common.*;

import javax.annotation.processing.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerOperations",
        "documentOperations",
        "partyOperations",
        "accountOperations",
        "partyRoleOperations",
        "geoAddressOperations",
        "paymentMethodOperations"
})
@Generated("jsonschema2pojo")
public class NewCreateIndividualCustomerRequest {
    @JsonProperty("customerOperations")
    private List<CustomerOperations> customerOperations = null;
    @JsonProperty("documentOperations")
    private List<DocumentOperations> documentOperations = null;
    @JsonProperty("partyOperations")
    private List<PartyOperations> partyOperations = null;
    @JsonProperty("accountOperations")
    private List<AccountOperations> accountOperations = null;
    @JsonProperty("partyRoleOperations")
    private List<PartyRoleOperations> partyRoleOperations = null;
    @JsonProperty("geoAddressOperations")
    private List<GeoAddressOperations> geoAddressOperations = null;
    @JsonProperty("paymentMethodOperations")
    private List<PaymentMethodOperations> paymentMethodOperations = null;

    @JsonProperty("customerOperations")
    public List<CustomerOperations> getCustomerOperations() {
        return customerOperations;
    }

    @JsonProperty("customerOperations")
    public void setCustomerOperations(List<CustomerOperations> customerOperations) {
        this.customerOperations = customerOperations;
    }

    @JsonProperty("documentOperations")
    public List<DocumentOperations> getDocumentOperations() {
        return documentOperations;
    }

    @JsonProperty("documentOperations")
    public void setDocumentOperations(List<DocumentOperations> documentOperations) {
        this.documentOperations = documentOperations;
    }

    @JsonProperty("partyOperations")
    public List<PartyOperations> getPartyOperations() {
        return partyOperations;
    }

    @JsonProperty("partyOperations")
    public void setPartyOperations(List<PartyOperations> partyOperations) {
        this.partyOperations = partyOperations;
    }

    @JsonProperty("accountOperations")
    public List<AccountOperations> getAccountOperations() {
        return accountOperations;
    }

    @JsonProperty("accountOperations")
    public void setAccountOperations(List<AccountOperations> accountOperations) {
        this.accountOperations = accountOperations;
    }

    @JsonProperty("partyRoleOperations")
    public List<PartyRoleOperations> getPartyRoleOperations() {
        return partyRoleOperations;
    }

    @JsonProperty("partyRoleOperations")
    public void setPartyRoleOperations(List<PartyRoleOperations> partyRoleOperations) {
        this.partyRoleOperations = partyRoleOperations;
    }

    @JsonProperty("geoAddressOperations")
    public List<GeoAddressOperations> getGeoAddressOperations() {
        return geoAddressOperations;
    }

    @JsonProperty("geoAddressOperations")
    public void setGeoAddressOperations(List<GeoAddressOperations> geoAddressOperations) {
        this.geoAddressOperations = geoAddressOperations;
    }

    @JsonProperty("paymentMethodOperations")
    public List<PaymentMethodOperations> getPaymentMethodOperations() {
        return paymentMethodOperations;
    }

    @JsonProperty("paymentMethodOperations")
    public void setPaymentMethodOperations(List<PaymentMethodOperations> paymentMethodOperations) {
        this.paymentMethodOperations = paymentMethodOperations;
    }
}