package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WDFunctions {
	
	public static WebDriver driver;
	
	public void typeByXpath (String loctors,String values){
		driver.findElement(By.xpath(loctors)).sendKeys(va);
		
	};
    public void typeByname (String loctors,String values){
		
	};
 
    public void typeById (String loctors,String values){
    	
    };

}
