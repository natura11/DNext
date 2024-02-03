package optiim.models.api.aggregation.corporate;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "attachmentType",
        "description",
        "mimeType",
        "name",
        "size",
        "url"
})
@Generated("jsonschema2pojo")
public class Attachment {

    @JsonProperty("attachmentType")
    private String attachmentType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("mimeType")
    private String mimeType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("size")
    private Size size;
    @JsonProperty("url")
    private String url;

    @JsonProperty("attachmentType")
    public String getAttachmentType() {
        return attachmentType;
    }

    @JsonProperty("attachmentType")
    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("mimeType")
    public String getMimeType() {
        return mimeType;
    }

    @JsonProperty("mimeType")
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Size size) {
        this.size = size;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

}