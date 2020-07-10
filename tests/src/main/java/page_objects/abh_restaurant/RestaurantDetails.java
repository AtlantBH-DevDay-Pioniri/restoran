package page_objects.abh_restaurant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import page_objects.PageBase;

public class RestaurantDetails extends PageBase {
	final static private String PAGE_URL_REGEX = "\\/restaurant\\d*";
	
    public RestaurantDetails(WebDriver driver) {
        super(driver, PAGE_URL_REGEX);
        initElements();
    }
    
    @FindBy(css = "#ember91")
    private WebElement selectDate;
    
    public WebElement getSelectDate(){
    	return selectDate;
    }
    
    @FindBy(css = "#ember92")
    private WebElement pickTime;
    
    public WebElement getPickTime() {
    	return pickTime;
    }
    
    @FindBy(xpath = "//*[@id=\"reservation\"]/form/button")
    private WebElement findTable;
    
    public WebElement getFindTable() {
    	return findTable;
    }
}

    