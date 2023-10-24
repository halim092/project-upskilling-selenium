package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sogeti.formation.page.CartPage;
import org.sogeti.formation.page.HomePage;
import org.sogeti.formation.page.LoginPage;

public class CartSteps {

    CartPage cartPage;

    public CartSteps(StandardSteps std) {

        WebDriver driver = std.getDriver();
        cartPage = PageFactory.initElements(driver, CartPage.class);
    }



    @Then("le panier est bien affiché {string}")
    public void lePanierEstBienAffiché(String titreCartAttendu) {
        cartPage.checkPageTitleCart(titreCartAttendu);
    }
}
