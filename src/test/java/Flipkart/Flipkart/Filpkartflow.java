package Flipkart.Flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import utilities.FlipkartHomepage;
import utilities.SelectedTvpage;

public class Filpkartflow extends BaseTest {
	
	@Test
	public void BasicFlow() {
		
		FlipkartHomepage FH = new FlipkartHomepage(driver);
		BasePage BP = new BasePage(driver);
		SelectedTvpage ST = new SelectedTvpage(driver);
		
		BP.Verifytitle("Online Shopping Site for Mobiles");
		FH.WaitforUsername();
		FH.EnterUsername("9035718788");
		FH.Enterpassword("lathavya");
		FH.ClickonLogin();
		BP.Sleep(1000);
		//FH.Waitforaction();
		//FH.MoveOverToTVsandAppliance(driver);
		FH.EnterSearchInput("MiTV");
		BP.Sleep(2000);
		FH.ClickonSearchbutton();
		driver.findElement(By.xpath("(//select)[2]"));
		
		//Select s = new Select(Select);
		
		//ST.SelectPricedropdown(driver);
		ST.SelectMiBrand();
		//ST.selectSmartTV();
		BP.Sleep(1000);
		
	/*	FH.WaitforMiTV();
		FH.MoveOverToMiTV(driver);
		FH.ClickonMiTV();
		String title = driver.getTitle();
		System.out.println(title);*/
	}
}

