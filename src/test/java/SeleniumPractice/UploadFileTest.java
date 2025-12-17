package SeleniumPractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UploadFileTest {
    WebDriver driver;

    @BeforeClass
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();
    }

    @Test
    void Upload() throws InterruptedException {
        UplloadFilesPage UP = new UplloadFilesPage(driver);
        UP.UploadFile();
    }
    @Test
    void MultipleUpload() throws InterruptedException {
        UplloadFilesPage UP = new UplloadFilesPage(driver);
        UP.multipleFileUpload();

    }
    @AfterClass
    void Teardown(){
        driver.quit();
    }
}


