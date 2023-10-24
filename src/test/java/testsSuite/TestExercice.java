/* package ffff;

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

public class TestExercice {

    //Les drivers
    private static final String URL ="https://www.saucedemo.com";
    WebDriver driver ;





    //Methode before
    @BeforeMethod
    public void setup (){
        driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println(URL + " -> opened successfully");

    }
    @Test
    public void test(){
        //Arrange
        String user = "standard_user";
        String pwd ="secret_sauce";
        //Act
        //HomePage hp = new HomePage(driver);
        LoginPage lp =new LoginPage(driver);
        CartPage cp =lp.inputUsername(username)
        .inputPassword(pwd)
        .login();

        //hp.addButton();

        //Assertion
        Assert.assertEquals();





    }

    @AfterMethod
    public void teardown(){
        driver.quit();
        System.out.println("Teardown successful !");
    }
} */

