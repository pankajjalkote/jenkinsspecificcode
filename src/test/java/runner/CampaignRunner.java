package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		features = {"src\\test\\resources\\applicationtest\\CampaignStatus.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty"},
		
		tags = "@sanity"
		
		
		
		
		)

public class CampaignRunner extends AbstractTestNGCucumberTests{

}
