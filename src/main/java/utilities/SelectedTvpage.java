package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.BasePage;

public class SelectedTvpage extends BasePage 
{
	WebDriver driver;
	
	@FindBy(xpath="(//select)[2]")
	private WebElement pricedropdown;
	@FindBy(xpath="(//div[.='Mi'])[1]")
	private WebElement Brand;
	@FindBy(xpath="(//div[.='Yes'])[1]")
	private WebElement Smarttv;
	@FindBy(xpath="(//div[.='4★ & above'])[1]")
	private WebElement CustomerRating;
	@FindBy(xpath="(//div[.='Resolution'])[1]")
	private WebElement Resolution;
	@FindBy(xpath="//div[@title='HD Ready']")
	private WebElement HD;
	@FindBy(xpath="(//div[.='Operating System'])[1]")
	private WebElement OperatingSysetm; 
	@FindBy(xpath="(//div[.='Android Based'])[1]")
	private WebElement Android;
	@FindBy(xpath="(//div[.='Connectivity Features'])[1]")
	private WebElement Connectivity;
	@FindBy(xpath="(//div[.='Built-in Wi-Fi'])[2]")
	private WebElement Wifi;
	@FindBy(xpath="(//div[contains(.,'Mi LED')])[8]")
	private WebElement MiLED;

public SelectedTvpage(WebDriver driver)
	{
	super(driver);
	PageFactory.initElements(driver, this);
	}

public void SelectPricedropdown(WebDriver driver)
	{
	Actions ac = new Actions(driver);
	ac.moveToElement(pricedropdown).click();
	Select s = new Select(pricedropdown);
	s.selectByValue("20000");
	}
public void SelectMiBrand()
	{
	Brand.click();
	}
public void selectSmartTV()
	{
	Smarttv.click(); 
	}
public void SelectCustomerRating()
	{
	CustomerRating.click();
	}
public void ClickonResolution()
	{
	Resolution.click();
	}
public void ClickonHDAsResolution()
	{
	HD.click();
	}
public void SelectOperatingSystem()
	{
	OperatingSysetm.click();
	}
public void SelectAndroidAsOperatingSystem()
	{
	Android.click();
	}
public void SelectConnectivityFeatures()
	{
	Connectivity.click();
	}
public void SelectWifi()
	{
	Wifi.click();
	}
public void SelectMiTv()
	{
	MiLED.click();
	}



}
