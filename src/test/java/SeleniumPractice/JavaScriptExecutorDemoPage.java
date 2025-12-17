package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExecutorDemoPage {
    WebDriver driver;

    JavaScriptExecutorDemoPage(WebDriver driver){

        this.driver = driver;
    }

    By name = By.xpath("//input[@id='name']");
    By male = By.xpath("//input[@id='male']");


    void jsExecutorDemo(){
        JavascriptExecutor js = (JavascriptExecutor)driver ;
        //writing text,alternate of send keys
        js.executeScript("arguments[0].setAttribute('value','Sreeja')",driver.findElement(name));

    }

    void jsClick() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver ;
        //clicking on element,alternate of click method
        js.executeScript("arguments[0].click()",driver.findElement(male));
        Thread.sleep(5000);

    }












}
