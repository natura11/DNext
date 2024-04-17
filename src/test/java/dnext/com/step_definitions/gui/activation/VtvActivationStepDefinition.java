package dnext.com.step_definitions.gui.activation;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.activationPages.VerifyCoaxialActivationForPostpaidPage;
import dnext.com.pages.activationPages.VtvActivationPage;
import dnext.com.pages.faveo.LoginOfFaveo;
import dnext.com.pages.faveo.TicketDetailsPageOfFaveo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
public class VtvActivationStepDefinition extends BasePage {
    VtvActivationPage vtvActivationPage;
    LoginOfFaveo loginOfFaveo;
    TicketDetailsPageOfFaveo ticketDetailsPageOfFaveo;
    VerifyCoaxialActivationForPostpaidPage verifyCoaxialActivationForPostpaidPage;

    @Then("User is on the Customer360 page")
    public void user_is_on_the_customer360_page() {
        Utils.waitForVisibility(vtvActivationPage.customerSearchIcon,25);
        elementDisplayed(vtvActivationPage.customerSearchIcon);
        Utils.waitFor(1);
    }
    @Given("User clicks select Search Type field on Customer{int} search page")
    public void userClicksSelectSearchTypeFieldOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.selectSearchTypeBtn,10);
        clickField(vtvActivationPage.selectSearchTypeBtn);
    }

    @And("User selects Customer Name option from dropdown on Customer{int} search page")
    public void userSelectsCustomerNameOptionFromDropdownOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.selectSearchTypeWithCostomerName);
    }


    @And("User fills in enter Customer name field with valid name as {string}  on Customer{int} search page")
    public void userFillsInEnterCustomerNameFieldWithValidNameAsOnCustomerSearchPage(String name, int arg1) {
        sendKeys(vtvActivationPage.enterCustomerNamefield, name);
    }

    @And("User selects opened name of searched name on Customer{int} search page")
    public void userSelectsOpenedNameOfSearchedNameOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.searchedNameField);
    }

    @When("User clicks the Account tab on Customer{int} search page")
    public void userClicksTheAccountTabOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.accountButton,10);
        clickField(vtvActivationPage.accountButton);
    }

    @When("User clicks the New Order for prepaid rating type on Customer{int} search page")
    public void userClicksTheNewOrderForPrepaidRatingTypeOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.newOrderBtnOnPrepaid,10);
        clickField(vtvActivationPage.newOrderBtnOnPrepaid);
        Utils.waitFor(2);
    }

    @Then("User is redirected to the  product catalog on Customer{int} search page")
    public void userIsRedirectedToTheProductCatalogOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(VtvActivationPage.productsText, 15);
        warningMessage("Products", VtvActivationPage.productsText);

    }

    @When("User selects TV option from products on Customer{int} search page")
    public void userSelectsTVOptionFromProductsOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.tvOptionOnCheckBox,10);
        clickField(vtvActivationPage.tvOptionOnCheckBox);
    }

    @And("User clicks the search button under product list on Customer{int} search page")
    public void userClicksTheSearchButtonUnderProductListOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.searchBtnForPruductOption);

    }

    @When("User selects the Digitalb Premium Plus on Customer{int} search page")
    public void userSelectsTheDigitalbPremiumPlusonCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.digitalbPremiumPlusOption,10);
        clickField(vtvActivationPage.digitalbPremiumPlusOption);
    }

    @Then("User is directed to the Digitalb Premium Plus page for details of equipments on Customer{int} search page")
    public void userIsDirectedToTheDigitalbPremiumPlusPageForDetailsOfEquapmentsOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.digitalbPremiumPlusText,10);
        warningMessage("Digitalb Premium Plus",vtvActivationPage.digitalbPremiumPlusText);

    }

    @When("User selects cash methods as ALL{int} {int}Month on Customer{int} search page")
    public void userSelectsCashMethodsAsALLMonthOnCustomerSearchPage(int arg0, int arg1, int arg2) {
        Utils.waitForVisibility(vtvActivationPage.paymentOptionALL79003Month,10);
        clickField(vtvActivationPage.paymentOptionALL79003Month);
        Utils.waitFor(3);
    }

    @And("user clicks the TVInfrusructure dropdown button  Customer{int} search page")
    public void userClicksTheTVInfrusructureDropdownButtonCustomerSearchPage(int arg0) {
        Utils.waitFor(1);
        clickField(vtvActivationPage.dropdownForVtvOptions);
    }

    @And("User selects the Vtv as TVInfrustructure on Customer{int} search page")
    public void userSelectsTheVtvAsTVInfrustructureTOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.optionVtv);
    }

    @And("User selects Akses Fee per Dekoder Premium on Customer{int} search page")
    public void userSelectsAksesFeePerDekoderPremiumOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.addIconForAkesFeePerDokoderPremium, 10);
        clickField(vtvActivationPage.addIconForAkesFeePerDokoderPremium);
    }

    @And("User selects the ALL{int} {int}Month option as cash option on Customer{int} search page")
    public void userSelectsTheALLMonthOptionAsCashOptionOnCustomerSearchPage(int arg0, int arg1, int arg2) {
        Utils.waitForVisibility(vtvActivationPage.all03MonnthsForAkesFeePerDokoderPremium,10);
        clickField(vtvActivationPage.all03MonnthsForAkesFeePerDokoderPremium);
    }

    @And("User enters CasId on Customer{int} search page")
    public void userEntersCasIdOnCustomerSearchPage(int arg0) {
        vtvActivationPage.casIdFromFaker();
    }

    @And("User selects Tarife Instalimi from Purchasable Addons part on Customer{int} search page")
    public void userSelectsTarifeInstalimiFromPurchasableAddonsPartOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.addIconForTarifeInstalimi,10);
        clickField(vtvActivationPage.addIconForTarifeInstalimi);
    }

    @And("User selects ALL{int} {int}Month option as cash  method on Customer{int} search page")
    public void uaerSelectsALLMonthOptionAsCashMethodOnCustomerSearchPage(int arg0, int arg1, int arg2) {
        Utils.waitFor(10);
        clickField(VtvActivationPage.allMonthsOptionForTarifeInstalimi);
    }

    @And("User clicks the ADD to Cart button on Customer{int} search page")
    public void userClicksTheADDToCartButtonOnCustomerSearchPage(int arg0) {
        clickField(VtvActivationPage.addToCartBtn);
    }

    @Then("User should see warning as {string}on Customer{int} search page")
    public void userShouldSeeWarningAsOnCustomerSearchPage(String warning, int arg1) {
        Utils.waitForVisibility(vtvActivationPage.shoppingCartCreatedSuccesfullyMessage, 20);
        warningMessage(warning, vtvActivationPage.shoppingCartCreatedSuccesfullyMessage);
        Utils.waitFor(2);
    }

    @When("User clicks the Shopping Cart icon on Customer{int} search page")
    public void userClicksTheShoppingCartIconOnCustomerSearchPage(int arg0) {
        Utils.waitFor(2);
        clickField(vtvActivationPage.shoppingCartIcon);
        Utils.waitFor(3);
    }

    @Then("User sees the name of {string} which was selected product on VTV is in the Shopping Cart on Customer{int} search page")
    public void userSeesTheNameOfWhichWasSelectedProductOnVTVIsInTheShoppingCartOnCustomerSearchPage(String warning, int arg1) {
        Utils.waitForVisibility(vtvActivationPage.selectedProductInShoppingCart,10);
        warningMessage(warning, vtvActivationPage.selectedProductInShoppingCart);
    }

    @When("User clicks the CHECKOUT button on Customer{int} search page")
    public void userClicksTheCHECKOUTButtonOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.checkoutBtn,10);
        clickField(vtvActivationPage.checkoutBtn);
    }

    @And("User clicks the Collected radio button on Customer{int} search page")
    public void userClicksTheCollectedRadioButtonOnCustomerSearchPage(int arg0) {
        Utils.waitFor(5);
        vtvActivationPage.collectedTickBeforeCompleteChecekout.isSelected();
        clickField(vtvActivationPage.collectedTickBeforeCompleteChecekout);
    }

    @And("User clicks the COMPLATE CHECKOUT button on Customer{int} search page")
    public void userClicksTheCOMPLATECHECKOUTButtonOnCustomerSearchPage(int arg0) {
        Utils.waitFor(10);
        clickField(vtvActivationPage.completeChecekoutBtn);

    }

    @Then("user sees one pop up warning as {string} on Customer{int} search page")
    public void userSeesOnePopUpWarningAsOnCustomerSearchPage(String warning, int arg1) {
        Utils.waitFor(10);
        warningMessage(warning, vtvActivationPage.checkoutIsSuccessfullyCompletedMessage);
        Utils.waitFor(10);

    }

    @When("User clicks the Go Back to Customer{int} button on Customer{int} search page")
    public void userClicksTheGoBackToCustomerButtonOnCustomerSearchPage(int arg0, int arg1) {
        Utils.waitForVisibility(vtvActivationPage.goBackToCustomer360Btn,10);
        clickField(vtvActivationPage.goBackToCustomer360Btn);
    }

    @And("User clicks the Order button on Customer{int} search page")
    public void userClicksTheOrderButtonOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.orderButtonOnCustomer360Page);
        Utils.waitForPageToLoad();
        Utils.waitFor(2);

    }

    @And("User sees the Order id of the selected product on Customer{int} search page")
    public void userSeesTheOrderIdOfTheSelectedProductOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.orderIdField, 25);
        vtvActivationPage.orderIdField.isEnabled();
    }

    @And("User can control the Order Status of the selected product on Customer{int} search page")
    public void userCanControlTheOrderStatusOfTheSelectedProductOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.orderStatus, 10);
        vtvActivationPage.orderStatus.isEnabled();
    }

    @And("User clicks the Main Page button on Customer{int} search page")
    public void userClicksTheMainPageButtonOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.mainPageButton);
    }

    @When("User should be  General part  under  Main page  button on Customer360 search page")
    public void userShouldBeGeneralPartUnderMainPageButtonOnCustomerSearchPage() {
        Utils.waitForVisibility(vtvActivationPage.customerInformationTxtOnGeneral, 10);
        vtvActivationPage.customerInformationTxtOnGeneral.isDisplayed();
    }


    @And("User clicks Load Tickets button on Customer{int} search page")
    public void userClicksLoadTicketsButtonOnCustomerSearchPage(int arg0) {
        Utils.waitForVisibility(vtvActivationPage.loadTicketsOnTroubleTickets,30);
        clickField(vtvActivationPage.loadTicketsOnTroubleTickets);
        Utils.waitFor(3);
    }

    @And("User cliks three dots right of opened block on Customer{int} search page")
    public void userCliksThreeDotsRightOfOpenedBlockOnCustomerSearchPage(int arg0) {
        clickField(vtvActivationPage.threeDotsIconNearLoadTickets);
    }

    @And("User clicks Dnext option from the opened dropdown on Customer{int} search page")
    public void userClicksDnextOptionFromTheOpenedDropdownOnCustomerSearchPage(int arg0) {
        vtvActivationPage.switchToFaveoFromDnext();
    }

    @And("User enters {string} as Username, {string} as password  and clicks the login button on FAVEO login page")
    public void userEntersAsUsernameAsPasswordAndClicksTheLoginButtonOnFAVEOLoginPage(String username, String password) throws InterruptedException {
        Utils.waitFor(2);
        loginOfFaveo.login(username, password);
    }

    @And("User clicks the Change Status button on FAVEO page")
    public void userClicksTheChangeStatusButtonOnFAVEOPage() {
        Utils.waitFor(25);
        Utils.clickWithJS(ticketDetailsPageOfFaveo.changeStatusBtnOnFaveoPage);

    }

    @And("User clicks the resolve option from the opened dropdown FAVEO  page")
    public void userClicksTheResolveOptionFromTheOpenedDropdownFAVEOPage() {
        Utils.waitForVisibility(ticketDetailsPageOfFaveo.changeStatusWithResolvedBtnOnFaveoPage,15);
        clickField(ticketDetailsPageOfFaveo.changeStatusWithResolvedBtnOnFaveoPage);
    }

    @And("User clicks the Proceed button FAVEO  page")
    public void userClicksTheProceedButtonFAVEOPage() {
        Utils.waitForVisibility(ticketDetailsPageOfFaveo.proceedBtnOnFaveoPage,15);
        clickField(ticketDetailsPageOfFaveo.proceedBtnOnFaveoPage);
    }

    @And("User should see {string} warning on FAVEO page")
    public void userShouldSeeWarningOnFAVEOPage(String warning) {
        Utils.waitForVisibility(ticketDetailsPageOfFaveo.ticketStatusChangedSuccessfullyMessage,15);
        warningMessage(warning, ticketDetailsPageOfFaveo.ticketStatusChangedSuccessfullyMessage);

    }

    @And("User turns back to Customer Mangement page on Customer{int} search page")
    public void userTurnsBackToCustomerMangementPageOnCustomerSearchPage(int arg0) {
        vtvActivationPage.turningBackToCustomerManagementPage();

    }

    @When("User get the Agreement Id from Order part on Customer{int} search page")
    public void userGetTheAgreementIdFromOrderPartOnCustomerSearchPage(int arg0) {
        vtvActivationPage.verifyOrderAggrementIdMatchedInFiscalizationReceipt();
    }


}