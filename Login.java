package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

WebDriver driver;

By username = By.id("user-name");
By password = By.id("password");
By loginButton = By.id("login-button");

public Login(WebDriver driver) {

this.driver = driver;

}

public void enterUsername(String user) {

driver.findElement(username).sendKeys(user);

}

public void enterPassword(String pass) {

driver.findElement(password).sendKeys(pass);

}

public void clickLogin() {

driver.findElement(loginButton).click();

}

}
