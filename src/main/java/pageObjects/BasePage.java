package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



public class BasePage {


    public WebDriver driver;
    private String url;
    private Properties prop;

    public WebDriver getDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("C:\\Users\\danie\\Documents\\IntelliJ_projects\\todo_MVC\\src\\main\\resources\\config.properties"
        );prop.load(data);

        if (prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir")+ "src/main/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("firefox")) {
            System.setProperty("webdriver.geko.driver",
                    System.getProperty("user.dir")+ "src\\main\\java\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public String getUrl() throws IOException{
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(
                "C:\\Users\\danie\\Documents\\IntelliJ_projects\\todo_MVC\\src\\main\\resources\\config.properties"
        );prop.load(data);
        url = prop.getProperty("url");
                return url;
    }

}
