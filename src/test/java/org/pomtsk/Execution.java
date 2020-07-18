package org.pomtsk;

public class Execution extends Utility {

	public static void main(String[] args) throws InterruptedException {
		
		launchApp("http://adactinhotelapp.com/");
		LoginPage lgn = new LoginPage();
		Thread.sleep(3000);
		loginFill(lgn.getUser(),"Pushparaj");
		Thread.sleep(3000);
		loginFill(lgn.getPwd(),"pushparaj007");
		Thread.sleep(3000);
		lgnbtnClic(lgn.getLgnbtn());
		
		SearchHotel sch1 = new SearchHotel();
		drpDown(sch1.getDdloc(), 1);
		drpDown(sch1.getDdhot(), 2);
		drpDown(sch1.getDdroom(), 1);
		drpDown(sch1.getDdroomnos(), 1);
		drpDown(sch1.getDdadltroom(), 2);
		drpDown(sch1.getDdchilroom(), 1);
		lgnbtnClic(sch1.getSchSubBtn1());
		
		SearchHotel2 sch2= new SearchHotel2();
		radBtn(sch2.getRadBtn());
		lgnbtnClic(sch2.getContBtn());
		
		BookHotel bkht = new BookHotel();
		Thread.sleep(3000);
		loginFill(bkht.getFrstName(), "Pushpa");
		Thread.sleep(3000);
		loginFill(bkht.getLstName(), "Raj");
		Thread.sleep(3000);
		loginFill(bkht.getAddrs(), "No.22 Kathirvel st,Kanchipuram");
		loginFill(bkht.getCcnum(), "8798765456789876");
		drpDown(bkht.getCctypeD(), 2);
		drpDown(bkht.getCcexpMonD(), 7);
		drpDown(bkht.getCcexpYerD(), 4);
		loginFill(bkht.getCcCvv(), "777");
		lgnbtnClic(bkht.getBknwBtn());
		Thread.sleep(3000);
		
		
		ConfirmPage fin=new ConfirmPage();
		Thread.sleep(5000);
		webTable(fin.getTabRow());
		
		
		
		
		
		
	}
	
	
}
