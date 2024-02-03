package optiim.models.api.sellcoaxoffer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orderId",
        "orderItemId",
        "productId",
        "orderAction"
})
public class ActivateCoaxRequest {

    @JsonProperty("orderId")
    private String orderId;
    @JsonProperty("orderItemId")
    private String orderItemId;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("orderAction")
    private String orderAction;

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

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("orderAction")
    public String getOrderAction() {
        return orderAction;
    }

    @JsonProperty("orderAction")
    public void setOrderAction(String orderAction) {
        this.orderAction = orderAction;
    }



}