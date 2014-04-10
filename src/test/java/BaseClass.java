/**
 * Created by kphani on 09/04/2014.
 *
 *
 */



import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    private  WebDriver driver;

    public BaseClass() {
        this.driver = new FirefoxDriver();

    }

    @Given("^I am on the front page$")
    public void i_am_on_the_front_page() {
       //  driver.get("http://localhost:" + ServerHooks.PORT);

    }

    @Given("^I am on the Google page$")
    public void i_am_on_the_Google_page() {
        driver.get("http://google.co.uk");
    }

    @Then("^I am on yahoo page$")
    public void I_am_on_yahoo_page() throws Throwable {
        driver.get("http://yahoo.co.uk");
    }
}

