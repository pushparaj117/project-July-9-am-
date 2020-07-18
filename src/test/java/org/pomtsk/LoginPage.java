package org.pomtsk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy (xpath="//input[@name='username']")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(className="login_button")
	private WebElement lgnbtn;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	

}
