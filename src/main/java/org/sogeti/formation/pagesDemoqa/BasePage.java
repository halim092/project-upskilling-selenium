package org.sogeti.formation.pagesDemoqa;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver base_page_driver ;

    BasePage(WebDriver driver)
    {
        base_page_driver = driver ;

    }

}
