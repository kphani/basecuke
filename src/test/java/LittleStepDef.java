import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Map;

/**
 * Created by Ram on 03/06/2014.
 */
public class LittleStepDef {
    public WebDriver driver;
    public LittleClass main;
    public LittleWebelement regis;

    public LittleStepDef(){
        this.driver= new FirefoxDriver();
        main=new LittleClass(driver);
         regis= new LittleWebelement(driver);

    }
    @Given("^I m using littlewoods website$")
    public void I_m_using_littlewoods_homepage(){
        main.myHomePageLittleWoods("http://www.littlewoods.co.uk");

    }
    @When("^I click on my account link$")
    public void I_click_on_my_account_link(){
        main.myAccoutClick();

    }
    @When("^I click on join button$")
    public void I_click_on_join_button(){
        main.joinButtonToRegister();

    }


    @Then("^I enter following details to register$")
    public void I_enter_following_details_to_register(DataTable table){
        Map<String,String> Map=table.asMaps().get(0);
        List<Map<String,String>> Maps=table.asMaps();
        for (Map<String,String>mp:Maps){

          WebElement drop= driver.findElement(By.cssSelector("select[id='homeAddress_prefix']"));
          List<WebElement>dropdownselect=drop.findElements(By.tagName("option"));
            for(WebElement option:dropdownselect){
                if("Mr".equals(option.getText()))
                    option.click();
            }

          //  regis.clickTitle().sendKeys(mp.get("title"));

            regis.firstNameEnter().sendKeys(mp.get("firstName"));

            regis.lastNameClick().sendKeys(mp.get("lastName"));

           // regis.selectDayOfBirthDay().sendKeys(mp.get("day"));
       WebElement date=driver.findElement(By.cssSelector("select[id='dateOfBirthDay']"));
        List<WebElement> myDate=date.findElements(By.tagName("option"));
            for (WebElement option:myDate){
                if ("05".equals(option.getText()))
                    option.click();
            }

           // regis.selectDayOfBirthMonth().sendKeys(mp.get("month"));
         WebElement month= driver.findElement(By.cssSelector("select[id='dateOfBirthMonth']"));
      List<WebElement> myMonth=month.findElements(By.tagName("option"));
            for (WebElement option:myMonth){
                if ("June".equals(option.getText()))
                    option.click();
            }
           // regis.selectDayOfBirthYear().clear();
            //regis.selectDayOfBirthYear().sendKeys(mp.get("year"));
         WebElement year= driver.findElement(By.cssSelector("select[id='dateOfBirthYear']"));
      List<WebElement> myYear=year.findElements(By.tagName("option"));
            for (WebElement option:myYear){
                if ("1980".equals(option.getText())){
                    option.click();
                }
            }
           // regis.selectHomePhoneNumber().clear();
            regis.selectHomePhoneNumber().sendKeys(mp.get("contact"));
           // regis.selectMobileNumber().clear();
            regis.selectMobileNumber().sendKeys(mp.get("mobileNumber"));
           // regis.emailAdressEnter().clear();
            regis.emailAdressEnter().sendKeys(mp.get("emailAdress"));
           // regis.confirmEmailAdress().clear();
            regis.confirmEmailAdress().sendKeys(mp.get("confirmEmailAdress"));
           // regis.passwordEnter().clear();
            regis.passwordEnter().sendKeys(mp.get("password"));
           // regis.confirmPasswordEnter().clear();
            regis.confirmPasswordEnter().sendKeys(mp.get("confirmPassword"));
           // regis.houseNumberEnter().clear();
            regis.houseNumberEnter().sendKeys(mp.get("homeAdress"));

            regis.enterPostcode().sendKeys(mp.get("postcode"));
            regis.findAdressClick().click();
            regis.clickContinue().click();
            regis.confirmAdd();
    }


        }



    }


