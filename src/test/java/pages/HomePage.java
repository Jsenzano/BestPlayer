package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@href=\"https://www.cr7footwear.com\"]")
    public WebElement footwear;

    public void navigateToFootwear(){
        SeleniumUtils.click(footwear);

    }
}
