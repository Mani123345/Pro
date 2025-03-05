package org.stepDefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario() {
		browserLaunch("chrome");
		urlLaunch("https://www.tesco.com/");	
	}
	
	@After
	public void afterScenario() {
		quit();

	}
}
