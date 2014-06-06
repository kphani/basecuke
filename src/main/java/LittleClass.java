import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ram on 03/06/2014.
 */
public class LittleClass {
    public WebDriver driver;
    public LittleWebelement ele;

    public LittleClass(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    public void myHomePageLittleWoods(String baseurl) {
        driver.get(baseurl);

    }

    public void myAccoutClick() {
        driver.findElement(By.cssSelector("a[href='https://www.littlewoods.com/account/myaccount/accountSummary.page']")).click();

    }

    public void joinButtonToRegister() {
        driver.findElement(By.cssSelector("input[id='newCustomerSubmitButton']")).click();
    }



    }

