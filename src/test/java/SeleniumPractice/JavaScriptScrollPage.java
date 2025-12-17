package SeleniumPractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScrollPage {
    WebDriver driver;

    JavaScriptScrollPage(WebDriver driver){

        this.driver = driver;
    }
    By ele = By.xpath("(//h2[@class='product-title'])[1]");

    void ScrollPage_by_pixels() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver ;
        //scroll by pixels
        js.executeScript("window.scrollBy(0,1500)");
       Thread.sleep(3000);
        System.out.println(js.executeScript("return window.pageYOffset"));
        //scroll till element is visible
//        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(ele));
//        Thread.sleep(3000);

        //scroll till the page end

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        System.out.println(js.executeScript("return window.pageYOffset"));
        //scroll back to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        Thread.sleep(2000);


    }

}
