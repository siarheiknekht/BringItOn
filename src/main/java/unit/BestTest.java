package unit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BestTest {
    private static final String BASE_URL = "https://pastebin.com/";
    protected WebDriver driver;

    @BeforeSuite
    public void setUpDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/siarhei_knekht/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void startDriver() throws InterruptedException {
        driver.get(BASE_URL);
    }
    @AfterSuite
    public void closeDriver() throws InterruptedException {
        driver.quit();
    }
}
