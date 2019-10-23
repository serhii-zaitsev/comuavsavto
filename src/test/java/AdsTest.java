import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.GooglePage;
import pages.GoogleSearchPage;
import pages.LandingPage;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by Serhii Zaitsev on 25.03.2019.
 */
public class AdsTest extends BaseGUITest {

    private GooglePage gp;
    private GoogleSearchPage gsp;

    @Before
    public void openLoginPage(){
        gp = new GooglePage(getDriver());
        gsp = new GoogleSearchPage(getDriver());
        gp.openPage();
    }

    @Test
    public void Click_On_All_Paid_Links() throws InterruptedException {
        gp.searchFor("Переоборудование микроавтобусов");
        gsp.getAndClickOnAll();
    }

    @Test
    public void Check_Vsavto_Position_On_Google_SearchPage_By_Bus() throws InterruptedException {
        gp.searchFor("Переоборудование микроавтобусов");
        Assert.assertTrue("Site vsavto wasn't found on first 5 pages", (gsp.gettingPagePosNumber() < 6) );
    }

    @Test
    public void Check_Vsavto_Position_On_Google_SearchPage_By_Avto() throws InterruptedException {
        gp.searchFor("Переоборудование авто");
        Assert.assertTrue("Site vsavto wasn't found on first 5 pages", (gsp.gettingPagePosNumber() < 6) );
    }
}

   /* @Test
    public void Verify_That_User_Can_Not_Open_Private_Cabinet_Without_Login(){
        // act
        open("http://automationpractice.com/index.php?controller=my-account");
        // assert
        Assert.assertThat("Private cabinet was opened without login",
                loginPage.getPageTitle(),
                containsString("Login"));
    }

    @Test
    public void Verify_An_Error_With_Incorrect_Password() {
        // act
        loginPage.logIn("trandafilov.vladimir@gmail.com", "fake-password");
        // assertion
        assertAll(
                () -> Assert.assertThat("Login page wasn't opened", loginPage.getPageTitle(), containsString("Login")),
                () -> Assert.assertEquals("Error msg is incorrect","Authentication failed.", loginPage.getErrorMessage())
        );
    }*/

