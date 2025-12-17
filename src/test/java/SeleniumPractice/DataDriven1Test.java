package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDriven1Test {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver=new ChromeDriver();
    }

    @Test
    void DataDriven() throws IOException {
        DataDriven1Page dp = new DataDriven1Page(driver);
        dp.Datadriven1();

    }
}
