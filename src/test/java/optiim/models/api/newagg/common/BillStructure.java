package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "presentationMedia",
        "preferredBillingCurrency",
        "cycleSpecification"
})
@Generated("jsonschema2pojo")
public class BillStructure {
    @JsonProperty("presentationMedia")
    private List<PresentationMedia> presentationMedia = null;
    @JsonProperty("preferredBillingCurrency")
    private String preferredBillingCurrency;
    @JsonProperty("cycleSpecification")
    private CycleSpecification cycleSpecification;

    @JsonProperty("presentationMedia")
    public List<PresentationMedia> getPresentationMedia() {
        return presentationMedia;
    }

    @JsonProperty("presentationMedia")
    public void setPresentationMedia(List<PresentationMedia> presentationMedia) {
        this.presentationMedia = presentationMedia;
    }

    @JsonProperty("preferredBillingCurrency")
    public String getPreferredBillingCurrency() {
        return preferredBillingCurrency;
    }

    @JsonProperty("preferredBillingCurrency")
    public void setPreferredBillingCurrency(String preferredBillingCurrency) {
        this.preferredBillingCurrency = preferredBillingCurrency;
    }

    @JsonProperty("cycleSpecification")
    public CycleSpecification getCycleSpecification() {
        return cycleSpecification;
    }

    @JsonProperty("cycleSpecification")
    public void setCycleSpecification(CycleSpecification cycleSpecification) {
        this.cycleSpecification = cycleSpecification;
    }
}