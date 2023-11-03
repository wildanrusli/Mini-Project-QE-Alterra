package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.loginPage;
import starter.pages.productPage;
import starter.pages.registerPage;

public class registerSteps {
    @Steps
    loginPage loginpage;
    registerPage registerpage;

    @And("user click register link")
    public void userClickRegisterLink() {
        loginpage.clickRegisterLink();
    }

    @And("user on register page")
    public void userOnRegisterPage() {
        registerpage.onRegisterPage();
    }

    @When("user input valid fullname for register")
    public void userInputValidFullnameForRegister() {
        registerpage.inputValidFullnameForRegister("wildan");
    }

    @And("user input valid email for register")
    public void userInputValidEmailForRegister() {
        registerpage.inputValidEmailForRegister();
    }

    @And("user input valid password for register")
    public void userInputValidPasswordForRegister() {
        registerpage.inputValidPasswordForRegister("12345678");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerpage.clickRegisterButton();
    }

    @Then("user on login page successfully")
    public void userOnLoginPageSuccessfully() {
        loginpage.onLoginPageSuccessfully();
    }

    @When("user input empty fullname for register")
    public void userInputEmptyFullnameForRegister() {
        registerpage.inputEmptyFullnameForRegister("");
    }

    @And("user input empty email for register")
    public void userInputEmptyEmailForRegister() {
        registerpage.inputEmptyEmailForRegister("");
    }

    @And("user input empty password for register")
    public void userInputEmptyPasswordForRegister() {
        registerpage.inputEmptyPasswordForRegister("");
    }

    @Then("user see error message register")
    public void userSeeErrorMessageRegister() {
        registerpage.seeErrorMessageRegisterEmail();
    }


    @When("user input fullname for register")
    public void userInputFullnameForRegister() {
        registerpage.inputFullnameForRegister("wildan");
    }

    @And("user input email for register")
    public void userInputEmailForRegister() {
        registerpage.inputEmailForRegister("wildanrusli@gmail.com");
    }

    @And("user input password for register")
    public void userInputPasswordForRegister() {
        registerpage.inputPasswordForRegister("12345678");
    }
}