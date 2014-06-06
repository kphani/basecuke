import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by kphani on 15/04/2014.
 */
public class LoginPage {
    public WebDriver webDriver;
    public SigninPage signin;


    public LoginPage(WebDriver driver) {
        this.webDriver = driver;
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public void navigateToAUrl(String url) {
        webDriver.get(url);
    }

    public void navigateToBaset() {
        webDriver.findElement(By.id("basket_bttn")).click();
    }

    public void openBrowser(String url) {
        webDriver.get(url);

    }


    public void click() {
        webDriver.findElement(By.cssSelector("button[id='sign_in_bttn']")).click();
    }

    public void homePage(String url) {
        webDriver.get(url);
    }

    public void i_enter_username_password(String user, String pass) {
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(user);
        webDriver.findElement(By.cssSelector("input[id='password']")).sendKeys(pass);
    }

    public void loginButton() {
        webDriver.findElement(By.cssSelector("button[class='btn btnBold btnMain']")).click();
    }

    public void validateTitle() {
        //  webDriver.findElement(By.cssSelector("a[href='https://secure.currys.co.uk/gbuk/s/my-account.html']")).getText();
        //return new String();

    }

    public void inputField(String username, String password) {
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(username);
        webDriver.findElement(By.cssSelector("input[id='password']")).sendKeys(password);
    }
    // CLINTON APPLICATION REGISTER TESTING WITH VALID DETAILS

    public void clintonHomepage(String site) {
        webDriver.get(site);
    }

    public void clickRegister() {
        webDriver.findElement(By.cssSelector("a[href='https://www.clintoncards.co.uk/customer/account/create/']")).click();
    }

    public void clickSignInButton() {
        webDriver.findElement(By.cssSelector("button[title='Submit']")).click();
    }
    //SRINILOGGING TEST IN TO CLINTION APPLICATION WITH DIFFERENT SET OF DATA

    public void navigateToMainPage(String mainsite) {
        webDriver.get(mainsite);
    }

    public void signInClickOnMainPage() {
        webDriver.findElement(By.cssSelector("a[href='https://www.clintoncards.co.uk/customer/account/login/']")).click();

    }

    public void myDetails(String usern, String passw) {
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(usern.trim());
        webDriver.findElement(By.cssSelector("input[id='pass']")).sendKeys(passw.trim());

    }

    public String loginSuccess() {
        return webDriver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div[2]/h3")).getText();
    }

    public String getUserNameValidation() {
        return webDriver.findElement(By.xpath("//*[@id='advice-validate-email-email']/span")).getText();
    }

    public String getPasswordMessage() {
        return webDriver.findElement(By.xpath("//*[@id='advice-validate-password-pass']/span")).getText();


    }


    // sricorrectdetailslogging TEST TO BUY ITEM WITH CLINTON APPLICATION

    public void clintonHomePage(String baseurl) {
        webDriver.get(baseurl);

    }

    public void sriniClickOnSignInButton() {
        webDriver.findElement(By.cssSelector("a[href='https://www.clintoncards.co.uk/customer/account/login/']")).click();
    }

    public void sriniEntersValidDetails(String userid, String passwordid) {
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(userid.trim());
        webDriver.findElement(By.cssSelector("input[id='pass']")).sendKeys(passwordid.trim());
        webDriver.findElement(By.cssSelector("button[id='send2']")).click();
    }


    public String myDetailsShouldDisplay() {
        return webDriver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div[2]/h3")).getText();


    }
    //CLINTON BASKET ADDING AND VERIFYING ITEMS ADDED TO THE LIST

    public void srinivasaHomePage(String website) {
        webDriver.get(website);

    }

    public void hooverOnLoginButton() {
        webDriver.findElement(By.cssSelector("a[href='https://www.clintoncards.co.uk/customer/account/login/']")).click();
    }

    public void sriniUsernameAndPassword(String username, String password) {
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(username.trim());
        webDriver.findElement(By.cssSelector("input[id='pass']")).sendKeys(password.trim());
        webDriver.findElement(By.cssSelector("button[id='send2']")).click();

    }

    public void giftLink() {
        webDriver.findElement(By.xpath("//*[@id='nav']/li[4]/a/span[2]")).click();
    }

    public String validateGiftLink() {
      return   webDriver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[3]/div/div/div[1]/h1")).getText();


    }

    public void giftForHomeLink() {
        webDriver.findElement(By.cssSelector("a[href='http://www.clintoncards.co.uk/gifts/where/category/gifts-for-the-home']")).click();
    }
   public void clickItem(){
       webDriver.findElement(By.cssSelector("a[href='http://www.clintoncards.co.uk/yankee-candle-beach-flowers-small-jar']")).click();
   }
    public String verifyProductDetails(){
       return webDriver.findElement(By.xpath("//*[@id='product_addtocart_form']/div[2]/div/h1")).getText();
    }
  public void selectQuantity(String num){
      webDriver.findElement(By.cssSelector("input[id='qty']")).clear();
      webDriver.findElement(By.cssSelector("input[id='qty']")).sendKeys(num);
  }
    public void addToBasket(){
        webDriver.findElement(By.cssSelector("button[class='button btn-cart']")).click();
    }
    public WebElement checkoutButton(){
        return webDriver.findElement(By.linkText("View Basket & Checkout"));
    }
    public void addToBasketMessage(){
      webDriver.findElement(By.cssSelector("a[href='http://www.clintoncards.co.uk/checkout/cart/']")).click();
  }
    //SAME TEST WITH EXAMPLES

    public void userHomePage(String userwebsite){
    webDriver.get(userwebsite);
    }
    public void userLoginButtonClick(){
        webDriver.findElement(By.cssSelector("a[href='https://www.clintoncards.co.uk/customer/account/login/']")).click();
    }
    public void userEnterValidUsernameAndPassword(String username,String password){
        webDriver.findElement(By.cssSelector("input[id='email']")).sendKeys(username.trim());
        webDriver.findElement(By.cssSelector("input[id='pass']")).sendKeys(password.trim());
        webDriver.findElement(By.cssSelector("button[id='send2']")).click();
    }
    public WebElement fathersDayLink(){
       return webDriver.findElement(By.xpath("//*[@id='nav']/li[2]/a/span[2]"));
    }

    public WebElement cardsLink(){
        return webDriver.findElement(By.linkText("Cards"));
    }

    public WebElement giftCardsLink(){
        return webDriver.findElement(By.linkText("Gifts"));
    }

    public WebElement clickGiftsTyBeans(){
        return webDriver.findElement(By.cssSelector("a[href='http://www.clintoncards.co.uk/ty-beanies-hello-kitty-rainbow-small']"));

    }
    public void userClickOnItem(){
        webDriver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[3]/div/ul/li[4]/a/img")).click();
        webDriver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div[3]/div/div/div[2]/ul[1]/li[1]/a")).click();
    }
    public void userSelectQuantity(String quantity){
        webDriver.findElement(By.cssSelector("input[id='qty']")).clear();
        webDriver.findElement(By.cssSelector("input[id='qty']")).sendKeys(quantity);
    }
    public void userAddToCartButtonClick(){
        webDriver.findElement(By.cssSelector("button[class='button btn-cart']")).click();
        webDriver.findElement(By.xpath("html/body/div[7]/div/a[2]")).click();
    }
   public String userVerifyProductDetails(){
     return  webDriver.findElement(By.cssSelector("a[href='http://www.clintoncards.co.uk/boofle-dad-of-the-year-trophy-plaque']")).getText();

   }
    public void userClickOnCardsLink(){
        webDriver.findElement(By.xpath("//*[@id='nav']/li[3]/a/span[2]")).click();
    }




    public WebElement getProductItemByLinkText(String itemLinkText){
        return webDriver.findElement(By.linkText(itemLinkText));
    }




}

