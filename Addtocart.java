package tests;

import base.Base1;
import pages.Login;
import pages.Product;
import org.testng.annotations.Test;

public class Addtocart extends Base1 {

@Test
public void addProductTest() {

Login login = new Login(driver);

login.enterUsername("standard_user");
login.enterPassword("secret_sauce");
login.clickLogin();

Product product = new Product(driver);

product.addProductToCart();
product.openCart();

}

}
