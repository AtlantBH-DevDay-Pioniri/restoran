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

public class addNewRestaurant extends TestBase {

	@Test(priority = 0)
    public void login() {
        new HomePage(driver).clickLoginButton(2);
        new LoginPage(driver).getEmailInputField().sendKeys("admin@example.com");
        new LoginPage(driver).getPasswordInputField().sendKeys("admin");
        new LoginPage(driver).getLoginButton().click();

    }
   
   
   @Test(priority = 20)
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
        driver.findElement(By.cssSelector("#ember36")).click();
        
        try
 	   {
 	       Thread.sleep(1000);
 	   }
 	   catch(InterruptedException ex)
 	   {
 	       Thread.currentThread().interrupt();
 	   }
        
        driver.findElement(By.cssSelector("#ember130")).sendKeys("RestoranTestiranje");
        driver.findElement(By.cssSelector("#ember132")).sendKeys("AdresaUlicaBroj 75");
        driver.findElement(By.cssSelector("#ember135")).sendKeys("0038733111111");
        driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(1) > button:nth-child(2)")).click();
    }

}
