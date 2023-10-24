package org.sogeti.formation.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class CartPage {
    WebDriver driver;
    @FindBy(css = ".title")
    WebElement headerCart ;
    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public String getTitle(){
        log.info("Tittle successfully returned");
        return headerCart.getText();
    }
}