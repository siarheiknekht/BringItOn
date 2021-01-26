import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.VerifyingService;
import pages.HomePage;
import pages.EmulateClick;
import unit.BestTest;

public class HomePageTest extends BestTest {
    private HomePage homePage;
    private EmulateClick emulateClick;
    private VerifyingService verifyingService;

    @BeforeClass
    public void setupPages() {
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        emulateClick = new EmulateClick(driver);
        verifyingService = new VerifyingService(driver);
    }

    @Test
    public void simpleTest() throws InterruptedException {
        homePage.pasteInput("git config --global user.name  \"New Sheriff in Town\"\n");
        homePage.pasteInput("git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n");
        homePage.pasteInput("git push origin master --force");

        emulateClick.clickBash();

//        does not work on this site
//        homePage.select10MinExpiration();

        homePage.inputName("how to gain dominance among developers");

        emulateClick.clickSubmit();

        verifyingService.checkTitle("how to gain dominance among developers");
        verifyingService.checkBashSyntax();
        verifyingService.checkCode("git config --global user.name  \"New Sheriff in Town\"\n");
        verifyingService.checkCode("git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n");
//        check for invalid line
//        verifyingService.checkCode("git reset $(git -tree HEAD^{tree} -m \"Legacy code\")\n");
        verifyingService.checkCode("git push origin master --force");

/*
        Thread.sleep(5000); //задержка, костыль
        driver.quit();
*/


    }
}
