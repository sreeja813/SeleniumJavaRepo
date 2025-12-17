package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class UtilsProgramPage {
    WebDriver driver;
    UtilsProgramPage(WebDriver driver){
        this.driver=driver;
    }

    By principal = By.xpath("//input[@id='principal']");
    By ROI = By.xpath("//input[@id='interest']");
    By Tenure = By.xpath("//input[@id='tenure']");
    By Calculate = By.xpath("//div[@class='CTR PT15']//a[1]");


    void Excel() throws IOException, InterruptedException {
        String filepath = System.getProperty("user.dir")+"\\TestData\\Problem.xlsx";
        int rows=UtilsClass.GetRowCount(filepath,"Amount");

        for(int i=0;i<=rows;i++){
            //read data from excel
            String  principle=UtilsClass.getCellData(filepath,"Amount",i,1);
            String ROIV=UtilsClass.getCellData(filepath,"Amount",i,2);
            String Period1=UtilsClass.getCellData(filepath,"Amount",i,3);
            String period2=UtilsClass.getCellData(filepath,"Amount",i,4);
            String Frequency=UtilsClass.getCellData(filepath,"Amount",i,5);
            String Maturity_value=UtilsClass.getCellData(filepath,"Amount",i,6);

            //write data to Web application
            driver.findElement(principal).sendKeys(principle);
            driver.findElement(ROI).sendKeys(ROIV);
            driver.findElement(Tenure).sendKeys(Period1);
            WebElement per2=driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
            Select s = new Select(per2);
            s.selectByVisibleText(period2);
            WebElement Fre=driver.findElement(By.xpath("//select[@id='frequency']"));
            Select Fre1= new Select(Fre);
            Fre1.selectByVisibleText(Frequency);
            driver.findElement(Calculate).click();

            String Actual=driver.findElement(By.xpath("//span[@id='resp_matval']")).getText();

            if(Double.parseDouble(Maturity_value)==Double.parseDouble(Actual)){
                System.out.println("Pass");
            }

            driver.findElement(By.xpath("//div[@class='CTR PT15']//a[2]")).click();//clicks on clear button which clears the data




        }
        Thread.sleep(5000);
        driver.quit();
    }

}
