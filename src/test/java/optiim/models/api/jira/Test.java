package optiim.models.api.jira;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "testKey",
        "start",
        "finish",
        "comment",
        "status"
})
public class Test {

    @JsonProperty("testKey")
    private String testKey;
    @JsonProperty("start")
    private String start;
    @JsonProperty("finish")
    private String finish;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("status")
    private String status;
    private List<Evidence> evidences = null;

    @JsonProperty("testKey")
    public String getTestKey() {
        return testKey;
    }

    @JsonProperty("testKey")
    public void setTestKey(String testKey) {
        this.testKey = testKey;
    }

    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(String start) {
        this.start = start;
    }

    @JsonProperty("finish")
    public String getFinish() {
        return finish;
    }

    @JsonProperty("finish")
    public void setFinish(String finish) {
        this.finish = finish;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("evidences")
    public List<Evidence> getEvidences() {
        return evidences;
    }

    @JsonProperty("tests")
    public void setEvidences(List<Evidence> evidences) {
        this.evidences = evidences;
    }

}