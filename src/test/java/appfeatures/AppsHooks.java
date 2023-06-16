package appfeatures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppsHooks {
	WebDriver driver;
	DriverFactory df;
	@Before
	public void launchBrowser() throws IOException {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "//src//test//resources//config.properties";

		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		
		df = new DriverFactory();

		driver = df.initBrowser(browsername);
		
		driver.manage().window().maximize();

	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
