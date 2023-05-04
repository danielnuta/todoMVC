package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SelectItemPage {

    @FindBy(how = How.CSS, using = "body > todo-app > section > section > ul > li > div > input")
    private WebElement selectItem;
}
