package com.merit.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(features = "C:\\Users\\Manoj\\git\\MeritGiftShop\\Merit\\src\\test\\java\\com\\merit\\features\\Orders.feature", 
glue = {"com.merit.stepDefinition"}, plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html","html:test-outout","rerun:target/rerun.txt"}, 
monochrome = true,dryRun = false
		)
public class Merit_Runner {
	TestNGCucumberRunner tcr;

	@BeforeClass(alwaysRun = true)
	public void sample() throws Exception
	{
		tcr = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void sample2(CucumberFeatureWrapper feature)
	{
		tcr.runCucumber(feature.getCucumberFeature());
	}

	@DataProvider 
	public Object[][] features()
	{
		return tcr.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void downClass() throws Exception
	{
		tcr.finish();
	}


}
