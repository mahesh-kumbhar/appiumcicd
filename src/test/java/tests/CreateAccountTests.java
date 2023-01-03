package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.LoginPage;

public class CreateAccountTests extends BaseSetupTest
{
    LoginPage loginPage;
    CreateAccountPage createAccountPage;
    @BeforeMethod
    public void beforeMethod()
    {
        loginPage = new LoginPage();
        createAccountPage = new CreateAccountPage();
    }


    @Test
    public void createAccount()
    {
        loginPage.openCreateAccount();

        createAccountPage.createAccount();

    }
}
