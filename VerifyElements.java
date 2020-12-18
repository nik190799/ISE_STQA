import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
	
	
	
public class VerifyElements{
	
	WebDriver driver;
	
	@Test
	public void launchBrowser(){
		
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikhil Kadalge\\Documents\\Last Year I\\STQA\\videos\\test\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("http://www.practiceselenium.com/check-out.html");
		
	 WebElement email=driver.findElement(By.id("email"));
	 email.sendKeys("nkadalge@gmail.com");
	 
	 WebElement name=driver.findElement(By.id("name"));
	 name.sendKeys("Nikhil Kadalge");
	 
	 WebElement address=driver.findElement(By.id("address"));
	 address.sendKeys("stara");
	 
	 Select dropdown = new Select(driver.findElement(By.id("card_type")));
	 dropdown.selectByVisibleText("Mastercard");
	 
	 WebElement cardnumber=driver.findElement(By.id("card_number"));
	 cardnumber.sendKeys("1234567890");
	 
	 WebElement cardholdername=driver.findElement(By.id("cardholder_name"));
	 cardholdername.sendKeys("Nikhil Kadalge");
	 
	 WebElement verifycode=driver.findElement(By.id("verification_code"));
	 verifycode.sendKeys("0159");
	 
	 boolean eleSelected= driver.findElement(By.id("name")).isDisplayed();
	 System.out.println(eleSelected);
	 
	 WebElement placeorder= driver.findElement(By.xpath("//button[text()='Place Order']"));
	 placeorder.click();
	 
	 System.out.println("Order Placed");
	 String Actual = driver.getTitle();
	 String Expected = "Menu";
	 
	 if (Actual.equals(Expected)) {
	     System.out.println("Test Passed!");
	    } else {
	     System.out.println("Test Failed");
	    }
	}
    	
    public static void main(String[] args){
    	VerifyTitle obj =  new VerifyTitle();
		obj.launchBrowser();

	}
}
