package optiim.models.api.communicationmanagement.email;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "href",
        "content",
        "description",
        "logFlag",
        "messageType",
        "priority",
        "scheduledSendTime",
        "sendTime",
        "sendTimeComplete",
        "subject",
        "tryTimes",
        "attachment",
        "characteristic",
        "receiver",
        "sender",
        "state",
        "@baseType",
        "@schemaLocation",
        "@type"

})
public class CreateEmailMessageResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("href")
    private String href;
    @JsonProperty("content")
    private String content;
    @JsonProperty("description")
    private String description;
    @JsonProperty("logFlag")
    private Boolean logFlag;
    @JsonProperty("messageType")
    private String messageType;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("scheduledSendTime")
    private String scheduledSendTime;
    @JsonProperty("sendTime")
    private String sendTime;
    @JsonProperty("sendTimeComplete")
    private String sendTimeComplete;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("tryTimes")
    private String tryTimes;
    @JsonProperty("attachment")
    private String attachment;
    @JsonProperty("characteristic")
    private String characteristic;
    @JsonProperty("receiver")
    private List<ReceiverResponse> receiverResponses = null;
    @JsonProperty("sender")
        private List<SenderResponse> senderResponses = null;
    @JsonProperty("state")
    private String state;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("logFlag")
    public Boolean getLogFlag() {
        return logFlag;
    }

    @JsonProperty("logFlag")
    public void setLogFlag(Boolean logFlag) {
        this.logFlag = logFlag;
    }

    @JsonProperty("messageType")
    public String getMessageType() {
        return messageType;
    }

    @JsonProperty("messageType")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @JsonProperty("scheduledSendTime")
    public String getScheduledSendTime() {
        return scheduledSendTime;
    }

    @JsonProperty("scheduledSendTime")
    public void setScheduledSendTime(String scheduledSendTime) {
        this.scheduledSendTime = scheduledSendTime;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("sendTime")
    public String getSendTime() {
        return sendTime;
    }

    @JsonProperty("sendTime")
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    @JsonProperty("sendTimeComplete")
    public String getSendTimeComplete() {
        return sendTimeComplete;
    }

    @JsonProperty("sendTimeComplete")
    public void setSendTimeComplete(String sendTimeComplete) {
        this.sendTimeComplete = sendTimeComplete;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("tryTimes")
    public String getTryTimes() {
        return tryTimes;
    }

    @JsonProperty("tryTimes")
    public void setTryTimes(String tryTimes) {
        this.tryTimes = tryTimes;
    }

    @JsonProperty("characteristic")
    public String getCharacteristic() {
        return characteristic;
    }

    @JsonProperty("characteristic")
    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    @JsonProperty("attachment")
    public String getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("receiver")
    public List<ReceiverResponse> getReceiverResponses() {
        return receiverResponses;
    }

    @JsonProperty("receiver")
    public void setReceiverResponses(List<ReceiverResponse> receiverResponses) {
        this.receiverResponses = receiverResponses;
    }

    @JsonProperty("sender")
    public List<SenderResponse> getSenderResponses() {
        return senderResponses;
    }

    @JsonProperty("sender")
    public void setSenderResponses(List<SenderResponse> senderResponses) {
        this.senderResponses = senderResponses;
    }

    @JsonProperty("state")
    public Object getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("@baseType")
    public String getBaseType() {
        return baseType;
    }

    @JsonProperty("@baseType")
    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    @JsonProperty("@schemaLocation")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    @JsonProperty("@schemaLocation")
    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
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