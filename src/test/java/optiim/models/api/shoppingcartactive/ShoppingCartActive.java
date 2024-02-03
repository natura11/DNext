package optiim.models.api.shoppingcartactive;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "result",
        "ticketId"
})
@Generated("jsonschema2pojo")
public class ShoppingCartActive {


    @JsonProperty("result")
    private String result;

    @JsonProperty("ticketId")
    private String ticketId;


    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("ticketId")
    public String getTicketId() {
        return ticketId;
    }

    @JsonProperty("ticketId")
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }



}