package optiim.models.api.sellcoaxoffer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orderId",
        "orderItemId"
})
public class GetFromOrderActivationRequest {

    @JsonProperty("orderId")
    private String orderId;
    @JsonProperty("orderItemId")
    private String orderItemId;

    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }

    @JsonProperty("orderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("orderItemId")
    public String getOrderItemId() {
        return orderItemId;
    }

    @JsonProperty("orderItemId")
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

}

