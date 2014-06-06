import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Ram on 03/06/2014.
 */
public class LittleWebelement {
    public WebDriver driver;

    public LittleWebelement(WebDriver driver){
        this.driver=driver;
    }
 //  public WebElement clickTitle(){
     //  return driver.findElement(By.cssSelector("select[id='homeAddress_prefix']"));
  // }
    public WebElement firstNameEnter(){
        return driver.findElement(By.cssSelector("input[id='firstName']"));
    }
    public WebElement lastNameClick(){
        return driver.findElement(By.cssSelector("input[id='lastName']"));
    }
   // public WebElement selectDayOfBirthDay(){
      //  return driver.findElement(By.cssSelector("select[id='dateOfBirthDay']"));
  //  }
   // public WebElement selectDayOfBirthMonth(){
       // return driver.findElement(By.cssSelector("select[id='dateOfBirthMonth']"));
    //}
    //public WebElement selectDayOfBirthYear(){
      //  return driver.findElement(By.cssSelector("select[id='dateOfBirthYear']"));
  //  }
    public WebElement selectHomePhoneNumber(){
        return driver.findElement(By.cssSelector("input[id='homeAddress_phoneNumber']"));
    }
    public WebElement selectMobileNumber(){
        return driver.findElement(By.cssSelector("input[id='homeAddress_mobilePhoneNumber']"));
    }
    public WebElement emailAdressEnter(){
        return driver.findElement(By.cssSelector("input[id='email']"));
    }
    public  WebElement confirmEmailAdress(){
        return driver.findElement(By.cssSelector("input[id='confirmEmail']"));
    }
    public WebElement passwordEnter(){
        return driver.findElement(By.cssSelector("input[id='password']"));
    }
    public WebElement confirmPasswordEnter(){
        return driver.findElement(By.cssSelector("input[id='confirmPassword']"));
    }
    public WebElement houseNumberEnter(){
        return driver.findElement(By.cssSelector("input[id='houseNum']"));
    }
    public WebElement enterPostcode(){
        return driver.findElement(By.cssSelector("input[id='postcode']"));
    }
    public WebElement findAdressClick(){
        return driver.findElement(By.cssSelector("input[id='findAddressButton']"));
    }
    public WebElement clickContinue(){
        return driver.findElement(By.cssSelector("input[id='registerContinueButton']"));
    }
    public WebElement confirmAdd(){
        return driver.findElement(By.cssSelector("input[id='confirmAddressButton']"));
    }

    }


