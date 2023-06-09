package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	@Before(order = 1)
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
	

	
	@After(order = 2)
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}
	
	
	@Before(order = 2)
	public void beforeHook2()
	{
		System.out.println("Before hook 2 is executing");
	}
	
	@After(order = 1)
	public void afterHook2()
	{
		System.out.println("After hook 2 is executing");
	}
}
