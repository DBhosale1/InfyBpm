package com.slel;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtenssRepor {

	
	@Test
	public void logintest() throws IOException{
		ExtentHtmlReporter repo= new ExtentHtmlReporter("./Reportss/learnauto2.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(repo);
		
		ExtentTest logger=extent.createTest("login test ", "enter correct username/pass");
		
		logger.log(Status.INFO, "success login");
		
		logger.log(Status.PASS, "Verfifed");
		
		extent.flush();
		

		ExtentTest logger2=extent.createTest("login test ", "enter correct username/pass");
		
		
		logger2.log(Status.FAIL, "not Verfifed");
		
		logger2.fail("details",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\home\\Desktop\\logo.jpg").build());
		
		//logger2.addScreenCaptureFromPath("C:\\Users\\home\\Desktop\\logo.jpg");
		extent.flush();
		
	}
		
		
	

}
