package optiim.models.api.sellcoaxoffer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "code",
        "message",
        "modemExistFlag",
        "modemMacAddress",
        "modemCid",
        "modemStatus",
        "modemCid2"
})
public class RetrieveDocsisModemDetailsFromDocsisResponse {

    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private Object message;
    @JsonProperty("modemExistFlag")
    private Boolean modemExistFlag;
    @JsonProperty("modemMacAddress")
    private String modemMacAddress;
    @JsonProperty("modemCid")
    private String modemCid;
    @JsonProperty("modemStatus")
    private String modemStatus;
    @JsonProperty("modemCid2")
    private String modemCid2;

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("message")
    public Object getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Object message) {
        this.message = message;
    }

    @JsonProperty("modemExistFlag")
    public Boolean getModemExistFlag() {
        return modemExistFlag;
    }

    @JsonProperty("modemExistFlag")
    public void setModemExistFlag(Boolean modemExistFlag) {
        this.modemExistFlag = modemExistFlag;
    }

    @JsonProperty("modemMacAddress")
    public String getModemMacAddress() {
        return modemMacAddress;
    }

    @JsonProperty("modemMacAddress")
    public void setModemMacAddress(String modemMacAddress) {
        this.modemMacAddress = modemMacAddress;
    }

    @JsonProperty("modemCid")
    public String getModemCid() {
        return modemCid;
    }

    @JsonProperty("modemCid")
    public void setModemCid(String modemCid) {
        this.modemCid = modemCid;
    }

    @JsonProperty("modemStatus")
    public String getModemStatus() {
        return modemStatus;
    }

    @JsonProperty("modemStatus")
    public void setModemStatus(String modemStatus) {
        this.modemStatus = modemStatus;
    }

    @JsonProperty("modemCid2")
    public String getModemCid2() {
        return modemCid2;
    }

    @JsonProperty("modemCid2")
    public void setModemCid2(String modemCid2) {
        this.modemCid2 = modemCid2;
    }



}