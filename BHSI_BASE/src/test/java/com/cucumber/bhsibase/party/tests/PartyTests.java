package com.cucumber.bhsibase.party.tests;

import com.cucumber.bhsibase.bridges.LoginBridge;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PartyTests {
	
	@Given("^Enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void enter_the_username_and_password(String username, String pwd) throws Throwable {
	   
		LoginBridge login = new LoginBridge() ; 
		login.Given();
		
	}

	@When("^I click on login$")
	public void i_click_on_login() throws Throwable {
	   
		LoginBridge login = new LoginBridge() ; 
		login.When() ; 
	}

	@Then("^I enter the homepage$")
	public void i_enter_the_homepage() throws Throwable {
	 
		LoginBridge login = new LoginBridge() ; 
		login.Then();
	}



}
