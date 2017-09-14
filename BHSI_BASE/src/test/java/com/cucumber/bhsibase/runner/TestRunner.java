package com.cucumber.bhsibase.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		// format = {"pretty","html:target/html/" } ,
		features = "src/test/resources", glue = "com.cucumber.bhsibase.party.tests")
public class TestRunner extends AbstractTestNGCucumberTests {
}
