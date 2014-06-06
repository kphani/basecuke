/**
 * Created by kphani on 09/04/2014.
 *
 *
 */


import com.google.common.collect.Maps;
import cucumber.api.DataTable;
import junit.framework.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;

public class BaseClass {
    private WebDriver driver;
    LoginPage loginPage;
    public SigninPage signin;


    public BaseClass() {
        this.driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        signin = new SigninPage(driver);


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

    //#CURRYS HOME PAGE LOGIN TESTING


    @Given("^I am on main home page$")
    public void i_am_on_currys_homepage() {
        loginPage.openBrowser("https://secure.currys.co.uk/gbuk/s/authentication.html");


    }

    @When("^I type my credentials as(.*) and(.*)$")
    public void enter_username_password(String user, String pass) {

        loginPage.i_enter_username_password(user, pass);


    }

    @And("^I click login button$")
    public void I_click_login_button() {
        loginPage.loginButton();

    }

    @Then("^I should login successfully$")
    public void i_should_login_successfully() {
        loginPage.validateTitle();
        //	Assert.assertEquals(expect," Hello selenium");

    }

    @Given("^I am on currys home page$")
    public void i_navigate_homepage() {

        loginPage.homePage("https://secure.currys.co.uk/gbuk/s/authentication.html");

    }

    @When("^I enter(.*) and (.*)$")
    public void password(String username, String password) {
        loginPage.i_enter_username_password(username, password);


    }

    @And("^ I click on sign in button$")
    public void signinbutton() {
        //	loginPage.signinbuttonclick();

    }

    @Then("^I should be in currys login page$")
    public void I_should_be_in_currys_login_page() throws Throwable {

        throw new PendingException();
    }
    // CLINTON APPLICATION REGISTER TESTING WITH VALID DETAILS

    @Given("^I m on clinton application home page$")
    public void I_m_on_clinton_application_home_page() {
        loginPage.clintonHomepage("http://www.clintoncards.co.uk");

    }

    @When("^I click register button$")
    public void I_click_register_button() {
        loginPage.clickRegister();
    }


    @And("^I submit following valid details to sign in$")
    public void I_enter_following_valid_details_to_sign_in(DataTable tables) throws Throwable {
        List<Map<String, String>> maps = tables.asMaps();
        for (Map<String, String> mp : maps) {
            signin.enterFirstname().clear();
            signin.enterFirstname().sendKeys(mp.get("firstname"));
            signin.lastName().clear();
            signin.lastName().sendKeys(mp.get("lastname"));
            signin.emailAddress().clear();
            signin.emailAddress().sendKeys(mp.get("email"));
            signin.password().clear();
            signin.password().sendKeys(mp.get("password"));
            signin.confirmPassword().clear();
            signin.confirmPassword().sendKeys(mp.get("confirmpassword"));
            loginPage.clickSignInButton();

        }
    }

    @When("^I click on submit button$")
    public void I_click_on_submit_button() {
        loginPage.clickSignInButton();
    }
    //SRINILOGGING TEST IN CLINTION APPLICATION WITH DIFFERENT SET OF DATA

    @Given("^I m register customer of clinton website$")
    public void I_m_register_customer_of_clinton_website() {
        loginPage.navigateToMainPage("http://www.clintoncards.co.uk");
    }

    @When("^I click on sign in button on main page$")
    public void I_click_on_sign_in_button_on_main_page() {
        loginPage.signInClickOnMainPage();
    }

    @Then("^I submit valid(.*)and(.*)$")
    public void I_give_valid_userdetails_and_passwordetails(String userdetails, String passworddetails) {
        loginPage.myDetails(userdetails, passworddetails);

    }

    @Then("^I should get message (.*)$")
    public void I_should_only_login_with_valid_details(String loginValidation) {
        Assert.assertEquals(loginValidation, loginPage.loginSuccess());
        // Assert.assertEquals(loginValidation,loginPage.getUserNameValidation());
        // Assert.assertEquals(loginValidation,loginPage.getPasswordMessage());


    }

    @Then("^I have to get (.*)$")
    public void I_should_username_validation(String userValidationMess) {
        Assert.assertEquals(userValidationMess, loginPage.getUserNameValidation());


    }

    @Then("^I need to get (.*)$")
    public void I_should_password_validation(String passValidationMess) {
        Assert.assertEquals(passValidationMess, loginPage.getPasswordMessage());

    }
    //sricorrectdetailslogging to buy online item with clinton application

    @Given("^srinivas accessing clinton main page$")
    public void srinivas_accessing_clinton_main_page() {
        loginPage.clintonHomePage("http://www.clintoncards.co.uk");

    }

    @When("^srini click on sign button$")
    public void srini_click_on_sign_button() {
        loginPage.sriniClickOnSignInButton();
    }

    @When("^sri submit valid(.*)and(.*)$")
    public void sri_enter_valid_userid_and_passwordid(String usern, String passw) {
        loginPage.sriniEntersValidDetails(usern, passw);

    }


    @Then("^my (.*) should dispaly on page*")
    public void my_details_should_dispaly_on_page(String myDetails) {
        //  String actual ="myDetailsShouldDisplay()";
        Assert.assertEquals("Hello, seleni srini!", loginPage.myDetailsShouldDisplay());

    }

    //CLINTON BASKET ADDING TEST
    @Given("^srinivasa using clintion homepage$")
    public void srinivasa_using_clintion_homepage() {
        loginPage.srinivasaHomePage("http://www.clintoncards.co.uk");


    }

    @When("^srinivasa hoover on login button$")
    public void srinivasa_hoover_on_login_button() {
        loginPage.hooverOnLoginButton();

    }

    @When("^srinivasa submit (.*) and (.*)$")
    public void srinivasa_submit_username_and_password(String username, String password) {
        loginPage.sriniUsernameAndPassword(username, password);
    }

    @When("^srinivasa click on gift link$")
    public void srinivasa_click_on_gift_link() {
        loginPage.giftLink();

    }

    @Then("^(.*) page should display$")
    public void gifts_page_should_display(String mess) {
        Assert.assertEquals("Gifts", loginPage.validateGiftLink());

    }

    @When("^srinivasa click on gift for homes link$")
    public void srinivasa_click_on_gift_for_homes_link() {
        loginPage.giftForHomeLink();

    }

    @And("^srinivasa click on item$")
    public void srinivasa_click_on_item() {
        loginPage.clickItem();

    }

    @And("^srinivas verify the (.*)$")
    public void verify_the_itemdetails(String productDetails) {
        //loginPage.verifyProductDetails();
        Assert.assertEquals("Yankee Candle Beach Flowers Small Jar", loginPage.verifyProductDetails());

    }

    @And("^select the quantity(.*)$")
    public void select_the_quantity(String nume) {

        loginPage.selectQuantity(nume);
    }

    @And("^click addtobasket button and checkout$")
    public void click_addtobasket_button() {
        loginPage.addToBasket();
        loginPage.checkoutButton().click();

    }

    @And("^successfully add to basket (.*) should display$")
    public void successfully_add_to_basket_message_should_display(String message) {
        //loginPage.addToBasketMessage();
        // Assert.assertEquals("The requested quantity for \"Yankee Candle Beach Flowers Small Jar\" is not available.",loginPage.addToBasketMessage());
        loginPage.addToBasketMessage();
    }
    //SAME TEST WITH EXAMPLES

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        loginPage.userHomePage("http://www.clintoncards.co.uk");

    }

