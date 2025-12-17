package SeleniumPractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JavaScriptScrollTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    @Test
    void JsExecute() throws InterruptedException {

        JavaScriptScrollPage Jp = new JavaScriptScrollPage(driver);
        Jp.ScrollPage_by_pixels();
    }

    @AfterClass
    void Teardown(){
        driver.quit();
    }
}
