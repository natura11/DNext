package optiim.steps.api.tickets;

import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import optiim.models.api.tickets.*;
import optiim.models.api.troubleticketmanagement.response.PiaExtension;
import optiim.models.data.api.ApiData;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CreateTroubleTicketSteps {

    private final WorldHelper worldHelper;
    private final ApiData apiData;

    public CreateTroubleTicketSteps(WorldHelper worldHelper, ApiData apiData) {
        this.worldHelper = worldHelper;
        this.apiData = apiData;
    }

    @DataTableType
    public CreateTroubleTicketRequest createTroubleTicketRequest(Map<String, String> entry) {

        CreateTroubleTicketRequest createTroubleTicketRequest = new CreateTroubleTicketRequest();

        createTroubleTicketRequest.setDescription("This is description");
        createTroubleTicketRequest.setName("This is After Sales Issues Case Type ticket");
        createTroubleTicketRequest.setPriority("Urgent");
        createTroubleTicketRequest.setSeverity("Minor");
        createTroubleTicketRequest.setTicketType("After Sales Issues Case Type");
        createTroubleTicketRequest.setType("TroubleTicket");

        RelatedPartyRequest relatedPartyRequest = new RelatedPartyRequest();
        relatedPartyRequest.setId("9176");
        relatedPartyRequest.setHref("https://host:port/partyManagement/v1/customer/9176");
        relatedPartyRequest.setName("Jack Smith");
        relatedPartyRequest.setRole("customer");
        relatedPartyRequest.setReferredType("Customer");
        createTroubleTicketRequest.setRelatedPartyRequest(relatedPartyRequest);

        PiaExtension piaExtension = new PiaExtension();

        List<CustomFieldValuePair> customFieldValuePairList = new ArrayList<>();

        CustomFieldValuePair customFieldValuePair1 = new CustomFieldValuePair();
        customFieldValuePair1.setId("75");
        customFieldValuePair1.setValue("Service Interruption");
        customFieldValuePairList.add(customFieldValuePair1);

        CustomFieldValuePair customFieldValuePair2 = new CustomFieldValuePair();
        customFieldValuePair2.setId("75");
        customFieldValuePair2.setValue("Service Loss");
        customFieldValuePairList.add(customFieldValuePair2);

        CustomFieldValuePair customFieldValuePair3 = new CustomFieldValuePair();
        customFieldValuePair3.setId("75");
        customFieldValuePair3.setValue("Slow Internet");
        customFieldValuePairList.add(customFieldValuePair3);

        CustomFieldValuePair customFieldValuePair4 = new CustomFieldValuePair();
        customFieldValuePair4.setId("75");
        customFieldValuePair4.setValue("IP Issue");
        customFieldValuePairList.add(customFieldValuePair4);

        CustomFieldValuePair customFieldValuePair5 = new CustomFieldValuePair();
        customFieldValuePair5.setId("76");
        customFieldValuePair5.setValue("Node Issue");
        customFieldValuePairList.add(customFieldValuePair5);

        CustomFieldValuePair customFieldValuePair6 = new CustomFieldValuePair();
        customFieldValuePair6.setId("76");
        customFieldValuePair6.setValue("Fiber Cut");
        customFieldValuePairList.add(customFieldValuePair6);

        CustomFieldValuePair customFieldValuePair7 = new CustomFieldValuePair();
        customFieldValuePair7.setId("76");
        customFieldValuePair7.setValue("Coaxial Cut");
        customFieldValuePairList.add(customFieldValuePair7);

        CustomFieldValuePair customFieldValuePair8 = new CustomFieldValuePair();
        customFieldValuePair8.setId("76");
        customFieldValuePair8.setValue("Authentication Issue");
        customFieldValuePairList.add(customFieldValuePair8);

        CustomFieldValuePair customFieldValuePair9 = new CustomFieldValuePair();
        customFieldValuePair9.setId("76");
        customFieldValuePair9.setValue("No-Internet Configuration File");
        customFieldValuePairList.add(customFieldValuePair9);

        CustomFieldValuePair customFieldValuePair10 = new CustomFieldValuePair();
        customFieldValuePair10.setId("76");
        customFieldValuePair10.setValue("GIS Fault");
        customFieldValuePairList.add(customFieldValuePair10);

        CustomFieldValuePair customFieldValuePair11 = new CustomFieldValuePair();
        customFieldValuePair11.setId("76");
        customFieldValuePair11.setValue("Connector Fault");
        customFieldValuePairList.add(customFieldValuePair11);

        CustomFieldValuePair customFieldValuePair12 = new CustomFieldValuePair();
        customFieldValuePair12.setId("76");
        customFieldValuePair12.setValue("Tap Signal Issue");
        customFieldValuePairList.add(customFieldValuePair12);

        CustomFieldValuePair customFieldValuePair13 = new CustomFieldValuePair();
        customFieldValuePair13.setId("77");
        customFieldValuePair13.setValue("WiFi Authentication Failure");
        customFieldValuePairList.add(customFieldValuePair13);

        CustomFieldValuePair customFieldValuePair14 = new CustomFieldValuePair();
        customFieldValuePair14.setId("77");
        customFieldValuePair14.setValue("WiFi Configuration Issue");
        customFieldValuePairList.add(customFieldValuePair14);

        CustomFieldValuePair customFieldValuePair15 = new CustomFieldValuePair();
        customFieldValuePair15.setId("77");
        customFieldValuePair15.setValue("Coverage Issue");
        customFieldValuePairList.add(customFieldValuePair15);

        CustomFieldValuePair customFieldValuePair16 = new CustomFieldValuePair();
        customFieldValuePair16.setId("77");
        customFieldValuePair16.setValue("Interference Issue");
        customFieldValuePairList.add(customFieldValuePair16);

        CustomFieldValuePair customFieldValuePair17 = new CustomFieldValuePair();
        customFieldValuePair17.setId("77");
        customFieldValuePair17.setValue("Booster Problem");
        customFieldValuePairList.add(customFieldValuePair17);

        CustomFieldValuePair customFieldValuePair18 = new CustomFieldValuePair();
        customFieldValuePair18.setId("78");
        customFieldValuePair18.setValue("No Access");
        customFieldValuePairList.add(customFieldValuePair18);

        CustomFieldValuePair customFieldValuePair19 = new CustomFieldValuePair();
        customFieldValuePair19.setId("78");
        customFieldValuePair19.setValue("OSS Code");
        customFieldValuePairList.add(customFieldValuePair19);

        CustomFieldValuePair customFieldValuePair20 = new CustomFieldValuePair();
        customFieldValuePair20.setId("78");
        customFieldValuePair20.setValue("Scrambled Channel");
        customFieldValuePairList.add(customFieldValuePair20);

        CustomFieldValuePair customFieldValuePair21 = new CustomFieldValuePair();
        customFieldValuePair21.setId("79");
        customFieldValuePair21.setValue("No Signals");
        customFieldValuePairList.add(customFieldValuePair21);

        CustomFieldValuePair customFieldValuePair22 = new CustomFieldValuePair();
        customFieldValuePair22.setId("79");
        customFieldValuePair22.setValue("Some Channels Missing, Signal Frequency Issue");
        customFieldValuePairList.add(customFieldValuePair22);

        CustomFieldValuePair customFieldValuePair23 = new CustomFieldValuePair();
        customFieldValuePair23.setId("80");
        customFieldValuePair23.setValue("Number Not Configured");
        customFieldValuePairList.add(customFieldValuePair23);

        CustomFieldValuePair customFieldValuePair24 = new CustomFieldValuePair();
        customFieldValuePair24.setId("80");
        customFieldValuePair24.setValue("Number Not Ported In");
        customFieldValuePairList.add(customFieldValuePair24);

        CustomFieldValuePair customFieldValuePair25 = new CustomFieldValuePair();
        customFieldValuePair25.setId("80");
        customFieldValuePair25.setValue("CPE Does Not Support Telephony Service");
        customFieldValuePairList.add(customFieldValuePair25);

        CustomFieldValuePair customFieldValuePair26 = new CustomFieldValuePair();
        customFieldValuePair26.setId("80");
        customFieldValuePair26.setValue("Issue With Customer Device");
        customFieldValuePairList.add(customFieldValuePair26);

        CustomFieldValuePair customFieldValuePair27 = new CustomFieldValuePair();
        customFieldValuePair27.setId("80");
        customFieldValuePair27.setValue("Issue With Internet");
        customFieldValuePairList.add(customFieldValuePair27);

        CustomFieldValuePair customFieldValuePair28 = new CustomFieldValuePair();
        customFieldValuePair28.setId("80");
        customFieldValuePair28.setValue("Inbound Calls Issue");
        customFieldValuePairList.add(customFieldValuePair28);


        CustomFieldValuePair customFieldValuePair29 = new CustomFieldValuePair();
        customFieldValuePair29.setId("80");
        customFieldValuePair29.setValue("Outbound Calls Issue");
        customFieldValuePairList.add(customFieldValuePair29);

        CustomFieldValuePair customFieldValuePair30 = new CustomFieldValuePair();
        customFieldValuePair30.setId("80");
        customFieldValuePair30.setValue("Dropped Call");
        customFieldValuePairList.add(customFieldValuePair30);

        CustomFieldValuePair customFieldValuePair31 = new CustomFieldValuePair();
        customFieldValuePair31.setId("80");
        customFieldValuePair31.setValue("Audio Issues/ Echo");
        customFieldValuePairList.add(customFieldValuePair31);

        CustomFieldValuePair customFieldValuePair32 = new CustomFieldValuePair();
        customFieldValuePair32.setId("81");
        customFieldValuePair32.setValue("UI Not Accessible");
        customFieldValuePairList.add(customFieldValuePair32);

        CustomFieldValuePair customFieldValuePair33 = new CustomFieldValuePair();
        customFieldValuePair33.setId("81");
        customFieldValuePair33.setValue("No Traffic");
        customFieldValuePairList.add(customFieldValuePair33);

        CustomFieldValuePair customFieldValuePair34 = new CustomFieldValuePair();
        customFieldValuePair34.setId("81");
        customFieldValuePair34.setValue("Restart");
        customFieldValuePairList.add(customFieldValuePair34);

        CustomFieldValuePair customFieldValuePair35 = new CustomFieldValuePair();
        customFieldValuePair35.setId("81");
        customFieldValuePair35.setValue("Reset");
        customFieldValuePairList.add(customFieldValuePair35);

        CustomFieldValuePair customFieldValuePair36 = new CustomFieldValuePair();
        customFieldValuePair36.setId("81");
        customFieldValuePair36.setValue("WiFi Card Issue");
        customFieldValuePairList.add(customFieldValuePair36);

        CustomFieldValuePair customFieldValuePair37 = new CustomFieldValuePair();
        customFieldValuePair37.setId("81");
        customFieldValuePair37.setValue("LAN Port Issue");
        customFieldValuePairList.add(customFieldValuePair37);

        CustomFieldValuePair customFieldValuePair38 = new CustomFieldValuePair();
        customFieldValuePair38.setId("81");
        customFieldValuePair38.setValue("Power Adapter Failure");
        customFieldValuePairList.add(customFieldValuePair38);

        CustomFieldValuePair customFieldValuePair39 = new CustomFieldValuePair();
        customFieldValuePair39.setId("81");
        customFieldValuePair39.setValue("Power Unit Failure");
        customFieldValuePairList.add(customFieldValuePair39);

        CustomFieldValuePair customFieldValuePair40 = new CustomFieldValuePair();
        customFieldValuePair40.setId("81");
        customFieldValuePair40.setValue("LAN Issue");
        customFieldValuePairList.add(customFieldValuePair40);

        CustomFieldValuePair customFieldValuePair41 = new CustomFieldValuePair();
        customFieldValuePair41.setId("81");
        customFieldValuePair41.setValue("Issue With Customer Personal CPE");
        customFieldValuePairList.add(customFieldValuePair41);

        CustomFieldValuePair customFieldValuePair42 = new CustomFieldValuePair();
        customFieldValuePair42.setId("81");
        customFieldValuePair42.setValue("Not Processing US/DS Signal");
        customFieldValuePairList.add(customFieldValuePair42);

        CustomFieldValuePair customFieldValuePair43 = new CustomFieldValuePair();
        customFieldValuePair43.setId("81");
        customFieldValuePair43.setValue("HDMI Cable Issue");
        customFieldValuePairList.add(customFieldValuePair43);

        CustomFieldValuePair customFieldValuePair44 = new CustomFieldValuePair();
        customFieldValuePair44.setId("81");
        customFieldValuePair44.setValue("STB HDMI Port Failure");
        customFieldValuePairList.add(customFieldValuePair44);

        CustomFieldValuePair customFieldValuePair45 = new CustomFieldValuePair();
        customFieldValuePair45.setId("81");
        customFieldValuePair45.setValue("TV HDMI Port Failure");
        customFieldValuePairList.add(customFieldValuePair45);

        CustomFieldValuePair customFieldValuePair46 = new CustomFieldValuePair();
        customFieldValuePair46.setId("81");
        customFieldValuePair46.setValue("Smart Card Issue");
        customFieldValuePairList.add(customFieldValuePair46);

        CustomFieldValuePair customFieldValuePair47 = new CustomFieldValuePair();
        customFieldValuePair47.setId("81");
        customFieldValuePair47.setValue("RCU Issue");
        customFieldValuePairList.add(customFieldValuePair47);

        CustomFieldValuePair customFieldValuePair48 = new CustomFieldValuePair();
        customFieldValuePair48.setId("91");
        customFieldValuePair48.setValue("112");
        customFieldValuePairList.add(customFieldValuePair48);

        piaExtension.setCustomFieldValuePair(customFieldValuePairList);
        createTroubleTicketRequest.setPiaExtension(piaExtension);

        createTroubleTicketRequest.setType("TroubleTicket");


        return createTroubleTicketRequest;
    }



    @When("I Create Trouble Ticket After Sales Issues Case Type API")
    public void i_Create_Trouble_Ticket_After_Sales_Issues_Case_Type_API(CreateTroubleTicketRequest createTroubleTicketRequest) {
//        CreateTroubleTicketsResponse lttr = TestAutoApi.createTroubleTickets(createTroubleTicketRequest);
        log.info("Api worked.");
        log.info("Created trouble ticket.");
    }

}
