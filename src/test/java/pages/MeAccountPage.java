package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import tests.BaseSetupTest;

public class MeAccountPage extends BaseSetupTest
{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign out']")
    private WebElement btnLogout ;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign out']")
    private WebElement btnLogoutConfirm ;

    @AndroidFindBy(accessibility = "Button_primary")
    private WebElement btnLoginTab ;//= driver.findElement(AppiumBy.accessibilityId("Button_primary"));

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Delivery addresses']")
    private WebElement txtDeliervyAddress ;//= driver.findElement(AppiumBy.accessibilityId("Button_primary"));


    public void logoutFromApp()
    {
        waitForElement(txtDeliervyAddress);
        scrollDownTo("Sign out");
        click(btnLogout);
        click(btnLogoutConfirm);
        waitForElement(btnLoginTab);
    }
}
