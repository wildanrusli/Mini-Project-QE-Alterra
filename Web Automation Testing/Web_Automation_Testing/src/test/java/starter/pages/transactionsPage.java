package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class transactionsPage extends PageObject {
    private By transactionsTitle(){
        return By.xpath("//h1[text()='Transactions']");
    }

    @Step
    public void onTransactionsPage(){
        $(transactionsTitle()).isDisplayed();
    }

    @Step
    public void seeTheTransactions(){
        $(transactionsTitle()).isDisplayed();
    }
}
