package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Jeevan.Nikam
 */

@Component
public class TestInitializer extends ObjectRepository{

    public static WebDriver driver;
    public static WebDriverWait wait = null;

    public void setupChrome(String url) throws InterruptedException {

        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Jeevan\\chromedriver.exe");
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
            System.out.println(" =================================================== ");
            System.out.println("Url is :: " + url);
            System.out.println(" =================================================== ");
            launchApplication();
        } catch (WebDriverException e) {
            driver.close();
        }
    }

    private void launchApplication() throws InterruptedException {

        System.out.println("Waiting for the page to load");
        wait = new WebDriverWait(driver, 120L);
    }

}
