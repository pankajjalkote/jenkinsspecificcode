package appfeatures;

import io.cucumber.java.en.When;
import pages.SearchPage;
import qa.DriverFactory;

public class SearchSteps {
	
	SearchPage searchpage = new SearchPage(DriverFactory.getDriver());
	
	@When("User enters productname as {string}")
	public void user_enters_productname_as(String prdname) {
	    searchpage.searchProduct(prdname);
	}

	@When("click on search button")
	public void click_on_search_button() {
	   searchpage.clickOnSearch();
	}

}
