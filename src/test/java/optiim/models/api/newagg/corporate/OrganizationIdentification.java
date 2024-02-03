package optiim.models.api.newagg.corporate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.newagg.common.Attachment;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "identificationType",
        "identificationId",
        "issuingDate",
        "attachment"
})
@Generated("jsonschema2pojo")
public class OrganizationIdentification {
    @JsonProperty("identificationType")
    private String identificationType;
    @JsonProperty("identificationId")
    private String identificationId;
    @JsonProperty("issuingDate")
    private String issuingDate;
    @JsonProperty("attachment")
    private Attachment attachment;

    @JsonProperty("identificationType")
    public String getIdentificationType() {
        return identificationType;
    }

    @JsonProperty("identificationType")
    public void setIdentificationType(String identificationType) {
        this.identificationType = identificationType;
    }

    @JsonProperty("identificationId")
    public String getIdentificationId() {
        return identificationId;
    }

    @JsonProperty("identificationId")
    public void setIdentificationId(String identificationId) {
        this.identificationId = identificationId;
    }

    @JsonProperty("issuingDate")
    public String getIssuingDate() {
        return issuingDate;
    }

    @JsonProperty("issuingDate")
    public void setIssuingDate(String issuingDate) {
        this.issuingDate = issuingDate;
    }

    @JsonProperty("attachment")
    public Attachment getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }
}