package optiim.models.api.newagg.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "city",
        "streetName",
        "streetSuffix",
        "country",
        "geographicSubAddress",
        "name",
        "streetType",
        "postcode",
        "@type"
})
public class GeoAddressValue {
    @JsonProperty("city")
    private String city;
    @JsonProperty("streetName")
    private String streetName;
    @JsonProperty("streetSuffix")
    private String streetSuffix;
    @JsonProperty("country")
    private String country;
    @JsonProperty("geographicSubAddress")
    private List<GeographicSubAddress> geographicSubAddress = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("streetType")
    private String streetType;
    @JsonProperty("postcode")
    private String postcode;
    @JsonProperty("@type")
    private String type;

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("streetName")
    public String getStreetName() {
        return streetName;
    }

    @JsonProperty("streetName")
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @JsonProperty("streetSuffix")
    public String getStreetSuffix() {
        return streetSuffix;
    }

    @JsonProperty("streetSuffix")
    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("geographicSubAddress")
    public List<GeographicSubAddress> getGeographicSubAddress() {
        return geographicSubAddress;
    }

    @JsonProperty("geographicSubAddress")
    public void setGeographicSubAddress(List<GeographicSubAddress> geographicSubAddress) {
        this.geographicSubAddress = geographicSubAddress;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("streetType")
    public String getStreetType() {
        return streetType;
    }

    @JsonProperty("streetType")
    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }
}