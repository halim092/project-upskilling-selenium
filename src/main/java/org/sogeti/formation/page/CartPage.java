package org.sogeti.formation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    //Les 3 BY
    // Les 3 webElements
    // Les methodes
    WebDriver driver;
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    By showCart = By.id("shopping_cart_container");
/*
    Public  String void getTitle() {

         driver.findElement(showCart).getText();

    } */
}
