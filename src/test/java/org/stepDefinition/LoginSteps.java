package org.stepDefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.*;

import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass {
	TSLoginPage t;
	TSLoginPage x;
	@Given("I am on the Tesco UK login page")
	public void i_am_on_the_Tesco_UK_login_page() throws InterruptedException {
	}
	@When("I enter my valid username{string} and valid password{string}")
	public void i_enter_my_valid_username_and_valid_password(String email, String pass) {
		t = new TSLoginPage();
		click(t.getHomePageSignBtn());
		click(t.getRejectCookies());
		sendKeys(t.getEmailId(), email);
		sendKeys(t.getPass(), pass);
	}


		@When("I click on the Login{string} button")
		public void i_click_on_the_Login_button(String type) {
		   if(type.equalsIgnoreCase("valid login")) {
			   click(t.getSignInBtn());
		   }
		   else if(type.equalsIgnoreCase("invalid login")) {
			   click(x.getSignInBtn());
		}
	}

	@Then("I should be successfully logged in to my account")
	public void i_should_be_successfully_logged_in_to_my_account() {
	   Assert.assertTrue(true);
	   System.out.println("-----Valid page-----");
	}

	@When("I enter an invalid username{string} and invalid password{string}")
	public void i_enter_an_invalid_username_and_invalid_password(String email, String pass) throws InterruptedException {	
	   x=new TSLoginPage();
	   click(x.getHomePageSignBtn());
	   click(x.getRejectCookies());
	   sendKeys(x.getEmailId(),email);
	   sendKeys(x.getPass(), pass);
	}

	@Then("I should see an error message indicating invalid username or login credentials")
	public void i_should_see_an_error_message_indicating_invalid_username_or_login_credentials() {
	  
	   System.out.println(isDisplayed(x.getErrorMessage()));
	   System.out.println("-----invalid page-----");
	}

}