package testsSuite;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestAmazon {

    @Test
    public void TestNavBarClick(){
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.fr/");

        By navcartID = By.id("nav-cart");
        By acceptCookies = By.cssSelector("sp-cc-accept");
       // By navcartXPath=By.xpath("https://www.amazon.fr/gp/cart/view.html?ref_=nav_cart");
        WebElement buttonAcceptCookies = driver.findElement(acceptCookies);

        WebElement buttonCart= driver.findElement(navcartID);
        buttonCart.click();
        WebDriverWait wait1 = new WebDriverWait(driver ,Duration.ofSeconds(10));
        try {
            wait1.wait(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();


    }

    @Test
    public void testClickBestSeller(){

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.fr/");

        /* 1. Clique sur accepter cookies */

        By acceptCookies = By.id("sp-cc-accept");
        WebElement buttonAcceptCookies = driver.findElement(acceptCookies);
        buttonAcceptCookies.click();

        /* * 2. Clique sur le menu burger qui s'appelle "Toutes" */

        By listToutes = By.id("nav-hamburger-menu");

        WebElement ButtonListToutes = driver.findElement(listToutes);
        ButtonListToutes.click();

        /* 3. Clique sur Meilleurs vente */

        By meilleursVente = By.cssSelector("li a[href*=\"bestsellers\"]");
        WebDriverWait wait1 = new WebDriverWait(driver , Duration.ofSeconds(10));

        WebElement buttonMeilleursVente = wait1.until(ExpectedConditions.visibilityOfElementLocated(meilleursVente));

        buttonMeilleursVente.click();

        /* 4. Attendre l'affichage de l'écran des meilleurs vente (sans sleep)        */

        driver.quit();


    }
    @Test
    public void panierSauceDemo(){
        //* Selecteur à chercher sur le site : https://www.saucedemo.com
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");

        //* 0. champs User (sans id)


        By champsUser = By.name("user-name");
        WebElement webElement1 = driver.findElement(champsUser);
        webElement1.sendKeys( "standard_user");
        //* 0. champs passWord (sans id)
        By champsPswd = By.name("password");
        WebElement webElement2 = driver.findElement(champsPswd);
        webElement2.sendKeys( "secret_sauce");
        // button Login
        By login = By.id("login-button");
        WebElement webElement3= driver.findElement(login);
        WebDriverWait wait1 = new WebDriverWait(driver , Duration.ofSeconds(5));
        webElement3.click();
        //Ajouter 3 élements dans le panier -> bouton "Remove" du 2eme élément dans le panier
       By descriptionProduit =By.className("inventory_item_description");
        System.out.println(descriptionProduit);
        By premierProduit = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
        WebElement webElementPremierProduit = driver.findElement(premierProduit);
        WebDriverWait wait2 = new WebDriverWait(driver , Duration.ofSeconds(5));

        webElementPremierProduit.click();

        By deuxiemeProduit = By.id("add-to-cart-sauce-labs-fleece-jacket");
        WebElement webElementDeuxiemeProduit = driver.findElement(deuxiemeProduit);
        WebDriverWait wait3= new WebDriverWait(driver , Duration.ofSeconds(5));

        webElementDeuxiemeProduit.click();

        By troixiemeProduit = By.id("add-to-cart-sauce-labs-onesie");
        WebElement webElementTroixiemeProduit = driver.findElement(troixiemeProduit);
        WebDriverWait wait4 = new WebDriverWait(driver , Duration.ofSeconds(5));

        webElementTroixiemeProduit.click();

        By panier = By.className("shopping_cart_badge");
        WebElement webElementPanier = driver.findElement(panier);
        WebDriverWait wait5 = new WebDriverWait(driver , Duration.ofSeconds(10));
        webElementPanier.click();

        By removeDeuxiemeArticle = By.id("remove-sauce-labs-fleece-jacket");
        WebElement webElementremoveDeuxiemeArticle = driver.findElement(removeDeuxiemeArticle);
        WebDriverWait wait6 = new WebDriverWait(driver , Duration.ofSeconds(15));

        webElementremoveDeuxiemeArticle.click();







    }
    /*


     * 1. Bouton Filtres "Name (A to Z)
     * 2. Texte du tshirt "Bolt T-Shirt"
     * 3. Déroulez menu burger
     * 4. Menu burger : bouton all items
     * 5. Menu burger : bouton logout
     * 6. Ajouter 3 élements dans le panier -> bouton "Remove" du 2eme élément dans le panier
     */
}
