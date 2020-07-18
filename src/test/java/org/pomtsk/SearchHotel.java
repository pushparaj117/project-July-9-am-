package org.pomtsk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Utility {
	
	public SearchHotel() {
		
		PageFactory.initElements(driver, this);
	}
		@FindBy (id="location")
		private WebElement ddloc;
		@FindBy (id="hotels")
		private WebElement ddhot;
		@FindBy (id="room_type")
		private WebElement ddroom;
		@FindBy (id="room_nos")
		private WebElement ddroomnos;
		@FindBy (id="adult_room")
		private WebElement ddadltroom;
		@FindBy (id="child_room")
		private WebElement ddchilroom;
		@FindBy(id="Submit")
		private WebElement schSubBtn1;
		public WebElement getSchSubBtn1() {
			return schSubBtn1;
		}
		public WebElement getDdloc() {
			return ddloc;
		}
		public WebElement getDdhot() {
			return ddhot;
		}
		public WebElement getDdroom() {
			return ddroom;
		}
		public WebElement getDdroomnos() {
			return ddroomnos;
		}
		public WebElement getDdadltroom() {
			return ddadltroom;
		}
		public WebElement getDdchilroom() {
			return ddchilroom;
		}
		
		
	

}
