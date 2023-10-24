package org.sogeti.formation.pagesDemoqa;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log4j2
public class PageWebTables extends BasePage {

    public PageWebTables(WebDriver driver) {
        super(driver);
    }

    By selectionSalary = By.cssSelector("div.rt-th.rt-resizable-header:contains('Salary')");
    By selectionBtnRemoveLastRow = By.id("delete-record-3");

    public void trierSalaireOrdreDecroissant() {
        WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectionSalary));
        WebElement salaryHeader = base_page_driver.findElement(selectionSalary);
        log.info("trier");
        salaryHeader.click();
    }

    public void supprimerDerniereLigne() {
        WebDriverWait wait = new WebDriverWait(base_page_driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(selectionBtnRemoveLastRow));
        WebElement deleteButton = base_page_driver.findElement(selectionBtnRemoveLastRow);
       log.info("supprimé");
        deleteButton.click();
    }
}
