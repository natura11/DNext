package optiim.models.api.dilcoaxialinternet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "serviceCharacteristic",
        "relatedParty",
        "serviceSpecification",
        "state",
        "@type"
})
public class DILCoaxialInternetRequest {

    @JsonProperty("serviceCharacteristic")
    private List<ServiceCharacteristic> serviceCharacteristic = null;
    @JsonProperty("relatedParty")
    private List<RelatedParty> relatedParty = null;
    @JsonProperty("serviceSpecification")
    private ServiceSpecification serviceSpecification;
    @JsonProperty("state")
    private String state;

    @JsonProperty("@type")
    private String type;

    @JsonProperty("serviceCharacteristic")
    public List<ServiceCharacteristic> getServiceCharacteristic() {
        return serviceCharacteristic;
    }

    @JsonProperty("serviceCharacteristic")
    public void setServiceCharacteristic(List<ServiceCharacteristic> serviceCharacteristic) {
        this.serviceCharacteristic = serviceCharacteristic;
    }

    @JsonProperty("relatedParty")
    public List<RelatedParty> getRelatedParty() {
        return relatedParty;
    }

    @JsonProperty("relatedParty")
    public void setRelatedParty(List<RelatedParty> relatedParty) {
        this.relatedParty = relatedParty;
    }

    @JsonProperty("serviceSpecification")
    public ServiceSpecification getServiceSpecification() {
        return serviceSpecification;
    }

    @JsonProperty("serviceSpecification")
    public void setServiceSpecification(ServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }



}