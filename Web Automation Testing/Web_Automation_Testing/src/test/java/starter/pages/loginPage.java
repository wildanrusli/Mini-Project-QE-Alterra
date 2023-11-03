package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class loginPage extends PageObject {
    private By titleLoginPage(){
        return By.xpath("//div[text()='Login']");
    }

    private By emailField(){
        return By.xpath("//label[text()='Email']//following-sibling::input");
    }

    private By passwordField(){
        return By.xpath("//label[text()='Password']//following-sibling::input");
    }

    private By loginButton(){
        return By.xpath("//span[text()='Login']");
    }

    private By errorMessageEmail(){
        return By.xpath("//div[text()=' email is required ']");
    }

    private By errorMessagePassword(){
        return By.xpath("//div[text()=' password is required ']");
    }

    private By errorMessageNotFound(){
        return By.xpath("//div[text()=' record not found ']");
    }

    private By errorMessageInvalid(){
        return By.xpath("//div[text()=' email or password is invalid ']");
    }

    private By registerLink(){
        return By.xpath("//a[text()='Register']");
    }

    @Step
    public void onLoginPage(){
        $(titleLoginPage()).isDisplayed();
    }

    @Step
    public void inputValidEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputValidPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public void inputEmptyEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputEmptyPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void inputInvalidEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputInvalidPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public boolean seeErrorMessagePasswordIsRequired(){
        return $(errorMessagePassword()).isDisplayed();
    }

    @Step
    public boolean viewErrorMessageEmailIsRequired(){
        return $(errorMessageEmail()).isDisplayed();
    }

    @Step
    public boolean canSeeErrorMessageNotFound(){
        return $(errorMessageNotFound()).isDisplayed();
    }

    @Step
    public boolean canViewErrorMessageInvalid(){
        return $(errorMessageInvalid()).isDisplayed();
    }

    @Step
    public void onLoginPageSuccessfully(){
        $(titleLoginPage()).isDisplayed();
    }

    @Step
    public void clickRegisterLink(){
        $(registerLink()).click();
    }
}
