package testBase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjects.BasePage;

import java.io.IOException;

public class AddItem extends BasePage {

    @Test
    public void addItem() throws InterruptedException, IOException{
        driver = getDriver();
        driver.get(getUrl());

        driver.findElement(By.cssSelector("body > todo-app > section > header > input")).click();
        System.out.println("todolist");
        Thread.sleep(2000);
    }


}
