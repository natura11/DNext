package optiim.models.api.shoppingcartactive;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "date",
        "transactionid",
        "vary"
})
@Generated("jsonschema2pojo")
public class ShoppingCartActiveResponse {


    @JsonProperty("date")
    private String date ;

    @JsonProperty("transactionid")
    private String transactionid;


    @JsonProperty("vary")
    private String vary;


    @JsonProperty("date")
    public String getDate() {
        return date;
    }
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("transactionid")
    public String getTransactionid() {
        return transactionid;
    }

    @JsonProperty("transactionid")
    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }


    @JsonProperty("vary")
    public String getVary() {
        return vary;
    }

    @JsonProperty("vary")
    public void setVary(String vary) {
        this.vary = vary;
    }

}