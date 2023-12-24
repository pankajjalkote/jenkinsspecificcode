package appfeatures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import qa.RemoteDriverFactory;
import utility.configreader;

public class AppsHooks {
	WebDriver driver;
	DriverFactory df;
     RemoteDriverFactory rdf;
	@Before
	public void launchBrowser() throws IOException {
		configreader cr = new configreader();
		String browsername = cr.readconfig("browser");

		String maven_browsername = System.getProperty("clibrowser");

		if (maven_browsername != null) {
			browsername = maven_browsername;
		}

	//	df = new DriverFactory();
      rdf = new RemoteDriverFactory();
		driver = rdf.initBrowser(browsername);

		driver.manage().window().maximize();

	}

	@After(order = 2)
	public void tearDown(Scenario scenario) {
		boolean isScenarioFailed = scenario.isFailed();

		if (isScenarioFailed) {
			String scenarioName = scenario.getName();

			String name = scenarioName.replace(" ", "_");

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(source, "image/png", name);
		}
	}

	@After(order = 1)
	public void quitBrowser() {
		driver.quit();
	}

}
