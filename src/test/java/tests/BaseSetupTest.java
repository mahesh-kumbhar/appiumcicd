package tests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import static utils.TestUtils.WAIT;


public class BaseSetupTest
{
    public static AndroidDriver driver;
    AppiumDriverLocalService service;
    UiAutomator2Options options= new UiAutomator2Options();

    public BaseSetupTest()
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this );
    }

    @BeforeClass
    public void beforeTest() throws IOException {
/*
        service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                        .withIPAddress("0.0.0.0").usingPort(4723).build();
        service.start();
*/
        options.setDeviceName("Pixel3aXl");
        options.setApp(System.getProperty("user.dir")+"/src/test/resources/FD.apk");

        driver = new AndroidDriver( new URL("http://0.0.0.0:4723"),options );
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    public void waitForElement(WebElement e)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(WAIT));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void click(WebElement e)
    {
        waitForElement(e);
        e.click();
    }
    public void sendKeys(WebElement e,String inputTxt)
    {
        waitForElement(e);
        e.sendKeys(inputTxt);
    }
    public String getAttribute(WebElement e,String attrib)
    {
        waitForElement(e);
        return e.getAttribute(attrib);
    }
    public void scrollDownTo(String ScrollToText)
    {
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+ ScrollToText+"\").instance(0))"));
    }



    @AfterClass
    public void afterTest()
    {
        driver.quit();
 //      service.close();
    }
}
