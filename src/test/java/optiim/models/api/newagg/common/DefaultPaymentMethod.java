package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "derivedFrom"
})
@Generated("jsonschema2pojo")
public class DefaultPaymentMethod {
    @JsonProperty("derivedFrom")
    private String derivedFrom;

    @JsonProperty("derivedFrom")
    public String getDerivedFrom() {
        return derivedFrom;
    }

    @JsonProperty("derivedFrom")
    public void setDerivedFrom(String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }
}