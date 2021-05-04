package tests;

import org.testng.annotations.Test;
import pages.GoogleHomePage;
import pages.GoogleResultsPage;

public class GoogleSearchTest extends BaseTest{

    @Test
    public void searchForCheese(){
        GoogleHomePage googleHomePage = new GoogleHomePage(driver, wait);
        googleHomePage.enterSearchTerm("cheese");
        googleHomePage.clickSearch();

        GoogleResultsPage googleResultsPage = new GoogleResultsPage(driver, wait);
        googleResultsPage.getResultsNumber();
        googleResultsPage.clickSecondResult();
    }
}
