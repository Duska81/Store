package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.List;

public class VerifyLoginWithWrongPassword {


        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoblaze.com/");
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("test", "ddddddddddddddddd");
             List<WebElement> welcomeTest = driver.findElements(By.name("Welcome test"));


            if (welcomeTest.size() == 0) {
                System.out.println("korisnik nije ulogovan.");
            } else {
                System.out.println("greska, pronadjen welcome test");
            }
            driver.quit();
        }
        }



