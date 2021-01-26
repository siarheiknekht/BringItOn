package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class HomePage {
    private final WebDriver driver;

    private final By pasteField = By.id("postform-text");
    private final By pasteNameField = By.id("postform-name");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public void pasteInput(String pasteStr) {
        driver.findElement(pasteField).sendKeys(pasteStr);
    }

    public void inputName(String nameStr) {
        driver.findElement(pasteNameField).sendKeys(nameStr);
    }

    public void select10MinExpiration() {
        Select s = new Select(driver.findElement(By.id("postform-expiration")));
        s.selectByValue("10M");
    }
}
