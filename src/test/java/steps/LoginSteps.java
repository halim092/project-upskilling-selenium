package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginSteps {
    org.example.Page.LoginPage pageLogin;

    public LoginSteps(StandardSteps std) {

        WebDriver driver = std.getDriver();
        pageLogin = PageFactory.initElements(driver , org.example.Page.LoginPage.class);
    }
    @Given("je vais sur la page d'accueil {string}")
    public void jeVaisSurLaPageAccueil(String url){

    }
}
