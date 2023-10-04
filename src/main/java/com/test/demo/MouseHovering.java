package com.test.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseHovering {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.goindigo.in/");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Book"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Flights")).click();
    }
}
