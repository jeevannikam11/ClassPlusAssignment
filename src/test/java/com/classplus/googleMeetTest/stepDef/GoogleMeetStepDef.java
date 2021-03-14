package com.classplus.googleMeetTest.stepDef;

import com.classplus.googleMeetTest.config.BaseConfig;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.spring.CucumberContextConfiguration;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;
import pages.GoogleLogInPage;
import pages.HomePage;
import org.apache.logging.log4j.LogManager;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@CucumberContextConfiguration
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = {BaseConfig.class})
public class GoogleMeetStepDef {

    public static WebDriver driver;
    public static WebDriverWait wait = null;
    private String url = "https://meet.google.com/";
    private static final Logger LOGGER = LogManager.getLogger(GoogleMeetStepDef.class);

    static {
        System.setProperty("java.awt.headless", "false");
    }

    @Before
    public void beforeTest() {
        LOGGER.info("Test started....");
    }

    @After
    public void afterTest() {
        driver.close();
        LOGGER.info("Completed....");
    }

    @Given("Open google meet app on browser {string}")
    public void openGoogleMeetAppOnBrowser(String browserName) throws InterruptedException {
        if (browserName.equals("chrome")) {
            setupChrome(url);
        }
    }

    @And("Click on start meeting button")
    public void clickOnStartMeetingButton() {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnStartMeetingButton();
    }

    @And("Enter user email {string} and password {string}")
    public void enterUserEmailAndPassword(String userName, String password) throws InterruptedException {
        GoogleLogInPage googleLogInPage = new GoogleLogInPage(driver);
        googleLogInPage.enterUserName(userName);
        Thread.sleep(3000);
        googleLogInPage.clickOnNextButton();
        Thread.sleep(3000);
        googleLogInPage.enterUserPassword(password);
        googleLogInPage.clickOnNextButton();
    }

    @And("Click on mute microphone button")
    public void clickOnMuteMicrophoneButton() {
        try{
            Thread.sleep(10000);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_D);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(5000);
            LOGGER.info("Clicked on mute button successfully");
        }catch (Exception e){
            LOGGER.error("Exception while clicking on mute button");
            e.printStackTrace();
        }

    }

    public void setupChrome(String url) throws InterruptedException {

        try {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            Map<String, Object> prefs = new HashMap<>();
            prefs.put("profile.default_content_setting_values.media_stream_mic", 1);
            prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
            prefs.put("profile.default_content_setting_values.geolocation", 0);
            prefs.put("profile.default_content_setting_values.notifications", 1);
            ChromeOptions options = new ChromeOptions();
            options.addArguments("–no-sandbox");
            options.addArguments("–disable-dev-shm-usage");
            options.setExperimentalOption("useAutomationExtension", false);
            options.addArguments("--lang=en-GB");
            options.setExperimentalOption("prefs", prefs);
            Thread.sleep(5000);
            driver = new ChromeDriver(options);
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            LOGGER.info(" =================================================== ");
            LOGGER.info("Url is :: " + url);
            LOGGER.info(" =================================================== ");
            launchApplication();
        } catch (WebDriverException e) {
            driver.quit();
        }
    }

    private void launchApplication() throws InterruptedException {

        LOGGER.info("Waiting for the page to load");
        wait = new WebDriverWait(driver, 120L);
    }

}
