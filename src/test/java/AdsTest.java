import org.junit.Before;
import org.junit.Test;
import pages.GooglePage;
import pages.GoogleSearchPage;
/**
 * Created by Serhii Zaitsev on 25.03.2019.
 */
public class AdsTest extends BaseGUITest {

    private GooglePage gp;
    private GoogleSearchPage gsp;

    @Before
    public void openLoginPage(){
        gp = new GooglePage(getDriver());
        gp.openPage();
    }

    @Test
    public void Click_On_All_Paid_Links() throws InterruptedException {
        //gp = new GooglePage(getDriver());
        gp.searchFor("Переоборудование микроавтобусов");

        gsp = new GoogleSearchPage(getDriver());
        gsp.getAndClickOnAll();
        //gspPage.getAndClickOnAll();
        // assert
        /*Assert.assertThat("Login wasn't successful",
                loginPage.getPageTitle(),
                containsString("My account"));
        */
    }

    @Test
    public void Check_VsAvto_Position_OnGoogle_SearchPage() throws InterruptedException {
        //gp = new GooglePage(getDriver());
        gp.searchFor("Переоборудование микроавтобусов");

        gsp = new GoogleSearchPage(getDriver());
        gsp.gettingPagePosNumber();
        //gspPage.getAndClickOnAll();
        // assert
        /*Assert.assertThat("Login wasn't successful",
                loginPage.getPageTitle(),
                containsString("My account"));
        */
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
}
