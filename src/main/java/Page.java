
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Page {
	public WebDriver driver;
	public Properties config;
	public Properties or;
	public RegistrationPage reg;
	
	public Page(WebDriver driver){
		
		
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	public void homesite(String url){
		driver.get(url);
		
	}
	 
	public void accountLinkClick(){
		driver.findElement(By.cssSelector("a[href='/my-account/']")).click();
		
	}
	
	
	public void inPutField(String username,String password){
		driver.findElement(By.cssSelector("input[id='myvision_user_username']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id='myvision_user_password']")).sendKeys(password);
		
	}
	public void signinButton(){
		driver.findElement(By.cssSelector("button[class='large-cta']")).click();
		
		
	}
	public void clickGlass(){
	driver.findElement(By.cssSelector("a[href='/glasses/']")).click();
	}
	
	public void desinerLink(){
		driver.findElement(By.cssSelector("a[href='/designer-brands/glasses/']")).click();
	}
    public void desinerPageLoad(){
    	driver.findElement(By.cssSelector("a[href='/designer-brands/hugo-boss/']")).click();
	   
   }
    public void hugoBossImg(){
    	driver.findElement(By.cssSelector("img[class='brand-logo']")).click();
    }
   
    	public void popularHuguBossLoad(){
    	
    	}
    	
    	//sports direct testing starting
    	public void openBrowser(String url){
    		driver.get(url);
    		
    	}
    	public void signInButtonForSportsDirect(){
    		driver.findElement(By.cssSelector("a[id='dnn_dnnLOGIN_loginLink']")).click();
    	}
    	public void clickContinue(){
    		driver.findElement(By.linkText("CONTINUE")).click();
    	}
    	public void enterEmailId(String email){
    		driver.findElement(By.cssSelector("input[id='dnn_ctr29896_View_txtEmailAddress']")).sendKeys(email);
    		
    	}
    	public void reTypeMyEmailId(String email){
    		driver.findElement(By.cssSelector("input[id='dnn_ctr29896_View_txtEmailAddressValidate']")).sendKeys(email);
    		
    	}
    	

    	
    	public void selectTitleFromDroplist(String title){
    		driver.findElement(By.cssSelector("select[id='dnn_ctr29896_View_ddlTitle']")).sendKeys(title);
    	
    	
    }
    	public void enterFirstName(String firstname){
    		driver.findElement(By.cssSelector("input[id='dnn_ctr29896_View_txtFirstName']")).sendKeys(firstname);
    	}
    	public void enterLastName(String lastname){
    		driver.findElement(By.cssSelector("input[id='dnn_ctr29896_View_txtLastName']")).sendKeys(lastname);
    		
    	}
    	public void enterMyDob(String Dob){
    		driver.findElement(By.cssSelector("input[id='txtDateOfBirth']")).sendKeys(Dob);
    		
    	}
    	public void enterMyDoorNumber(String doornumber){
    		driver.findElement(By.cssSelector("input[id='txtAddress2']")).sendKeys(doornumber);
    		
    	}
    	public void streetName(String street){
    		driver.findElement(By.cssSelector("input[id='txtTownCity']")).sendKeys(street);
    	}
    	public void postCode(String postcode){
    		driver.findElement(By.cssSelector("input[id='txtPostcode']")).sendKeys(postcode);
    	}
    	public void myMobileNumber(int number){
    		driver.findElement(By.cssSelector("input[id='txtMobileNumber']")).sendKeys("number");
    		
    	}
    	public void myPassword(String password){
    		driver.findElement(By.cssSelector("input[id='dnn_ctr29896_View_txtPassword']")).sendKeys(password);
    		
    	}
    	public void confirmPassword(String confirmpassword){
    		driver.findElement(By.cssSelector("input[id='dnn_ctr29896_View_txtConfirm']")).sendKeys();
    	}
    	public void clickRegisterButton(){
    		driver.findElement(By.cssSelector("a[id='dnn_ctr29896_View_cmdRegister']")).click();
    	}
}
