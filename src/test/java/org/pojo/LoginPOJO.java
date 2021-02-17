package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOJO extends BaseClass{
	
	public LoginPOJO() {
		PageFactory.initElements(d,this);
	}
	
	
	


	//------------------------------------------------
	@FindBy(id="email")
private	 WebElement username;
	
	
	@FindBy(id="pass")
	private WebElement password;
@FindBy(name="login")
private WebElement clickbutton;






public WebElement getUsername() {
	return username;
}
public void setUsername(WebElement username) {
	this.username = username;
}
public WebElement getPassword() {
	return password;
}
public void setPassword(WebElement password) {
	this.password = password;
}
public WebElement getClickbutton() {
	return clickbutton;
}
public void setClickbutton(WebElement clickbutton) {
	this.clickbutton = clickbutton;
}



	
	
	
	

}
