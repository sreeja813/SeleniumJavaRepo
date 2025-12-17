package SeleniumPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeadlessTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        driver=new ChromeDriver(options);
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
    }

    @Test
    void Youtube(){
        HeadlessPage hp=new HeadlessPage(driver);
        hp.EnterSearch();

    }

    @AfterClass
    void Teardown(){
        driver.quit();
    }
}


