package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.cartPage;
import starter.pages.loginPage;
import starter.pages.productPage;

public class productSteps {
    @Steps
    loginPage loginpage;
    productPage productpage;
    cartPage cartpage;

    @Given("user are login")
    public void userAreLogin() {
        productpage.open();
        productpage.onProductPage();
        productpage.clickLogoutButton();
        loginpage.onLoginPage();
        loginpage.inputValidEmail("wildanrusli19@gmail.com");
        loginpage.inputValidPassword("12345678");
        loginpage.clickLoginButton();
        productpage.onProductPage();
    }

    @When("user click detail button")
    public void userClickDetailButton() {
        productpage.clickDetailProductButton();
    }

    @Then("user see detail product successfully")
    public void userSeeDetailProductSuccessfully() {
        productpage.seeDetailProduct();
    }

    @When("user click beli button")
    public void userClickBeliButton() {
        productpage.clickBeliButton();
    }

    @Then("user see product in cart")
    public void userSeeProductInCart() {
        cartpage.seeProductInCart();
    }

    @And("user click cart button")
    public void userClickCartButton() {
        cartpage.clickCartButton();
    }
}
