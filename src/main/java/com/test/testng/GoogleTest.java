package com.test.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleTest {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("https://www.google.com/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
    @Test
    public void googleTitletest(){
        System.out.println(driver.getTitle());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
