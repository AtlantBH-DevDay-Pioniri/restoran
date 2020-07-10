package testoviNedim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.abh_restaurant.*;
import testUtils.TestBase;
import java.util.concurrent.TimeUnit;


import java.text.SimpleDateFormat;
import java.util.Date;

public class locationUpdate extends TestBase {
	
	

	   @Test(priority = 0)
	    public void login() {
	        new HomePage(driver).clickLoginButton(2);
	        new LoginPage(driver).getEmailInputField().sendKeys("admin@example.com");
	        new LoginPage(driver).getPasswordInputField().sendKeys("admin");
	        new LoginPage(driver).getLoginButton().click();
	
	    }
	   
	   
	   
	   @Test(priority = 1)
	    public void editResName() {
		   try
		   {
		       Thread.sleep(1000);
		   }
		   catch(InterruptedException ex)
		   {
		       Thread.currentThread().interrupt();
		   }
	        new HomePage(driver).getAdmin().click();
	        driver.findElement(By.cssSelector("#ember29")).click();
	        
	        WebElement ele = driver.findElement(By.cssSelector("li.admin-form-object-list-item:nth-child(1)"));
	        Actions action = new Actions(driver);
	        action.moveToElement(ele).build().perform();
	        driver.findElement(By.cssSelector("#ember40")).click();
	        try
			   {
			       Thread.sleep(1000);
			   }
			   catch(InterruptedException ex)
			   {
			       Thread.currentThread().interrupt();
			   }
	        
	        driver.findElement(By.cssSelector("#ember134")).clear();
	        driver.findElement(By.cssSelector("#ember134")).sendKeys("Pijacna ulica broj 128....");
	        driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(1) > button:nth-child(2)")).click();
	        
	        
	      
	    }
}

