package dnext.com.pages.backofficePage;

import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public  class BackofficeHomePage extends BasePage {
    @FindBy(xpath = "/html/body/app/vertical-layout-1/div/div/div/div/content/app-tasks/app-page-view/div/div[2]/div[2]/div[2]/div[1]/div[1]/app-task-list-item/div/div/div/div[1]/div[1]/span")
     public WebElement nameOfCustomerOnMyGroupTasks;
    @FindBy(xpath = "//mat-icon[normalize-space()='more_vert']")
     public WebElement threeDotsOnOpenedPageAfterClickingNameOfCustomer;
    @FindBy(xpath = "//div[@class='cdk-overlay-container']//button[2]")
     static public WebElement claimEditButton;




}
