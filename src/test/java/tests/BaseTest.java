package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    String urlPage = "https://www.google.com";

    @BeforeSuite
    public void setUpDriver(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get(urlPage);
    }

    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }
}
