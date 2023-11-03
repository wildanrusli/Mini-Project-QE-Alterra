package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.cartPage;
import starter.pages.productPage;
import starter.pages.transactionsPage;

public class cartSteps {
    @Steps
    cartPage cartpage;
    transactionsPage transactionspage;

    @And("user on cart page")
    public void userOnCartPage() {
        cartpage.onCartPage();
    }

    @When("user click plus icon")
    public void userClickPlusIcon() {
        cartpage.clickPlusIcon();
    }

    @Then("user see quantity of product increases successfully")
    public void userSeeQuantityOfProductIncreasesSuccessfully() {
        cartpage.seeQuantityProduct();
    }

    @When("user click min icon")
    public void userClickMinIcon() {
        cartpage.clickMinIcon();
    }

    @Then("user see quantity of product reduces successfully")
    public void userSeeQuantityOfProductReducesSuccessfully() {
        cartpage.seeQuantityProduct();
    }

    @Then("user see {string}")
    public void userSee(String arg0) {
        cartpage.seeProductEmptyTitle();
    }

    @When("user click bayar button")
    public void userClickBayarButton() {
        cartpage.clickBayarButton();
    }

    @Then("user on transactions page")
    public void userOnTransactionsPage() {
        transactionspage.onTransactionsPage();
    }
}
