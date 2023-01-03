package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import tests.BaseSetupTest;

public class CreateAccountPage extends BaseSetupTest
{


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sign up with Email']")
    private WebElement btnSignUpWithEmail;

    @AndroidFindBy(xpath = "(//android.widget.EditText[@content-desc=\"Input\"])[1]")
    private WebElement inputEmail;

    @AndroidFindBy(xpath = "(//android.widget.EditText[@content-desc=\"Input\"])[2]")
    private WebElement inputPassword;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create account']")
    private WebElement btnCreateAccount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add your address manually']")
    private WebElement btnAddAddressManually;


    public void createAccount()
    {
        click(btnSignUpWithEmail);
        sendKeys(inputEmail,"testasdad@test.com");
        sendKeys(inputPassword,"123456");
        click(btnCreateAccount);
    }

}
