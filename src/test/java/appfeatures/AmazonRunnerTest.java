package appfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\appfeatures"},
		
		glue = {"appfeatures"},
		
		plugin = {"pretty"}
		
		)


public class AmazonRunnerTest extends AbstractTestNGCucumberTests{

}
