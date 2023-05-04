package testBase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.SelectItemPage;

public class SelectItem  extends BasePage {

    @Test
    public void selectItem() throws InterruptedException{
        SelectItemPage selectItem = PageFactory.initElements(driver, SelectItemPage.class);
        driver.get(getUrl());
    }
}
