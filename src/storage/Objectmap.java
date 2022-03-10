package storage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Objectmap {
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Objectmap(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locator for login button
	By LoginBtn = By.xpath("//li[@id=\"lblsignin\"]");
	By userid= By.xpath("//input[@id=\"ContentPlaceHolder1_txtEmail\"]");
	By pwd= By.xpath("//input[@id=\"txtPwd\"]");
	By signin=By.xpath("//input[@id=\"ContentPlaceHolder1_imgbtnSignIn\"]");
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(LoginBtn).click();
	}
    public void enteruserid(String user)
    {
    	driver.findElement(userid).sendKeys(user);
    }
    public void enterpwd(String pass)
    {
    	driver.findElement(pwd).sendKeys(pass);
    }
    public void clicksignin()
    {
    	driver.findElement(signin).click();
    }
}
