import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ram on 19/05/2014.
 */
public class RegistrationPage {
    public WebDriver driver;
    public Properties config;
    public Properties or;

    public RegistrationPage(WebDriver driver){


        this.driver=driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

   public WebElement emailAddress(){
       return driver.findElement(By.xpath("//*[@id='dnn_ctr29896_View_txtEmailAddress']"));



   }
    public WebElement retypeEmailAdress() {
        return driver.findElement(By.xpath("//*[@id='dnn_ctr29896_View_txtEmailAddressValidate']"));

    }

    public  WebElement title(){
        return driver.findElement(By.xpath("//*[@id='dnn_ctr29896_View_ddlTitle']"));

    }
    public  WebElement fName() {
        return driver.findElement(By.xpath("//*[@id='dnn_ctr29896_View_txtFirstName']"));

    }
    public  WebElement lName() {
        return driver.findElement(By.xpath("//*[@id='dnn_ctr29896_View_txtLastName']"));
    }
    public  WebElement dob() {
        return driver.findElement(By.xpath("//*[@id='txtDateOfBirth']"));
    }
   // public  WebElement postCode1() {


      //  return driver.findElement(By.xpath("//*[@id='txtAddress1']"));
  //  }
    public  WebElement doorNum() {


        return driver.findElement(By.xpath("//*[@id='txtAddress2']"));
    }
    public  WebElement town() {


        return driver.findElement(By.xpath("//*[@id='txtTownCity']"));
    }
    public  WebElement state() {


        return driver.findElement(By.xpath("//*[@id='txtCounty']"));
    }
    public  WebElement postCode() {


        return driver.findElement(By.xpath("//*[@id='txtPostcode']"));
    }
    public  WebElement mob(){
        return  driver.findElement(By.xpath("//*[@id='txtMobileNumber']"));
    }
    public  WebElement pwd(){
        return  driver.findElement(By.xpath("//*[@id='dnn_ctr29896_View_txtPassword']"));
    }
    public  WebElement confirmPwd(){
        return  driver.findElement(By.xpath("//*[@id='dnn_ctr29896_View_txtConfirm']"));
    }


}
