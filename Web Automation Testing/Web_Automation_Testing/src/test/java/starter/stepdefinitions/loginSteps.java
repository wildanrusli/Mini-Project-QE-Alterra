package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginPage;
import starter.pages.productPage;

public class loginSteps {
    @Steps
    loginPage loginpage;
    productPage productpage;

    @Given("user on product page")
    public void userOnProductPage() {
        productpage.open();
        productpage.onProductPage();
    }

    @And("user click logout button")
    public void userClickLogoutButton() {
        productpage.clickLogoutButton();
    }

    @And("user on login page")
    public void userOnLoginPage() {
        loginpage.onLoginPage();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginpage.inputValidEmail("wildanrusli19@gmail.com");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginpage.inputValidPassword("12345678");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginpage.clickLoginButton();
    }

    @Then("user on product page successfully")
    public void userOnProductPageSuccessfully() {
        productpage.onProductPageSuccessfully();
    }


    @And("user input empty password")
    public void userInputEmptyPassword() {
        loginpage.inputEmptyPassword("");
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String arg0) {
        loginpage.seeErrorMessagePasswordIsRequired();
    }

    @When("user input empty email")
    public void userInputEmptyEmail() {
        loginpage.inputEmptyEmail("");
    }

    @Then("user view error message {string}")
    public void userViewErrorMessage(String arg0) {
        loginpage.viewErrorMessageEmailIsRequired();
    }

    @When("user input invalid email")
    public void userInputInvalidEmail() {
        loginpage.inputInvalidEmail("wildanrusli10@gmail.com");
    }

    @Then("user can see error message {string}")
    public void userCanSeeErrorMessage(String arg0) {
        loginpage.canSeeErrorMessageNotFound();
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        loginpage.inputInvalidPassword("01010101");
    }

    @Then("user can view error message {string}")
    public void userCanViewErrorMessage(String arg0) {
        loginpage.canViewErrorMessageInvalid();
    }
}
