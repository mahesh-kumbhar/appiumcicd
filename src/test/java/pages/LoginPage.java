package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import tests.BaseSetupTest;

public class LoginPage extends BaseSetupTest
{
    @AndroidFindBy(accessibility = "Button_primary")
    private WebElement btnLoginTab ;//= driver.findElement(AppiumBy.accessibilityId("Button_primary"));

    @AndroidFindBy(xpath = "(//android.widget.EditText[@content-desc=\"Input\"])[1]")
    private WebElement inputUserName;

    @AndroidFindBy(xpath = "(//android.widget.EditText[@content-desc=\"Input\"])[2]")
    private WebElement inputPassword;

    @AndroidFindBy(accessibility = "Button_primary")
    private WebElement btnSignIn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Home\"]")
    private WebElement homeTab;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"NavigateToAccountMenu\"]/android.widget.ImageView")
    private  WebElement iconMyAccount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create account']")
    private WebElement lnkCreateAccountPage;

    public void openLoginTab()
    {
        click(btnLoginTab);
    }
    public void openCreateAccount()
    {
        click(lnkCreateAccountPage);
    }

    public void login()
    {
        click(btnLoginTab);
        sendKeys(inputUserName,"recipeuser@test.com");
        sendKeys(inputPassword,"123456");
        click(btnSignIn);
        waitForElement(homeTab);
    }



}
