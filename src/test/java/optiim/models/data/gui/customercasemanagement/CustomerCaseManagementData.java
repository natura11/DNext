package optiim.models.data.gui.customercasemanagement;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCaseManagementData {

    //Web Parameters
    private String ticketSubjectName;
    private String ticketId;
    private String ticketDescription;
    private String ticketStatus;
    private String ticketPriority;
    private String ticketCaseType;
    private String ticketCreatedDate;
    private String ticketExpectedResolutionDate;
    private String ticketSubTypes;
    private String ticketProductInformation;
    private String ticketInstallationTicketNumber;
    private String ticketIssueCategory;

    public CustomerCaseManagementData() {

    }
}
