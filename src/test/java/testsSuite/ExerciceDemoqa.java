package testsSuite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.sogeti.formation.pagesDemoqa.HomePageDemoqa;
import org.sogeti.formation.pagesDemoqa.PageElements;
import org.sogeti.formation.pagesDemoqa.PageWebTables;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ExerciceDemoqa {
    // Les drivers
    private static final String URL = "https://demoqa.com/";
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println(URL + " -> opened successfully");
    }

    @Test
    public void executeTest() {
        // Arrange
        // (Arrange your test data and objects here)

        // Act
        HomePageDemoqa hpd = new HomePageDemoqa(driver);
        hpd.scroll_downElements(driver);
        hpd.clickElements();
        PageElements pe = new PageElements(driver);
        pe.clickWebTables();
        PageWebTables pwt = new PageWebTables(driver);
        pwt.trierSalaireOrdreDecroissant();
        pwt.supprimerDerniereLigne();

        // Assertion
        //  Vérifiez d'être sur la page Element
        WebElement pageTitle = driver.findElement(By.xpath("//div[@class='main-header']"));
        Assert.assertEquals(pageTitle.getText(), "Elements");
        //  Vérifiez que la suppression s'est bien faite
        WebElement lastRow = driver.findElement(By.xpath("//div[@class='rt-tr-group'][last()]"));
        Assert.assertFalse(lastRow.isDisplayed(), "La dernière ligne n'a pas été supprimée.");
    }
}


