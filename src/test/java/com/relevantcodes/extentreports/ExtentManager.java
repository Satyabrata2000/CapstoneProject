package com.relevantcodes.extentreports;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
    public static final ExtentReports extentReports = new ExtentReports();
    public synchronized static ExtentReports createExtentReports() {
    	
        ExtentSparkReporter reporter = new ExtentSparkReporter("C:\\Program Files (J)\\CapstoneProject\\ExtentReport\\extent-report.html");
        //reporter.config().setReportName("Extent Report");
        extentReports.attachReporter(reporter);
        return extentReports;
    }
}