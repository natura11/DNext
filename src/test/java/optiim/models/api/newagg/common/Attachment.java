package optiim.models.api.newagg.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "derivedFrom",
        "attachmentType"
})
@Generated("jsonschema2pojo")
public class Attachment {
    @JsonProperty("derivedFrom")
    private String derivedFrom;
    @JsonProperty("attachmentType")
    private String attachmentType;

    @JsonProperty("derivedFrom")
    public String getDerivedFrom() {
        return derivedFrom;
    }

    @JsonProperty("derivedFrom")
    public void setDerivedFrom(String derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    @JsonProperty("attachmentType")
    public String getAttachmentType() {
        return attachmentType;
    }

    @JsonProperty("attachmentType")
    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }
}