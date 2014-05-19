import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

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
	
	public MyTestDef(){
		this.driver=new FirefoxDriver();
	 mypage = new Page(driver);
	 config=new Properties();
	 or=new Properties();
		 try {
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.proerties");
		  config.load(fs);
		   fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\or.properties");
		  or.load(fs);
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		 System.out.println(config.getProperty("testsiteurl"));
		 
	
	}
	@Given("^I m on main page$")
	public void I_m_on_main_page(){
		mypage.homesite(config.getProperty("testsite"));
		
		
	} 
	@When("^i click on account link$")
	public void i_click_on_account_link(){
		mypage.accountLinkClick();
		
	}
	
	
	@When("^enter(.*)and(.*)$")
	public void i_enter_user_pass(String username,String password){
		mypage.inPutField(username, password);
	}
	
	@And("^I click signin button$")
	public void i_click_signin(){
		mypage.signinButton();
		
	}
	@Then("^I should log in successfully$")
	public void loggedin(){
		Assert.assertNotSame(driver.getTitle(), "Vision Express[ ]- My Vision Express");
		
	}
	@Given("^I m logged in user$")
	public void I_logged_in_user(){
	Assert.assertEquals(driver.getTitle(), "desiner links");
		
	}
	@When("^I click on glass link$")
	public void i_click_glass_link(){
		mypage.clickGlass();
		
	}
	@And("^I click on desiner link$")
	public void i_click_desiner_link(){
		mypage.desinerLink();
		
	}
	@Then("^page with desiner names should display$")
    public void page_with_deisner_names_should_Display(){
		mypage.desinerPageLoad();
    	
    }
	@When("^I click hugo boss image$")
	public void i_click_hugo_boss_glass_should_load(){
		mypage.hugoBossImg();
		
		
	}
	@Then("^popular hugo boss glasses page should load$")
	public void popular_hugo_boss_glass_should_load(){
		Assert.assertEquals(driver.getTitle(), "Hugo Boss ");
		
	}
	//sportsdirect test starting
	
	@Given("^I m on sportsdirect page$")
	public void i_m_on_sportsdirect_page(){
		mypage.openBrowser(config.getProperty(" testsite2"));
		
	}
	@When("^I click on sign in button$")
	public void  I_click_on_sign_in_button(){
		mypage.signInButtonForSportsDirect();
	}
	@When("^I click on new customer  continue button$")
	public void I_click_on_new_customer_continue_button(){
		mypage.clickNewCustomer();
		
	}
	@And("^enter my(.*)$")
	public void enter_my_emailid(String email){
		mypage.enterEmailId(email);
		
	
}   @And("^retype my(.*)$")
	public void retype_my_emailid(String email){
	mypage.reTypeMyEmailId(email);
		
	}
	
	
	@And("^select(.*)from dropdownlist$")
	public void select_title_from_dropdownlist(String title){
		mypage.selectTitleFromDroplist(title);
		
	}
	@And("^ enter my(.*)$")
	public void enter_my_name(String firstname){
		mypage.enterFirstName(firstname);
		
	}
	@And("^enter my(.$)$")
	public void enter_my_lastname(String lastname){
		mypage.enterLastName(lastname);
		
	}
	@And("^ enter my(.*)$")
	public void enter_my_Dob(String Dob){
		mypage.enterMyDob(Dob);
		
	}
	@And("^enter my(.*)$")
	public void enterMyDoorNumber(String doornumber){
		mypage.enterMyDoorNumber(doornumber);
		
	}
	@And("^enter my(.*)$")
	public void enter_my_street_name(String street){
		mypage.streetName(street);
		
	}
	@And("^ enter my(.*)$")
	public void enter_my_postCode(String postcode){
		mypage.postCode(postcode);
		
	}
	@And("^enter my(.*)$")
	public void enter_my_mobileNumber(int number){
		mypage.myMobileNumber(number);
		
		
	}
	@And("^enter my(.*)$")
	public void enter_password(String password){
		mypage.myPassword(password);
		
	}
	@And("^confirm enter my(.*)$")
	public void confirm_enter_my_Password(String confirmpassword){
		mypage.confirmPassword(confirmpassword);
		
	}
	@Then("^I click on register button$")
	public void I_click_on_register_Button(){
		mypage.clickRegisterButton();
		
	}
	@Then("^I should successfully register$")
	public void registerSucessfull(){
		Assert.assertEquals(driver.getTitle(), "register successfully");
		
	}

}
