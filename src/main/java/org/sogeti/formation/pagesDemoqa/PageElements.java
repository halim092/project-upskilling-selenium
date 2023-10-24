package org.sogeti.formation.pagesDemoqa;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
@Log4j2
public class PageElements extends BasePage {

    public PageElements(WebDriver driver) {
        super(driver);
    }

    By selectionWebTables = By.cssSelector("<span class=\"text\">Web Tables</span>");

    public void clickWebTables() {
        WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectionWebTables));
        base_page_driver.findElement(selectionWebTables).click();
        log.info("web table selectionnée avec succés");
    }
}
