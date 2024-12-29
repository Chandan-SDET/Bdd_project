package com.bddproject.steps;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",  // Path to the feature files
        glue = "com.bddproject.steps",  // Path to the step definitions
        monochrome = true,  // Make console output readable
        plugin = {"pretty", "html:target/cucumber-report.html"}  // Generate reports
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
