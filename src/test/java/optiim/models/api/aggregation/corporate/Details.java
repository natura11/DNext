package optiim.models.api.aggregation.corporate;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "accountNumberType",
        "accountNumber",
        "owner",
        "bank"
})
@Generated("jsonschema2pojo")
public class Details {

    @JsonProperty("accountNumberType")
    private String accountNumberType;
    @JsonProperty("accountNumber")
    private String accountNumber;
    @JsonProperty("owner")
    private String owner;
    @JsonProperty("bank")
    private String bank;

    @JsonProperty("accountNumberType")
    public String getAccountNumberType() {
        return accountNumberType;
    }

    @JsonProperty("accountNumberType")
    public void setAccountNumberType(String accountNumberType) {
        this.accountNumberType = accountNumberType;
    }

    @JsonProperty("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    @JsonProperty("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @JsonProperty("owner")
    public String getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @JsonProperty("bank")
    public String getBank() {
        return bank;
    }

    @JsonProperty("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

}