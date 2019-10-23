package vsavto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.GooglePage;
import pages.GoogleSearchPage;
import pages.LandingPage;

import static org.hamcrest.CoreMatchers.containsString;

public class VsAvto_Main extends BaseGUITest{

    private LandingPage lp;

    @Before
    public void openLoginPage(){
        lp = new LandingPage(getDriver());
        lp.openPage();
    }

    @Test
    public void Going_Through_All_Menu_Items(){
        //open("https://vsavto.com.ua");
        lp.checkingMenuItems();
        Assert.assertThat("NEWS page was not opened",
                lp.getPageTitle(),
                containsString("News"));
    }

}
