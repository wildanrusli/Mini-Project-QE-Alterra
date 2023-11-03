package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class productPage extends PageObject {
    private By profileIcon(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }

    private By logoutButton(){
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }

    private By detailProductButton(){ return By.xpath("//div[@class='v-card v-sheet theme--light']//button[1]/span[contains(text(),'Detail')]"); }

    private By detailProductTittle() { return By.xpath("//p[contains(@class,'text-h4 text--primary')][contains(text(),'gaming')]"); }

    private By beliButton(){ return By.xpath("//div[@class='v-card v-sheet theme--light']//button[2]/span[contains(text(),'Beli')]"); }

    private By transaksiButton(){
        return By.xpath("//div[contains(text(),' Transaksi ')]");
    }

    private By logoutIcon(){
        return By.xpath("//div[contains(text(),' Logout ')]");
    }

    @Step
    public void onProductPage(){
        open();
        $(profileIcon()).isDisplayed();
    }

    @Step
    public void clickLogoutButton(){
        $(logoutButton()).click();
    }

    @Step
    public void onProductPageSuccessfully(){
        $(profileIcon()).isDisplayed();
    }

    @Step
    public void clickDetailProductButton(){
        $(detailProductButton()).click();
    }

    @Step
    public void seeDetailProduct(){
        $(detailProductTittle()).isDisplayed();
    }

    @Step
    public void clickBeliButton(){
        $(beliButton()).click();
    }

    @Step
    public void clickProfileIcon(){
        $(profileIcon()).click();
    }

    @Step
    public void clickTransaksiButton(){
        $(transaksiButton()).click();
    }

    @Step
    public void clickLogoutIcon(){
        $(logoutIcon()).click();
    }
}
