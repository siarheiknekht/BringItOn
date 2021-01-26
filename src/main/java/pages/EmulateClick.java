package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class EmulateClick {
    private final WebDriver driver;
    public EmulateClick(WebDriver driver){
        this.driver = driver;
    }

    public void clickBash() {
        WebElement pasteHighlighting = driver.findElement(By.xpath("//*[@id=\"select2-postform-format-container\"]"));
        pasteHighlighting.click();
        WebElement searchField = driver.findElement(By.className("select2-search__field"));
        searchField.sendKeys("Bash");
        searchField.sendKeys(Keys.ENTER);
    }
    public void clickSubmit() {
        WebElement button = driver.findElement(By.xpath("//*[@id=\"w0\"]/div[5]/div[1]/div[8]/button"));
        button.submit();
    }

}
