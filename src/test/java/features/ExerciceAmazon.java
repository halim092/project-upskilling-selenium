/* package features;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ExerciceAmazon {


    public static final long WAIT_DURATION = 10;


    @Test
    public void ajouterPanierAmazon() {

        // 1.	aller sur la page https://www.amazon.fr/

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.fr/");

        //2.	accepter les cookies

        By acceptCookies = By.id("sp-cc-accept");
        WebElement buttonAcceptCookies = driver.findElement(acceptCookies);
        buttonAcceptCookies.click();

        //3.	écrire "iphone 14 vert" dans le champs de recherche

        By BarreRecherche = By.id("twotabsearchtextbox");
        WebElement WebElementBarreRecherche = driver.findElement(BarreRecherche);
        WebElementBarreRecherche.sendKeys("iphone 14 vert");

        //4.	valider avec le bouton loupe
         By clickLoupe = By.id("nav-search-submit-button");
         WebElement ClickSearchLoupe = driver.findElement(clickLoupe);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DURATION));

        ClickSearchLoupe.click();

        //5.	cliquer sur le premier résultat de recherche

        By premierArticle = By.cssSelector("div.s-main-slot div.s-result-item:nth-child(1)");
        // By premierArticle = By.cssSelector("div.s-result-list>div[data-component-type=\"s-search-result\"]");
        WebElement clickPremierArticle = driver.findElement(premierArticle);
        clickPremierArticle.click();

        //6.	l'ajouter dans le panier

        By ajouterArticle = By.id("add-to-cart-button");
        WebElement clickAjouterArticle = driver.findElement(ajouterArticle);
        clickAjouterArticle.click();

        //7.	aller dans le panier

        By allerPanier = By.className("a-button-text");
        WebElement clickAllerPanier = driver.findElement(allerPanier);
        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DURATION));

        clickAllerPanier.click();








    }
} */
