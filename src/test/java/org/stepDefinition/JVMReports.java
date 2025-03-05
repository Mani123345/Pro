package org.stepDefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReports {
	
	public static void generateJvmReports(String json) {
		//File Location
		System.out.println("hi");
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReports");
System.out.println("hi2");
		
		//Set Configuration
		Configuration con = new Configuration(loc, "Tesco");
		con.addClassifications("Tester", "Manikandan");
		con.addClassifications("OS", "Windows");
		con.addClassifications("Sprint", "22");
		con.addClassifications("Testing", "Automation");
		
		//Generate Reports
		List<String> jsonList = new ArrayList<String>();
		jsonList.add(json);
		ReportBuilder r = new ReportBuilder(jsonList, con);
		r.generateReports();
	}

}
