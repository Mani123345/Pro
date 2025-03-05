package org.pages;

import javax.xml.xpath.XPath;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TSLoginPage extends BaseClass {
	public TSLoginPage() {
		PageFactory.initElements(driver,this);
	}

	@FindAll({@FindBy(id = "email"),@FindBy(xpath = "//input[contains(@type,'email')]")})
	private WebElement emailId;
	
	@FindAll({@FindBy(id = "password"),@FindBy(xpath = "//input[contains(@type,'password')]")})
    private WebElement pass;
	
	@FindAll({@FindBy(id = "rememberMe"),@FindBy(xpath = "//input[contains(@type,'checkbox')]")})
	private WebElement keepMeSignIn;
	
	@FindAll({@FindBy(id = "signin-button"),@FindBy(xpath = "(//button[@type='submit'])[1]")})
	private WebElement signInBtn;
	
	@FindAll({@FindBy(xpath = "(//button[@type='submit'])[2]"),@FindBy(xpath = "(//button[@aria-disabled='false'])[2]")})
	private WebElement acceptCookies;
	
	@FindAll({@FindBy(xpath = "(//button[@aria-disabled='false'])[3]"),@FindBy(xpath ="(//button[@type='submit'])[3]")})
	private WebElement rejectCookies;
	
	@FindAll({@FindBy(xpath = "(//button[@aria-disabled='false'])[1]"),@FindBy(xpath = "//button[@aria-controls='password']")})
	private WebElement show;
	
	@FindBy(xpath = "//a[@class='styled__Anchor-sc-10ozqhd-0 iEdeDv ddsweb-link__anchor']")
	private WebElement register;
	
	@FindBy(xpath = "(//div[@class='base-components__RootElement-sc-150pv2j-1 fJKEqv ddsweb-footer__link-list-item'])[1]")
	private WebElement termsAndConditions;
	
	@FindBy(xpath = "(//div[@class='base-components__RootElement-sc-150pv2j-1 fJKEqv ddsweb-footer__link-list-item'])[2]")
	private WebElement privacyAndCookiePolicy;
	
	@FindBy(xpath  = "(//div[@class='base-components__RootElement-sc-150pv2j-1 fJKEqv ddsweb-footer__link-list-item'])[3]")
	private WebElement privacyCenter;
	
	@FindBy(xpath = "//span[contains(text(),'Back to Tesco.com')]")
	private WebElement backToTesco;
	
	@FindBy(xpath = "//span[contains(text(),'I')]")
	private WebElement forgetPassword;
	
	@FindBy(xpath = "//a[@data-testid='sign-in']")
	private WebElement homePageSignBtn;
	
	@FindBy(id = "email-error")
	private WebElement errorMessage;

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getHomePageSignBtn() {
		return homePageSignBtn;
	}

	public WebElement getForgetPassword() {
		return forgetPassword;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getKeepMeSignIn() {
		return keepMeSignIn;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getAcceptCookies() {
		return acceptCookies;
	}

	public WebElement getRejectCookies() {
		return rejectCookies;
	}

	public WebElement getShow() {
		return show;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getTermsAndConditions() {
		return termsAndConditions;
	}

	public WebElement getPrivacyAndCookiePolicy() {
		return privacyAndCookiePolicy;
	}

	public WebElement getPrivacyCenter() {
		return privacyCenter;
	}

	public WebElement getBackToTesco() {
		return backToTesco;
	}
}
