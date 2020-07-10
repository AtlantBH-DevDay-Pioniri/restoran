package testoviNedim;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.abh_restaurant.*;
import testUtils.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class bookRestaurant extends TestBase {

    @Test(priority = 0)
    public void openPage() {
        new HomePage(driver).openRestaurantsPage(1);
    }
    
    @Test(priority = 1)
    public void openRestaurant() {
        new Restaurants(driver).getFirstRest().click();
    }
    
    @Test(priority = 2)
    public void openCalendar() {
    	new RestaurantDetails(driver).getSelectDate().sendKeys("2020-10-10");
    	new RestaurantDetails(driver).getPickTime().sendKeys("17:00:00");
    	new RestaurantDetails(driver).getFindTable().click();
    }
    
}
