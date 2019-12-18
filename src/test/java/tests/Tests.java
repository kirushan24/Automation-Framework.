package tests;


import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

public class Tests extends TestBase {

    @Test(priority=1, enabled=true)
    public void testGenderlInformation() throws Exception {

        LoginPage.setUserName("admin");
        extentTest.log(LogStatus.PASS, "Enter The Username");
        LoginPage.setPassword("Admin123");
        extentTest.log(LogStatus.PASS, "Enter Password");
        LoginPage.clickLogin();
        extentTest.log(LogStatus.PASS, "Login Button Clicked");



    }
}
