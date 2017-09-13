package com.cucumber.bhsibase.runner;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		// format = {"pretty","html:target/html/" } ,
		features = "src/test/resources", glue = "com.cucumber.bhsibase.tests")
public class TestRunner extends AbstractTestNGCucumberTests {
}
