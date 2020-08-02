package demo.spring.selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    glue = "demo/spring/selenium/stepdefinitions",
    features = "src/test/resources/features")
public class CucumberRunner extends AbstractTestNGCucumberTests {

}

