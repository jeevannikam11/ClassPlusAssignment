package com.classplus.googleMeetTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class TestGoogleMeetMuteButton {

    public static void main(String[] args) throws InterruptedException, AWTException {

        String url = "https://meet.google.com/";
        System.setProperty("webdriver.chrome.driver","C:\\Jeevan\\chromedriver.exe");
        WebDriver driver = null;
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
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class=\"glue-button glue-button--high-emphasis  glue-button--icon \"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class=\"whsOnd zHQkBf\"]")).sendKeys("test.jeevan.nikam@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"VfPpkd-RLmnJb\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class=\"whsOnd zHQkBf\"]")).sendKeys("Test@1234");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"VfPpkd-RLmnJb\"]")).click();
        Thread.sleep(10000);
        System.out.println("Disabling mic......");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }


}
