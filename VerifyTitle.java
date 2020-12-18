import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class VerifyTitle {

	WebDriver driver;
	//TestNG 4.2 task 
	@Test
	public void launchBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nikhil Kadalge\\Documents\\Last Year I\\STQA\\videos\\test\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.practiceselenium.com/check-out.html");
		
		String page_title = driver.getTitle();
		
		System.out.println("Title is "+ page_title);
		
		String expected_title = "Check Out" ;
		
		Assert.assertEquals(page_title, expected_title);
		
		System.out.println("Test Completed & Page title found...!");
		
		
		
	}
	public static void main(String[] args) {
		
		VerifyTitle obj =  new VerifyTitle();
		obj.launchBrowser();
	}

}



