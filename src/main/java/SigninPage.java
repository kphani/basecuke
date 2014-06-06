import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Ram on 23/05/2014.
 */
public class SigninPage {
    public WebDriver driver;


    public SigninPage(WebDriver driver){
        this.driver=driver;

    }
    public WebElement enterFirstname(){
        return driver.findElement(By.cssSelector("input[id='firstname']"));

    }
    public WebElement lastName(){
        return driver.findElement(By.cssSelector("input[id='lastname']"));
    }
    public WebElement emailAddress(){
        return driver.findElement(By.cssSelector("input[id='email_address']"));
    }
  public WebElement password(){
      return driver.findElement(By.cssSelector("input[id='password']"));
  }
    public WebElement confirmPassword(){
        return driver.findElement(By.cssSelector("input[id='confirmation']"));
    }

}
