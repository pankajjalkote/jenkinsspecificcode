package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationtest\\login.feature"},
		
		glue = {"steps"}
		
		
		)





public class LoginRunner {

}
