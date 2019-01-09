package Flipkart.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import generic.BasePage;

public class needtoask  {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	BasePage BP = new BasePage(driver);
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9035718788");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lathavya");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	BP.Sleep(1000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MiTV");
	BP.Sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	WebElement Sel = driver.findElement(By.xpath("(//select)[2]"));
	Select s = new Select(Sel);
	s.selectByValue("20000");
	
}
	
	

}
