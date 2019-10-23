package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Conditions;

public class GooglePage extends BasePage {
    private By searchBox = By.name("q");
    private By searchbtn = By.xpath("//input[@name='btnK']");


    public void openPage() {
        open("http://google.com.ua");
        waitForDocumentCompleteState();
    }

    ///////// Constructor ///////////
    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String searchQuery) {
        $(searchBox, Conditions.CLICKABLE).clear();
        $(searchBox).sendKeys(searchQuery);
        $(searchbtn).click();
    }

    public void navigateToGooglePage(String url)
    {
        driver.get(url);
    }

}
