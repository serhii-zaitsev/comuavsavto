package pages;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import utils.Conditions;
import java.util.List;


public class LandingPage extends BasePage {

    private By mGallery = By.linkText("Галерея");
    private By mUsl = By.linkText("Услуги");
    private By mContact = By.linkText("Контакты");
    private By mPrice = By.linkText("Прайс лист");
    private By mNews = By.linkText("News");

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        open("https://vsavto.com.ua");
        waitForDocumentCompleteState();
    }

    public void checkingMenuItems()
    {
        $(mGallery, Conditions.CLICKABLE).click();
        $(mUsl, Conditions.CLICKABLE).click();
        $(mContact, Conditions.CLICKABLE).click();
        $(mPrice, Conditions.CLICKABLE).click();
        $(mNews, Conditions.CLICKABLE).click();
    }

}

