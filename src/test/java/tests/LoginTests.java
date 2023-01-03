package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MeAccountPage;

import java.lang.reflect.Method;

public class LoginTests extends BaseSetupTest
{
    LoginPage loginPage;
    HomePage homePage;
    MeAccountPage meAccountPage;
    @BeforeMethod
    public void beforeMethod(Method m)
    {
        loginPage = new LoginPage();
        homePage = new HomePage();
        meAccountPage = new MeAccountPage();

        System.out.println( "\n"+"***** Starting Test : " + m.getName() + " *****"+"\n");
    }

    @Test
    public void login()
    {
     loginPage.openLoginTab();
     loginPage.login();
    }

    @Test
    public void logout()
    {
       homePage.openMyAccount();
       meAccountPage.logoutFromApp();
    }
}
