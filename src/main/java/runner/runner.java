package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "/Users/rambabuyadav07/Cucumber/PBL_BDD_2/src/main/java/M1/part1.feature",
	glue = {"Bindings"},
//	tags = "@ABC",
	monochrome = true,
	plugin = {"pretty","html:target/cucumber-targets"}
)


public class runner extends AbstractTestNGCucumberTests{
	
	
}

