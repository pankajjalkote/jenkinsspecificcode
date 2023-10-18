package appfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\appfeatures\\HomePage.feature"},
		
		glue = {"appfeatures"},
		
		plugin = {"pretty" , 
					"html:target/cucumber-reports/amazonreports.html"
				 },
		tags = "@sanity or @functional"	
		
		
		)




public class AmazonRunnerTest extends AbstractTestNGCucumberTests{

}
