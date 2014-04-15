/**
 * Created by kphani on 09/04/2014.
 *
 *
 */



import cucumber.api.PendingException;
import cucumber.api.java.en.*;
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
        loginPage.navigateToAUrl("http://yahoo.co.uk");
    }
}

