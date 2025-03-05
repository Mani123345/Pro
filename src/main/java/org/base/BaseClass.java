package org.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
	        driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public static void sendKeys(WebElement webElement,String value) {
	   webElement.sendKeys(value);
	}
	
	public static void click(WebElement webElement) {
		webElement.click();
	}
	
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static void assertTrue(Boolean bool) {
		Assert.assertTrue(bool);
	}
    
	public static Boolean stringContains(String s,String containString) {
		return s.contains(containString);
	}
	
	public static Boolean isDisplayedUsingXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element.isDisplayed();
	}
	
	public static void sleep(int num) throws InterruptedException {
		Thread.sleep(num);
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void doubleClickUsingXpath(String xpath) {
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		a.contextClick(element).perform();
	}
	
	public static void rightClickUsingXpath(String xpath) {
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		a.contextClick(element).perform();
	}
	
	public static void enterUsingXpath(String xpath) {
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		a.keyDown(element,Keys.ENTER).perform();
		a.keyUp(element,Keys.ENTER).perform();
	}
	
	
	public static void getScreenshotAs(WebElement webElement,String filename) throws IOException {
	File src = webElement.getScreenshotAs(OutputType.FILE);
	File dest = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+filename+".png");
	FileUtils.copyFile(src, dest);

	}
	
	public static void webDriverWait(long seconds,WebElement webElement) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	wait.until(ExpectedConditions.visibilityOfElementLocated((By) webElement));
	}
	
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static boolean isDisplayed(WebElement webElement) {
		return webElement.isDisplayed();
	}
 
}
