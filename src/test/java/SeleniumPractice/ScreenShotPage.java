package SeleniumPractice;
import org.openqa.selenium.*;

import java.io.File;

public class ScreenShotPage {
    WebDriver driver;
    ScreenShotPage(WebDriver driver){
        this.driver=driver;

    }


    void FullPage() {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");
        sourcefile.renameTo(targetfile);//copying source file to target file
    }

    void ParticularSection(){
        WebElement ParticularSection = driver.findElement(By.xpath("(//header[@class='news-head'])[1]"));
        //webelement interface contains getScreenshotsAs method so,directly using without ts(getscreenshot object)
        File Soucefile = ParticularSection.getScreenshotAs(OutputType.FILE);
        File targetfile =new File(System.getProperty("user.dir")+"\\Screenshots\\ParticularSection.png");
        Soucefile.renameTo(targetfile);

    }

    void Logo(){
        WebElement Logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File Soucefile = Logo.getScreenshotAs(OutputType.FILE);
        File targetfile =new File(System.getProperty("user.dir")+"\\Screenshots\\WebElement.png");
        Soucefile.renameTo(targetfile);

    }
}
