package org.example.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By UserNameID= By.id("user-name");
    By PasswordID= By.id("password");
    By LoginID= By.id("login-button");

    public LoginPage inputUsername(String username){
        driver.findElement(UserNameID).sendKeys(username);
        return this;

    }
    public LoginPage inputPassword(String password){
        driver.findElement(PasswordID).sendKeys(password);
        return this;


    }
    public org.example.Page.HomePage login(){
        driver.findElement(LoginID).click();
        return new org.example.Page.HomePage(driver);

    }


}