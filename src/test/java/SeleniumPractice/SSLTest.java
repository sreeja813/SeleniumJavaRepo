package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SSLTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        driver=new ChromeDriver(options);
        driver.get("https:expired.badssl.com/");
    }

    @Test
    void TestSSL(){
        SSLPage SP= new SSLPage(driver);
        SP.Text();

    }

    @AfterClass
    void Teardoewn(){
        driver.quit();
    }
}
