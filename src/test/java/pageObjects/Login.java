package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver ldriver;
	
	public Login(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@class='email valid']")
	WebElement email_txt;
	
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password_txt;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement login_btn;
	
	
	@FindBy(linkText = "Logout")
	WebElement logout_btn;
	
	
	public void setUserName(String username)
	{
		email_txt.clear();
		email_txt.sendKeys("");
	}
	
	public void setPassword(String password)
	{
		password_txt.clear();
		password_txt.sendKeys("");
	}
	
	public void clickLogin()
	{
		login_btn.click();
	}
	
	public void clickLogout()
	{
		logout_btn.click();
	}
	
	
}
