package com.test.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-to-word");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='l3tlg0-2 gwHGeO']")).sendKeys("/Users/sanvimanvi/Downloads/Resume_Gaurav_Chaurasia.pdf");
    }
}
