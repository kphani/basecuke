import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kphani on 15/04/2014.
 */
public class LoginPage {
    WebDriver webDriver;

    public LoginPage(WebDriver driver){
    this.webDriver=driver;
    }

    public void navigateToAUrl(String url){
        webDriver.get(url);
    }
    
    public void navigateToBaset(){
    	webDriver.findElement(By.id("basket_bttn")).click();
    }



}
