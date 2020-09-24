package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.WalmartPage;

public class WalmartStepDefinitions {
    WalmartPage walmartPage = new WalmartPage();

    @Given("kullanici walmart aramakutusuna {string} yazar ve arar")
    public void kullanici_walmart_aramakutusuna_yazar_ve_arar(String string) {
        walmartPage.walmartSearchBox.sendKeys(string+ Keys.ENTER);
    }

    @Then("kullanici walmart sonuc sayisini ekrana yazdirir")
    public void kullanici_walmart_sonuc_sayisini_ekrana_yazdirir() {
         String walmartSonucSSayisi = walmartPage.walmartSonucSayisi.getText();
        System.out.println(walmartSonucSSayisi);
    }

    }
