import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("The tile of the webpage is :" +driver.getTitle());
        String title = driver.getTitle();
        if(title.equals("Google")) {
            System.out.println("Validation passed");
        }
            else
        {   System.out.println("Validation failed");

        }

        driver.quit();

    }
}
