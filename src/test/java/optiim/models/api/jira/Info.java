package optiim.models.api.jira;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "summary",
        "description",
        "user",
        "revision",
        "startDate",
        "testPlanKey",
        "finishDate"
})
public class Info {

    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("user")
    private String user;
    @JsonProperty("revision")
    private String revision;
    @JsonProperty("startDate")
    private String startDate;
    @JsonProperty("finishDate")
    private String finishDate;
    @JsonProperty("testPlanKey")
    private String testPlanKey;
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("revision")
    public String getRevision() {
        return revision;
    }

    @JsonProperty("revision")
    public void setRevision(String revision) {
        this.revision = revision;
    }

    @JsonProperty("startDate")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("finishDate")
    public String getFinishDate() {
        return finishDate;
    }

    @JsonProperty("finishDate")
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    @JsonProperty("testPlanKey")
    public String getTestPlanKey() {
        return testPlanKey;
    }

    @JsonProperty("testPlanKey")
    public void setTestPlanKey(String testPlanKey) {
        this.testPlanKey = testPlanKey;
    }


}
