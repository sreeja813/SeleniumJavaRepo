package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class UtilsProgramTest {
    WebDriver driver;


    @BeforeClass
    void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().window().maximize();
    }

    @Test
    void Calculate() throws IOException, InterruptedException {
        UtilsProgramPage up = new UtilsProgramPage(driver);
        up.Excel();
    }

    @AfterClass
    void Teardown(){
        driver.quit();
    }
}
