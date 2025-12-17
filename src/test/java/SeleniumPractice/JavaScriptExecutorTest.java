package SeleniumPractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class JavaScriptExecutorTest {
    WebDriver driver;
    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 0)
    void Executor() throws InterruptedException {
        JavaScriptExecutorDemoPage Jp= new JavaScriptExecutorDemoPage(driver);
        Jp.jsExecutorDemo();
//        Thread.sleep(5000);

    }
    @Test(priority = 1)
    void jsClickk() throws InterruptedException {
        JavaScriptExecutorDemoPage Jp= new JavaScriptExecutorDemoPage(driver);
        Jp.jsClick();
        Thread.sleep(5000);

    }




    @AfterClass
    void Teardown(){
        driver.quit();
    }


}
