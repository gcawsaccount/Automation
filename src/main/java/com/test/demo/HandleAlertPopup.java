package com.test.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.name("proceed")).click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert(); //driver.switch().alert() will return object identifier,storing it in alert variable using Alert class of selenium
        System.out.println(alert.getText());
        String text = alert.getText();
        if(text.equals("Please enter a valid user name")) {
            System.out.println("Test Passed");
        }
            else
            {
                System.out.println("Test failed");
            }

        alert.accept();
            driver.quit();

        //alert.dismiss();

    }
}
