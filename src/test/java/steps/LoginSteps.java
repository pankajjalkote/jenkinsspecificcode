package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("user is at the login screen")
	public void preconditions()
	{
		System.out.println("Preconditions for Given statement");
	}

	
	@When("user enters username")
	public void enteringUsername()
	{
		System.out.println("Entering username");
	}
	
	@When("user enters password")
	public void enteringPassword()
	{
		System.out.println("Entering password");
	}
	
	@When("user clicks on login button")
	public void clickOnLogin()
	{
		System.out.println("Cliking on login");
	}
	
	
	@Then("User should get logged in")
	public void validateLogin()
	{
		System.out.println("User has been logged in");
	}
	
}
