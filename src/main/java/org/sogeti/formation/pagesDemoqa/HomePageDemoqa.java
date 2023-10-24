package org.sogeti.formation.pagesDemoqa;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class HomePageDemoqa extends BasePage {

    public HomePageDemoqa(WebDriver driver) {
        super(driver);
    }

    By selectionElements = By.cssSelector("M16 132h416c8.837 0 16-7.163 16-16V76c0-8.837-7.163-16-16-16H16C7.163 60 0 67.163 0 76v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16z")
          ;

    public  void scroll_downElements(WebDriver base_page_driver){
        JavascriptExecutor java =(JavascriptExecutor)base_page_driver;
        java.executeScript("scroll(0,250)");
    }
    public void clickElements() {
        WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectionElements));

        base_page_driver.findElement(selectionElements).click();
        log.info("entrer sur Elements avec succés ");
    }
}
