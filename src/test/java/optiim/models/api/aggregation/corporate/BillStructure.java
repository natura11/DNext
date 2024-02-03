package optiim.models.api.aggregation.corporate;

import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "presentationMedia"
})
@Generated("jsonschema2pojo")
public class BillStructure {

    @JsonProperty("presentationMedia")
    private List<PresentationMedium> presentationMedia = null;

    @JsonProperty("presentationMedia")
    public List<PresentationMedium> getPresentationMedia() {
        return presentationMedia;
    }

    @JsonProperty("presentationMedia")
    public void setPresentationMedia(List<PresentationMedium> presentationMedia) {
        this.presentationMedia = presentationMedia;
    }

}