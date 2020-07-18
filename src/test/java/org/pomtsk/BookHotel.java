package org.pomtsk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends Utility {

	public BookHotel() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement frstName;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lstName;
	@FindBy(id="address")
	private WebElement addrs;
	@FindBy(id="cc_num")
	private WebElement ccnum ;
	@FindBy(xpath="//select[@class='select_combobox']")
	private WebElement cctypeD;
	@FindBy(id="cc_exp_month")
	private WebElement ccexpMonD ;
	@FindBy(id="cc_exp_year")
	private WebElement ccexpYerD ;
	@FindBy(id="cc_cvv")
	private WebElement ccCvv ;
	@FindBy(id="book_now")
	private WebElement bknwBtn;
	public WebElement getFrstName() {
		return frstName;
	}
	public WebElement getLstName() {
		return lstName;
	}
	public WebElement getAddrs() {
		return addrs;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctypeD() {
		return cctypeD;
	}
	public WebElement getCcexpMonD() {
		return ccexpMonD;
	}
	public WebElement getCcexpYerD() {
		return ccexpYerD;
	}
	public WebElement getCcCvv() {
		return ccCvv;
	}
	public WebElement getBknwBtn() {
		return bknwBtn;
	}
	
	
}
