package testoviNedim;

import testUtils.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.abh_restaurant.*;
import testUtils.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class emailNegativeTesting extends TestBase {

    private static final String FIRST_NAME = "Nedim";
    private static final String LAST_NAME = "Sahinpasic";
    private static final String EMAIL = "nedimsahinpasicgmail.com";
    private static final String PHONE_NUMBER = "12345";
    private static final String ADDRESS = "Pijacna 118";
    private static final String PASSWORD = "1234";

    @Test(priority = 0)
    public void openRestaurantsHomePage() {
        new HomePage(driver)
                .clickLoginButton(2);
    }

    @Test(priority = 1)
    public void openRegistrationPage() {
        new LoginPage(driver)
                .clickRegisterButton();
    }

    @Test(priority = 2)
    public void populateRegistrationForm() {
    
        new Registration(driver)
                .makeRegistration(FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, ADDRESS, PASSWORD, PASSWORD);
    }

}



