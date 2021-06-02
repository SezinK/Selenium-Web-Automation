import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.Thread;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Selenium{
    //Instance for driver
    static WebDriver driver;
    //Instance for logger class
    static Logger logger = LogManager.getLogger(Selenium.class);

    @Test
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","\\C:\\Users\\Boncuk\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("http://www.gittigidiyor.com");

        //Click on Login
        driver.findElement(By.cssSelector("#Login")).click();

        //Wait for the element to load
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        //Enter e-mail address
        driver.findElement(By.cssSelector("#Email")).sendKeys("sezinkoktas@hotmail.com");

        //Wait for the element to load
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        //Enter password
        driver.findElement(By.cssSelector("#Password")).sendKeys("s12345678");

        //Click on Login
        driver.findElement(By.cssSelector("#Login")).click();

        logger.info("This is information message");
        System.out.println("Login Verified");
        System.out.println("Password Verified");

        //You can uncommand the below code to close and quit the driver after for a moment.
        // But in my case, I decided to keep that open to do the task in the website.

        //Thread.sleep(10000);
        //driver.close();
        //driver.quit();
    }
}
