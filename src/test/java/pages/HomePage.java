package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import tests.BaseSetupTest;

public class HomePage extends BaseSetupTest
{
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"NavigateToAccountMenu\"]/android.widget.ImageView")
    private WebElement iconMyAccount;

    public void openMyAccount()
    {
        click(iconMyAccount);
    }

}
