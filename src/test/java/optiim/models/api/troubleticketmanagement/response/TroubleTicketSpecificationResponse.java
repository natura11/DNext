package optiim.models.api.troubleticketmanagement.response;

import com.fasterxml.jackson.annotation.*;
import optiim.models.api.tickets.Node;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "href",
        "name",
        "nodes"
})
public class TroubleTicketSpecificationResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nodes")
    private List<Node> nodes = null;
    @JsonIgnore
    private String status;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nodes")
    public List<Node> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @JsonAnyGetter
    public String getStatus() {
        return this.status;
    }

    @JsonAnySetter
    public void setStatus(String status) {
        this.status = status;
    }

}