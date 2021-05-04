package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GoogleResultsPage extends BasePage{

    @FindBy(xpath = "//*[@id='rso']/div[@class='g']/div/div/div[1]/a")
    List<WebElement> resultsLinks;

    public GoogleResultsPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public void getResultsNumber(){
        System.out.println("\n\nThe number of interactable result links is: "+ resultsLinks.size());
    }

    public void clickSecondResult(){
        WebElement secondResult = resultsLinks.get(1);
        Actions act = new Actions(driver);
        act.moveToElement(secondResult).perform();
        secondResult.click();
        System.out.println("Second result page's title is:\n " + driver.getTitle() + "\n\n");
    }
}
