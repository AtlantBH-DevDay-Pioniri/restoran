package testoviNedim;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.abh_restaurant.*;
import testUtils.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 extends TestBase {
	
	private static final String searchTypeIn = "Mostar";

    @Test(priority = 0)
    public void typeInSearch() {
        new HomePage(driver).getSearchBox().sendKeys(searchTypeIn);
        new HomePage(driver).getSearchButton().click();
    }
}
