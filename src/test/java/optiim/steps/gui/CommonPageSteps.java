package optiim.steps.gui;

import optiim.framework.Props;
import optiim.framework.UrlBuilder;
import optiim.framework.helpers.WebDriverHelper;
import optiim.models.data.GetData;
import optiim.models.data.gui.customercasemanagement.MenuCusCaseMan;
import optiim.models.data.gui.customermanegement.MenuCusMan;
import optiim.models.data.gui.dcase.Menu;
import optiim.pages.CommonPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CommonPageSteps {
    private final WebDriverHelper webDriverHelper;
    private final UrlBuilder urlBuilder;
    private final CommonPage commonPage;


    @Given("I have opened the {string} application")
    public void I_have_opened_the_application(String app) throws Throwable {
        Thread.sleep(500);
        Props props = new Props();
        String url = "";

        switch (app) {
            case "Customer Case Management":
                url = props.getProp("customercasemanagement.site.url");
                break;
            case "Product Catalog":
                url = props.getProp("productcatalog.site.url");
                break;
            case "Customer Management":
                url = props.getProp("customermanagement.site.url");
//              url = props.getProp("dev.gks.site.url");
                break;
            case "DCase":
                url = props.getProp("dcase.site.url");
                break;
            case "Case Management":
                url = props.getProp("casemanagement.site.url");
                break;
            case "Back Office":
                url = props.getProp("backoffice.site.url");
                break;
            default:
                // code block
        }

        webDriverHelper.getDriver().navigate().to(url);

        GetData.ENVIRONMENT = app;

    }

    @When("I open {string} menu")
    public void I_open_menu(String menu) throws Throwable {
        Thread.sleep(7500);
        switch (GetData.ENVIRONMENT) {
            case "Product Catalog":
                openMenuInProductCatalog(menu);
                break;
            case "DCase":
                //todo
                break;
            case "Customer Management":
                openMenuInCustomerManagement(menu);
                break;
            case "Customer Case Management":
                openMenuInCustomerCaseManagement(menu);
                break;
        }


    }

    private void openMenuInCustomerCaseManagement(String menu) throws InterruptedException {
        switch (menu) {
            case MenuCusCaseMan.widget:
                commonPage
                        .openMenuCusCaseMan(MenuCusCaseMan.widget);
                break;
            case MenuCusCaseMan.extendedWidget:
                commonPage
                        .openMenuCusCaseMan(MenuCusCaseMan.extendedWidget);
                break;
        }
    }

    private void openMenuInDCase(String menu) throws InterruptedException {
        switch (menu) {
            case Menu.Tickets.createTicket:
                commonPage
                        .openMenuDCase(Menu.tickets, Menu.Tickets.createTicket);
                break;
            case Menu.Tickets.myTickets:
                commonPage
                        .openMenuDCase(Menu.tickets, Menu.Tickets.myTickets);
            case Menu.Users.userDirectory:
                commonPage
                        .openMenuDCase(Menu.users, Menu.Users.userDirectory);
                break;
        }

    }


    private void openMenuInCustomerManagement(String menu) throws InterruptedException {
        switch (menu) {
            case MenuCusMan.createIndividualCustomer:
                commonPage
                        .openMenuCusMan(MenuCusMan.createIndividualCustomer);
                break;
            case MenuCusMan.createEnterpriseCustomer:
                commonPage
                        .openMenuCusMan(MenuCusMan.createEnterpriseCustomer);
                break;
            case MenuCusMan.search:
                commonPage
                        .openMenuCusMan(MenuCusMan.search);
                break;
            case MenuCusMan.customers:
                commonPage
                        .openMenuCusMan(MenuCusMan.customers);
                break;
            case MenuCusMan.enterpriseParentAccount:
                commonPage
                        .openMenuCusMan(MenuCusMan.enterpriseParentAccount);
                break;
            case MenuCusMan.customer360:
                commonPage
                        .openMenuCusMan(MenuCusMan.customer360);
                break;
            case MenuCusMan.createInstituteCustomer:
                commonPage
                        .openMenuCusMan(MenuCusMan.createInstituteCustomer);
                break;
            case MenuCusMan.partner:
                commonPage
                        .openMenuCusMan(MenuCusMan.partner);
                break;
        }

    }

    private void openMenuInProductCatalog(String menu) throws InterruptedException {

        commonPage
                .openMenuProductCatalog(menu);
    }

    @Then("I should be seeing {string} page")
    public void I_should_be_seeing_page(String page) throws Throwable {

        commonPage
                .controlPage(page);
    }


    @Then("I should be seeing that {string}  Page Url")
    public void ıShouldBeSeeingThatPageUrl(String pageUrl) throws Throwable {
        commonPage
                .controlPageUrl(pageUrl);
    }
}
