package com.prueba.Banitsmo.stepdefinitions;

import com.prueba.Banitsmo.tasks.HomePage;
import com.prueba.Banitsmo.tasks.HomePagePDF;
import com.prueba.Banitsmo.tasks.Steps;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class validate {

    @Before
    public void setsteps (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario ingresa a la pagina del portal de banistmo$")
    public void elUsuarioIngresaALaPaginaDelPortalDeBanistmo() {
        OnStage.theActorCalled("usuario").wasAbleTo(HomePage.Mainpage(), Steps.navigationpage());

    }

    @When("^el puede descargar el archivo pdf$")
    public void elPuedeDescargarElArchivoPdf() {
        OnStage.theActorCalled("usuario").wasAbleTo(HomePagePDF.MainpagePdf());
    }

    @Then("^valida que si se descargo correctamente$")
    public void validaQueSiSeDescargoCorrectamente()  {

    }
}
