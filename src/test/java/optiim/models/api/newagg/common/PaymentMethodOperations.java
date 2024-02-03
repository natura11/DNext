package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "op",
        "path",
        "provisionalId",
        "value"
})
@Generated("jsonschema2pojo")
public class PaymentMethodOperations {
    @JsonProperty("op")
    private String op;
    @JsonProperty("path")
    private String path;
    @JsonProperty("provisionalId")
    private String provisionalId;
    @JsonProperty("value")
    private PaymentMethodValue value;

    @JsonProperty("op")
    public String getOp() {
        return op;
    }

    @JsonProperty("op")
    public void setOp(String op) {
        this.op = op;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("provisionalId")
    public String getProvisionalId() {
        return provisionalId;
    }

    @JsonProperty("provisionalId")
    public void setProvisionalId(String provisionalId) {
        this.provisionalId = provisionalId;
    }

    @JsonProperty("value")
    public PaymentMethodValue getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(PaymentMethodValue value) {
        this.value = value;
    }
}