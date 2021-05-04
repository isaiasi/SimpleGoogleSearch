package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends BasePage{

    public GoogleHomePage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "q")
    WebElement searchBox;

    @FindBy(name = "btnK")
    WebElement searchBtn;

    public void enterSearchTerm(String searchTerm){
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(searchTerm);
    }

    public void clickSearch(){
        wait.until(ExpectedConditions.visibilityOf(searchBtn));
        searchBtn.click();
    }

}
