package org.pomtsk;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel2 extends Utility {

	public SearchHotel2() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radBtn;
	@FindBy(id="continue")
	private WebElement contBtn;
	public WebElement getRadBtn() {
		return radBtn;
	}
	public WebElement getContBtn() {
		return contBtn;
	}
}
