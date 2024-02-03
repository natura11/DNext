package optiim.models.api.communicationmanagement.sms;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import optiim.models.api.communicationmanagement.email.Receiver;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "@baseType",
        "@schemaLocation",
        "@type",
        "attachment",
        "characteristic",
        "content",
        "description",
        "logFlag",
        "messageType",
        "priority",
        "receiver",
        "scheduledSendTime",
        "sendTime",
        "sendTimeComplete",
        "sender",
        "state",
        "subject",
        "tryTimes"
})

public class CreateSMSMessageRequest {

    @JsonProperty("@baseTyp")
    private String baseTyp;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@type")
    private String type;
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
    @JsonProperty("state")
    private String state;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("attachment")
    private Attachment attachment;
    @JsonProperty("characteristic")
    private CharacteristicRequest characteristicRequest;
    @JsonProperty("receiver")
    private Receiver receiverRequest;
    @JsonProperty("sender")
    private Sender sender;
    @JsonProperty("tryTimes")
    private String tryTimes;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//

    @JsonProperty("@baseTyp")
    public String getBaseTyp() {
        return baseTyp;
    }

    @JsonProperty("@baseTyp")
    public void setBaseTyp(String baseTyp) {
        this.baseTyp = baseTyp;
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

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("scheduledSendTime")
    public String getScheduledSendTime() {
        return scheduledSendTime;
    }

    @JsonProperty("scheduledSendTime")
    public void setScheduledSendTime(String scheduledSendTime) {
        this.scheduledSendTime = scheduledSendTime;
    }

    @JsonProperty("sendTime")
    public String getSendTime() {
        return sendTime;
    }

    @JsonProperty("sendTime")
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    @JsonProperty("tryTimes")
    public String getTryTimes() {
        return tryTimes;
    }

    @JsonProperty("tryTimes")
    public void setTryTimes(String tryTimes) {
        this.tryTimes = tryTimes;
    }

    @JsonProperty("sendTimeComplete")
    public String getSendTimeComplete() {
        return sendTimeComplete;
    }

    @JsonProperty("sendTimeComplete")
    public void setSendTimeComplete(String sendTimeComplete) {
        this.sendTimeComplete = sendTimeComplete;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("attachment")
    public Attachment getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("characteristic")
    public CharacteristicRequest getCharacteristic() {
        return characteristicRequest;
    }

    @JsonProperty("attachment")
    public void setCharacteristic(CharacteristicRequest characteristicRequest) {
        this.characteristicRequest = characteristicRequest;
    }

    @JsonProperty("receiver")
    public Receiver getReceiverRequest() {
        return receiverRequest;
    }

    @JsonProperty("receiver")
    public void setReceiverRequest(Receiver receiverRequest) {
        this.receiverRequest = receiverRequest;
    }

    @JsonProperty("sender")
    public Sender getSender() {
        return sender;
    }

    @JsonProperty("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
    }


//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }


}
