package stepDefinitions;

import org.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookCalass extends BaseClass{
	@Before
	public  void beforelaunchbrower() {
		lanu();
		d.manage().window().maximize();
		}
	
	@After
	public  void afterexcution() {
//		d.quit();

	}
	
	
	
	
	

}
