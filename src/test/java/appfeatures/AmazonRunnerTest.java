package appfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"classpath:appfeatures"},
		
		glue = {"appfeatures"},
		
		plugin = {"pretty" , 
					"html:target/cucumber-reports/amazonreports.html",
					"json:target/cucumber-reports.json",
					"rerun:target/failedrun.txt"
				 },
		tags = "@sanity or @functional"	
		
		
		)




public class AmazonRunnerTest extends AbstractTestNGCucumberTests{

}
