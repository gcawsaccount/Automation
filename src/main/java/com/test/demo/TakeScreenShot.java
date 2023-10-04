package com.test.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TakeScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        //Take screenshot and store as file
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //now copy the screenshot in desired location using copyFile method
        FileUtils.copyFile(src,new File("/Users/sanvimanvi/IdeaProjects/SeleniumWebDriverManager/src/main/resources/Screenshots/amazon.png"));
        driver.quit();
    }
}
