package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sogeti.formation.page.HomePage;
import org.sogeti.formation.page.LoginPage;

public class HomeSteps {
    HomePage pageHome;

    public HomeSteps(StandardSteps std) {

        WebDriver driver = std.getDriver();
        pageHome = PageFactory.initElements(driver, HomePage.class);
    }

    @When("j'ajouter le sac a dos dans le panier")
    public void jAjouterLeSacADosDansLePanier() {
        pageHome.addTocart();
    }

    @And("j'ouvre le panier")
    public void jOuvreLePanier() {
        pageHome.goTocart();
    }
    @Then("la page des articles est affichée {string}")
    public void laPageDesArticlesEstAffichée(String titreAttendu) {
        pageHome.checkPageTitle(titreAttendu);

    }


}
