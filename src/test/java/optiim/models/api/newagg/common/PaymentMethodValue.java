package optiim.models.api.newagg.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "@type",
        "accountNumberType",
        "account",
        "description",
        "isPreferred",
        "relatedParty"
})
@Generated("jsonschema2pojo")
public class PaymentMethodValue {
    @JsonProperty("name")
    private String name;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("accountNumberType")
    private String accountNumberType;
    @JsonProperty("account")
    private List<Account> account = null;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isPreferred")
    private boolean isPreferred;
    @JsonProperty("relatedParty")
    private RelatedParty relatedParty;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("accountNumberType")
    public String getAccountNumberType() {
        return accountNumberType;
    }

    @JsonProperty("accountNumberType")
    public void setAccountNumberType(String accountNumberType) {
        this.accountNumberType = accountNumberType;
    }

    @JsonProperty("account")
    public List<Account> getAccount() {
        return account;
    }

    @JsonProperty("account")
    public void setAccount(List<Account> account) {
        this.account = account;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isPreferred")
    public boolean isPreferred() {
        return isPreferred;
    }

    @JsonProperty("isPreferred")
    public void setPreferred(boolean preferred) {
        isPreferred = preferred;
    }

    @JsonProperty("relatedParty")
    public RelatedParty getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(RelatedParty relatedParty) {
        this.relatedParty = relatedParty;
    }
}