package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
public static 	WebDriver d;
public static 	 void lanu() {
	WebDriverManager.chromedriver().setup();
	 d=new ChromeDriver();
	}

public static void urllink(String url) {
	d.get(url);

}
 public static  void filldata(WebElement e,String value) {
	e.sendKeys(value);

}

public  static  void clickbutton(WebElement e) {
	e.click();

}







}
