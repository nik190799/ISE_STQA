import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest {

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
		 address.sendKeys("Satara");
		 
		 Select dropdown = new Select(driver.findElement(By.id("card_type")));
		 dropdown.selectByVisibleText("Mastercard");
		 
		 	try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 
		 WebElement cardnumber=driver.findElement(By.id("card_number"));
		 cardnumber.sendKeys("1234567890");
		 
		 WebElement cardholdername=driver.findElement(By.id("cardholder_name"));
		 cardholdername.sendKeys("Nikhil Kadalge");
		 
		 WebElement verifycode=driver.findElement(By.id("verification_code"));
		 verifycode.sendKeys("0159");
		 
	     WebElement placeorder= driver.findElement(By.xpath("//button[text()='Place Order']"));
	     placeorder.click();
	     
	     
	     try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	     
	     System.out.println("Order Placed...!");
	     
	     //task 3.b
	     String page_title = driver.getTitle();
			
			System.out.println("Title is "+ page_title);
			
			String expected_title = "Check Out" ;
			
			Assert.assertEquals(page_title, expected_title);
			
			System.out.println("Test Completed...!");
			
	}
	
	public static void main(String[] args) {
		
		SignInTest obj =  new SignInTest();
		obj.launchBrowser();
	}

}


