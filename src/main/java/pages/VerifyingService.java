package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyingService {
    private final WebDriver driver;
    public VerifyingService(WebDriver driver){
        this.driver = driver;
    }

    public void checkTitle(String title) {
        boolean text = driver.getPageSource().contains(title);
    }

    public void checkBashSyntax() {
        String colorText = driver.findElement(By.className("kw2")).getCssValue("color");
        System.out.println("Text color:"+colorText);
    }

    public void checkCode(String line) {
        boolean text1 = driver.getPageSource().contains(line);
        System.out.println(text1);
    }

}
