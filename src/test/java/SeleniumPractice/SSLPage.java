package SeleniumPractice;

import org.openqa.selenium.WebDriver;

public class SSLPage {
    WebDriver driver;
    SSLPage(WebDriver driver){
        this.driver=driver;
    }

    void Text(){
        System.out.println(driver.getTitle());
    }
}
