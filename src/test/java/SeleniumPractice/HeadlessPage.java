package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeadlessPage {
    WebDriver driver;
    HeadlessPage(WebDriver driver){
        this.driver=driver;
    }


    By Search = By.xpath("//input[@name='search_query']");


    void EnterSearch(){
        driver.findElement(Search).sendKeys("srijaa");
    }

}
