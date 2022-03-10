package MunchEm;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import storage.Objectmap;

public class OrderEmLogin {
       @SuppressWarnings("deprecation")
	public static void main(String []args) throws Exception
       {
    	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Framework\\drivers\\chromedriver.exe");
    	   WebDriver driver= new ChromeDriver();
    	   File file = new File("D:\\Selenium\\Framework\\config.properties");
    	   FileInputStream fileInput = new FileInputStream(file);
    	   Properties prop= new Properties();
    	   prop.load(fileInput);
    	   Objectmap mapping=new Objectmap(driver);
    	  
    	   driver.get(prop.getProperty("URL"));
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	   mapping.clickLogin();
    	   mapping.enteruserid(prop.getProperty("username"));
    	   mapping.enterpwd(prop.getProperty("password"));
    	   mapping.clicksignin();
    	   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	   driver.quit();
    	   
       }
}
