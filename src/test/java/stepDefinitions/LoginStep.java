package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.pojo.LoginPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStep extends BaseClass{
	LoginPOJO l;
	
	
	@Given("User have to lanuch chrome and hit the FB url")
	public void user_have_to_lanuch_chrome_and_hit_the_FB_url() {
	    
		urllink("https://www.facebook.com/");
		
	}
	

	@When("enter the Username and password")
	public void enter_the_Username_and_password() {
		 l=new LoginPOJO();
		 filldata(l.getUsername(), "Mohan");
		 filldata(l.getPassword(), "Mohan@1612");
	}
	
	
	
	
	@When("click the login button")
	public void click_the_login_button() {
	 clickbutton(l.getClickbutton());	
		
	}

	@When("user has to click the forget password link")
	public void user_has_to_click_the_forget_password_link() {
		d.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]")).click();    
	}

	@When("user has to entre the mobileNo")
	public void user_has_to_entre_the_mobileNo() {
		d.findElement(By.id("identify_email")).sendKeys("8838809690");
	   
	}

	@When("click thw search button")
	public void click_thw_search_button() {
	 d.findElement(By.id("did_submit")).click();
	}
	

	



}
