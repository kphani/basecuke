import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kphani on 15/04/2014.
 */
public class LoginPage {
    WebDriver webDriver;

    public LoginPage(WebDriver driver){
    this.webDriver=driver;
    webDriver.manage().window().maximize();
    webDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    public void navigateToAUrl(String url){
        webDriver.get(url);
    }
    
    public void navigateToBaset(){
    	webDriver.findElement(By.id("basket_bttn")).click();
    }
  
    public void openBrowser(String url){
    	webDriver.get(url);
  
    }


    public void click(){
        webDriver.findElement(By.cssSelector("button[id='sign_in_bttn']")).click();
    }
    public void homePage(String url){
        webDriver.get(url);
    }
    public void i_enter_username_password(String username,String password){
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(username);
        webDriver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
    }
    public void signinbuttonclick(){
        webDriver.findElement(By.cssSelector("button[id='sign_in_bttn']")).click();
    }

    public void inputField(String username, String password) {
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(username);
        webDriver.findElement(By.cssSelector("input[id='password']"));
    }
}
