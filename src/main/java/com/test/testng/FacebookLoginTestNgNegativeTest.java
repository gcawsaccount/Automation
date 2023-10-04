package com.test.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FacebookLoginTestNgNegativeTest {

    WebDriver driver = new ChromeDriver();

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");


    }

    @Test
    void facebookLogin() {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gc2050@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook.com123");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
    }

    @AfterMethod
    void chromeExit() {
        driver.quit();
    }


}
