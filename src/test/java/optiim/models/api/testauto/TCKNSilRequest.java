package optiim.models.api.testauto;

import com.fasterxml.jackson.annotation.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "user_id",
        "musteri_id"
})
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class TCKNSilRequest {

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("musteri_id")
    private Integer musteriId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("musteri_id")
    public Integer getMusteriId() {
        return musteriId;
    }

    @JsonProperty("musteri_id")
    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}