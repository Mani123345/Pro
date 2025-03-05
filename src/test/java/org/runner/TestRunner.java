package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepDefinition.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Registration.feature",
glue = "org.stepDefinition",
dryRun = true,
plugin ={"pretty",
"json:src\\test\\resources\\Reports\\JsonReports.json"})
public class TestRunner extends JVMReports {
	
	@AfterClass
	public static void afterClass() {
		JVMReports.generateJvmReports("src\\test\\resources\\Reports\\JsonReports.json");
		System.out.println("-----done-----");

	}

}
