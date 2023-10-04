package com.test.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gc2050@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("facebook.com123");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();

        //driver.quit();
    }
}
