package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.SeleniumUtils;

public class HomePageTest extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        initializer();
        homePage = new HomePage();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void verifyHomeTitle() throws InterruptedException {
        SeleniumUtils.waitForVisibilityOfElement(homePage.footwear);
        Assert.assertEquals(driver.getTitle(),"Cristiano Ronaldo | Official Website");
        homePage.navigateToFootwear();
        Thread.sleep(5000);
    }
}
