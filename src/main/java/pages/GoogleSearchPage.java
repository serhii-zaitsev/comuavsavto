package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
public class GoogleSearchPage extends BasePage {

        public GoogleSearchPage(WebDriver driver) {
            super(driver);
        }

        @FindBy(xpath = "//span[@class='Z98Wse']")
        public WebElement ad;

        @FindAll(@FindBy(how = How.XPATH, using = "//cite[@class='UdQCqe']"))
        private List<WebElement> allLinks;

        @FindBy(xpath = "//a/h3[text()='Переоборудование микроавтобусов VSavto']")
        public WebElement linkText;

        @FindBy(xpath = "//span[text()='Уперед']")
        public WebElement btnNext;


        @FindAll(@FindBy(how = How.XPATH, using = "//a/span[@class='csb ch']"))
        private List<WebElement> allPages;


        public void getAndClickOnAll() throws InterruptedException {
            for (int i = 0; i <= allLinks.size()-1; i++ )
            {
                System.out.println("Clicking on site : " + allLinks.get(i).getText());
                allLinks.get(i).click();
                Thread.sleep(5000);
                driver.navigate().back();
            }
        }

        public void gettingPagePosNumber() throws InterruptedException {
            boolean val = true;
            int count = 1;

            while(val)
            {
                Thread.sleep(100);
                List<WebElement> dynamicElement = driver.findElements(By.partialLinkText("VSavto"));
                if(dynamicElement.size() != 0)
                {
                    //If list size is non-zero, element is present
                    System.out.println("Site is presented on " + count + " Page");
                    dynamicElement.get(0).click();
                    val = false;
                }
                else
                {
                    //Else if size is 0, then element is not present
                    List<WebElement> ckeckBtnNext = driver.findElements(By.xpath("//span[text()='Уперед']"));
                    if(ckeckBtnNext.size() != 0)
                    {
                        System.out.println("Site is not presented on " + count + " Page");
                        btnNext.click();
                    }
                    else
                    {
                        System.out.println("There is no site on any pages. It is end");
                        val = false;
                    }
                    count ++;
                }
            }
        }
    }

