package optiim.models.api.jira;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "info",
        "tests",
        "testExecutionKey"
})
public class XRAYExecutionResults {

    @JsonProperty("info")
    private Info info;
    @JsonProperty("testExecutionKey")
    private String testExecutionKey;
    @JsonProperty("tests")
    private List<Test> tests = null;

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("tests")
    public List<Test> getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    @JsonProperty("testExecutionKey")
    public String gettestExecutionKey() {
        return testExecutionKey;
    }

    @JsonProperty("testExecutionKey")
    public void settestExecutionKey(String testExecutionKey) {
        this.testExecutionKey = testExecutionKey;
    }



}