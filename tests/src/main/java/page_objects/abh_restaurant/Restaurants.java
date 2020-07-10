package page_objects.abh_restaurant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page_objects.PageBase;

public class Restaurants extends PageBase {
    final static private String PAGE_URL_REGEX = "\\/restaurants\\d*";


    public Restaurants(WebDriver driver) {
        super(driver, PAGE_URL_REGEX);
        initElements();
    }
    
    @FindBy(css = "#ember29 > h3:nth-child(2)")
    private WebElement firstRestaurant;
    
    public WebElement getFirstRest(){
    	return firstRestaurant;
    }
    
}
