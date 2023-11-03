package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.productPage;
import starter.pages.transactionsPage;

public class transactionsSteps {
    @Steps
    productPage productpage;
    transactionsPage transactionpage;

    @When("user click profile icon")
    public void userClickProfileIcon() {
        productpage.clickProfileIcon();
    }

    @And("user click transaksi button")
    public void userClickTransaksiButton() {
        productpage.clickTransaksiButton();
    }

    @Then("user see the transactions")
    public void userSeeTheTransactions() {
        transactionpage.seeTheTransactions();
    }

    @And("user click logout icon")
    public void userClickLogoutIcon() {
        productpage.clickLogoutIcon();
    }
}
