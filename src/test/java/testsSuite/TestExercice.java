package testsSuite;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sogeti.formation.page.CartPage;
import org.sogeti.formation.page.HomePage;
import org.sogeti.formation.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
@Getter
@Log4j2
public class TestExercice {

    WebDriver driver;

    private void init() {
        //System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Given("je vais sur la page d'acceuil {string}")
    public void je_vais_sur_la_page_d_acceuil(String string) {
        init();
        driver.get(string);
    }

    @After
    public void Teardown() {
        log.info("Test terminé");
        driver.quit();
    }
}