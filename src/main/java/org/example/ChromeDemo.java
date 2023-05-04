package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {
    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danie\\Documents\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://todomvc.com/examples/angular2/");

        driver.close();

    }
}