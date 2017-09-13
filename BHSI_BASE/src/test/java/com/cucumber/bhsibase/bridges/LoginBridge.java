package com.cucumber.bhsibase.bridges;

import com.cucumber.bhsibase.party.pages.LoginPage;

public class LoginBridge  {
	
	public void Given(){
		
		LoginPage login = new LoginPage() ; 
		login.enterunamepwd() ; 
		
	}
	
	public void When(){
		
		LoginPage login = new LoginPage() ; 
		login.clicklogin() ; 
	}
	
	public void Then(){
		
		LoginPage login = new LoginPage() ; 
		login.validatelogin() ; 
		
		
	}

}
