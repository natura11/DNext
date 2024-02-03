package optiim.models.api.sellcoaxoffer;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "message",
        "orderMacAddress",
        "customerId"
})
public class GetFromOrderActivationResponse {

    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private Object message;
    @JsonProperty("orderMacAddress")
    private String orderMacAddress;
    @JsonProperty("customerId")
    private String customerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    @JsonProperty("orderMacAddress")
    public String getOrderMacAddress() {
        return orderMacAddress;
    }

    @JsonProperty("orderMacAddress")
    public void setOrderMacAddress(String orderMacAddress) {
        this.orderMacAddress = orderMacAddress;
    }

    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customerId")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
