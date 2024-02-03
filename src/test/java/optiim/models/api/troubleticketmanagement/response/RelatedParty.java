package optiim.models.api.troubleticketmanagement.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "href",
        "name",
        "role",
        "@baseType",
        "@schemaLocation",
        "@type",
        "@referredType"
})
public class RelatedParty {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private String role;
    @JsonProperty("@baseType")
    private Object baseType;
    @JsonProperty("@schemaLocation")
    private Object schemaLocation;
    @JsonProperty("@type")
    private Object type;
    @JsonProperty("@referredType")
    private String referredType;

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

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("@baseType")
    public Object getBaseType() {
        return baseType;
    }

    @JsonProperty("@baseType")
    public void setBaseType(Object baseType) {
        this.baseType = baseType;
    }

    @JsonProperty("@schemaLocation")
    public Object getSchemaLocation() {
        return schemaLocation;
    }

    @JsonProperty("@schemaLocation")
    public void setSchemaLocation(Object schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    @JsonProperty("@type")
    public Object getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(Object type) {
        this.type = type;
    }

    @JsonProperty("@referredType")
    public String getReferredType() {
        return referredType;
    }

    @JsonProperty("@referredType")
    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }


}