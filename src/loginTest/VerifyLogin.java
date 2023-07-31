package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VerifyLogin {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demoblaze.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("test", "test");
        List<WebElement> welcomeTest = driver.findElements(By.name("Welcome test"));


        if (welcomeTest.size() == 0) {
            System.out.println("korisnik je ulogovan.");
        } else {
            System.out.println("nie pronadjen welcome test");
        }
        driver.quit();
    }
}






