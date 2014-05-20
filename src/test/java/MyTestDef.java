import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

import cucumber.api.DataTable;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyTestDef {
    public WebDriver driver;
    public Properties config;
    public Properties or;
    public Page mypage;
    public RegistrationPage reg;

    public MyTestDef() {
        this.driver = new FirefoxDriver();
        mypage = new Page(driver);
        reg = new RegistrationPage(driver);
        config = new Properties();
        or = new Properties();
        try {
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.proerties");
            config.load(fs);
            fs = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\or.properties");
            or.load(fs);
        } catch (Exception e) {

            e.printStackTrace();

        }
        System.out.println(config.getProperty("testsiteurl"));


    }

    @Given("^I m on main page$")
    public void I_m_on_main_page() {
        mypage.homesite(config.getProperty("testsite"));


    }

    @When("^i click on account link$")
    public void i_click_on_account_link() {
        mypage.accountLinkClick();

    }


    @When("^enter(.*)and(.*)$")
    public void i_enter_user_pass(String username, String password) {
        mypage.inPutField(username, password);
    }


    @Then("^I should log in successfully$")
    public void loggedin() {
        Assert.assertNotSame(driver.getTitle(), "Vision Express[ ]- My Vision Express");

    }

    @Given("^I m logged in user$")
    public void I_logged_in_user() {
        Assert.assertEquals(driver.getTitle(), "desiner links");

    }

    @When("^I click on glass link$")
    public void i_click_glass_link() {
        mypage.clickGlass();

    }

    @And("^I click on desiner link$")
    public void i_click_desiner_link() {
        mypage.desinerLink();

    }

    @Then("^page with desiner names should display$")
    public void page_with_deisner_names_should_Display() {
        mypage.desinerPageLoad();

    }

    @When("^I click hugo boss image$")
    public void i_click_hugo_boss_glass_should_load() {
        mypage.hugoBossImg();


    }

    @Then("^popular hugo boss glasses page should load$")
    public void popular_hugo_boss_glass_should_load() {
        Assert.assertEquals(driver.getTitle(), "Hugo Boss ");

    }
    //SPORTSDIRECT TESTING START

    @Given("^I m on sports direct page$")
    public void i_m_on_sportsdirect_page() {
        mypage.openBrowser(config.getProperty("testsite2"));

    }

    @When("^I click on sign in button$")
    public void I_click_on_sign_in_button() {
        mypage.signInButtonForSportsDirect();
    }

    @When("^I click on new customer  continue button$")
    public void I_click_on_new_customer_continue_button() {
        mypage.clickContinue();

    }

    @When("^user entered below details to register as new user$")
    public void userEnteredRegistrationDetails(DataTable table) throws Throwable {
        //  @SuppressWarnings("unchecked")
        //Map<String, String> datas = table.asMaps(null, null);
        Map<String, String> map = table.asMaps().get(0);
        List<Map<String, String>> maps = table.asMaps();
        for(Map <String,String> mp: maps){
            reg.emailAddress().sendKeys(mp.get("emailAdd"));


            
            reg.confirmButton.click();
          String actualMsg=  reg.getValidationMsg();
          Assert.assertEquals(actualMsg, mp.get("validation"));


        }
        }


        reg.emailAddress().sendKeys(map.get("email"));
        reg.retypeEmailAdress().sendKeys(map.get("confEmail"));


    }


    @And("^retype my(.*)$")
    public void retype_my_emailid(String email) {
        mypage.reTypeMyEmailId(email);

    }


    @And("^select(.*)from dropdownlist$")
    public void select_title_from_dropdownlist(String title) {
        mypage.selectTitleFromDroplist(title);

    }

    @And("^enter my lastname(.*)$")
    public void enter_my_lastname(String lastname) {
        mypage.enterLastName(lastname);

    }

    @And("^confirm enter my(.*)$")
    public void confirm_enter_my_Password(String confirmpassword) {
        mypage.confirmPassword(confirmpassword);

    }

    @Then("^I click on register button$")
    public void I_click_on_register_Button() {
        mypage.clickRegisterButton();

    }

    @Then("^I should successfully register$")
    public void registerSucessfull() {
        Assert.assertEquals(driver.getTitle(), "register successfully");

    }

}
