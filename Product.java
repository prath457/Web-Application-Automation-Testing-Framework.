package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product {

WebDriver driver;

By addToCart = By.id("add-to-cart-sauce-labs-backpack");
By cartIcon = By.className("shopping_cart_link");

public Product(WebDriver driver) {

this.driver = driver;

}

public void addProductToCart() {

driver.findElement(addToCart).click();

}

public void openCart() {

driver.findElement(cartIcon).click();

}

}
