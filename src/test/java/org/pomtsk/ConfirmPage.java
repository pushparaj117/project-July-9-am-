package org.pomtsk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage extends Utility {

	public ConfirmPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getTabRow() {
		return tabRow;
	}

	@FindBy(xpath="(//table[@width='100%'])[4]")
	private WebElement tabRow;

	
	
}
