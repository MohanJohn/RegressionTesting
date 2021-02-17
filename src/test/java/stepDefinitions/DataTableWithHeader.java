package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class DataTableWithHeader {
	WebDriver driver;
	@Given("user in Hostel Login page")
	public void user_in_Hostel_Login_page() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://adactinhotelapp.com/");
		
	}

	@When("user enter valid cendentials")
	public void user_enter_valid_cendentials(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<Map<String,String>>loingvalues= dataTable.asMaps(String.class,String.class);
		String username=loingvalues.get(0).get("UserName");
		String password=loingvalues.get(0).get("Password");
		 driver.findElement(By.id("username")).sendKeys(username);
		  driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@And("click login button")
	public void click_login_button() {
		driver.findElement(By.id("login")).click();
	}



}
