package SeleniumPractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScreenShotTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    void FullScreenshot(){
        ScreenShotPage sp = new ScreenShotPage(driver);
        sp.FullPage();
    }

    @Test(priority = 1)
    void ParticularSec(){
        ScreenShotPage sp =new ScreenShotPage(driver);
        sp.ParticularSection();
    }
    @Test(priority = 3)
    void WebElementtt(){
        ScreenShotPage sp =new ScreenShotPage(driver);
        sp.Logo();
     }

    @AfterClass
    void Teardown(){
        driver.quit();
    }
}