    @When("^user click on login button on homepage$")
    public void user_click_on_login_button_on_homepage() {
        loginPage.userLoginButtonClick();
    }

    @Then("^user submit valid (.*) and (.*)$")
    public void user_submit_valid_username_and_password(String username, String password) {
        loginPage.userEnterValidUsernameAndPassword(username, password);

    }

    @And("^user click on (.*) below to perform actions on application$")
    public void user_perform_below_actions_on_application(String link) {
        if (link.equalsIgnoreCase("GiftCards")) {
            loginPage.giftCardsLink().click();
            loginPage.clickGiftsTyBeans().click();
        }
        if (link.equalsIgnoreCase("cards")) {
            loginPage.cardsLink().click();

        }
    }

    @And("^user click on the  product (.*)$")
    public void userClickOnItem(String item) {

        loginPage.getProductItemByLinkText(item).click();
    }

    @And("^user select (.*) and add item to basket$")
    public void

    user_select_quantity_to_add_item_to_basket(String quantity) {
        loginPage.userSelectQuantity(quantity);
        loginPage.addToBasket();

    }

    @And("^user click (.*) to add item$")
    public void user_click_addtobasket_to_add_item(String added) {
        loginPage.userAddToCartButtonClick();
    }

    @And("^checkout and verify the same (.*) item added to basket$")
    public void verify_validationMessage(String product) {
        loginPage.checkoutButton().click();
       Assert.assertTrue(loginPage.getProductItemByLinkText(product).isDisplayed());


    }
}

    	
    


