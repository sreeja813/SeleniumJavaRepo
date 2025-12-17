package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplloadFilesPage {
    WebDriver driver;
    UplloadFilesPage(WebDriver driver){
        this.driver=driver;

    }

    By chooseFile = By.xpath("//input[@id='filesToUpload']");

    void UploadFile() throws InterruptedException {
        driver.findElement(chooseFile).sendKeys("C:\\Automation\\1755938383588.pdf");
        Thread.sleep(3000);

    }

    void multipleFileUpload() throws InterruptedException {
        String file1 = "C:\\Automation\\1755938383588.pdf";
        String file2 = "C:\\Automation\\abg.txt";
        driver.findElement(chooseFile).sendKeys(file1+"\n"+file2);
        Thread.sleep(3000);
        System.out.println("sreejaaaaaaaaaaa");
    }
}
