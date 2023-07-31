package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    public WebDriver driver;

public LoginPage(WebDriver driver) {
        this.driver = driver;
        }

public WebDriver getDriver() {
        return driver;
        }

public void setDriver(WebDriver driver) {
        this.driver = driver;
        }

    public void login(String username, String loginPassword) {
        WebElement loginButton = driver.findElement(By.id("login2"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement inputUserName = driver.findElement(By.id("loginusername"));
        inputUserName.clear();

        inputUserName.sendKeys(username);

        WebElement inputPassword = driver.findElement(By.id("loginpassword"));
        inputPassword.clear();
        inputPassword.sendKeys(loginPassword);

        WebElement buttonLogin = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
        buttonLogin.click();
    }
}