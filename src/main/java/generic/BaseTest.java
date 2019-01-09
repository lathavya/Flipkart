package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements Auto_const {
static{
	System.setProperty(Chrome_Key,Chrome_value);
}

	public WebDriver driver;
	@BeforeMethod
	public void OpenApp()
		{
		driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver = this.driver;
		}

}
