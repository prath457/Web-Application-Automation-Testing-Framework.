package tests;

import base.Base1;
import pages.Login;
import org.testng.annotations.Test;

public class Logintest extends Base1 {

@Test
public void validLoginTest() throws InterruptedException {

Login login = new Login(driver);

login.enterUsername("standard_user");
login.enterPassword("secret_sauce");
login.clickLogin();
Thread.sleep(8000);

}

}
