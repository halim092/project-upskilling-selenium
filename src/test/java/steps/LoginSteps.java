package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sogeti.formation.page.LoginPage;

public class LoginSteps {
    LoginPage pageLogin;

    public LoginSteps(StandardSteps std) {

        WebDriver driver = std.getDriver();
        pageLogin = PageFactory.initElements(driver, LoginPage.class);
    }



    @And("j'entre un username {string}")
    public void j_entre_un_username(String string) {
        pageLogin.inputUsername( string);

        }

    @And("j'entre un mot de passe {string}")
    public void j_entre_un_mdp(String string) {
        pageLogin.inputPassword(string);

    }

    @When("je clique sur le bouton login")
    public void je_clique_sur_le_bouton_login() {
      pageLogin.login();
    }


}