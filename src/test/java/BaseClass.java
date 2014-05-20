/**
 * Created by kphani on 09/04/2014.
 *
 *
 */



import junit.framework.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class  BaseClass {
    private  WebDriver driver;
    LoginPage loginPage;

    public BaseClass() {
        this.driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        

    }
    

    @Given("^I am on the Google page$")
    public void i_am_on_the_Google_page() {
        loginPage.navigateToAUrl("http://www.google.co.uk");
    }

    @Then("^I am on yahoo page$")
    public void I_am_on_yahoo_page() throws Throwable {
        loginPage.navigateToAUrl("http://currys.co.uk");
    }
    
    @Then("^click on basket link$")
    public void I_am_on_sports_page() throws Throwable {
        loginPage.navigateToBaset();
    }
    
    
    @Given("^I am on main home page$")
    public void i_am_on_currys_homepage(){
    	loginPage.openBrowser("https://secure.currys.co.uk/gbuk/s/authentication.html");
    	
    	
    }
    @When("^I enter (.*) and (.*)$")
    public void enter_username_password(String username,String password){
    	loginPage.inputField(username, password);
    	
    	
    }

    @Then("^I should login successfully$")
    public void i_should_login_successfully(){
    	
    	Assert.assertEquals(driver.getTitle(), "My Account - Home | Currys");
    	
    }
    @Given("^I am on currys home page$")
    public void i_navigate_homepage(){
    	
    	loginPage.homePage("https://secure.currys.co.uk/gbuk/s/authentication.html");
    	
    }
    @When("^I enter(.*) and (.*)$")
    public void password(String username,String password){
    	loginPage.i_enter_username_password(username, password);
    	
    }
    @And("^ I click on sign in button$")
    public void signinbutton(){
    	loginPage.signinbuttonclick();
    	
    }
    public void i_should_be_in_loginpage(){
    	
    }
    	
    
}

