package com.prueba.Banitsmo.tasks;

import com.prueba.Banitsmo.userinterfaces.PaginatestPdf;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class HomePagePDF implements Task {
    private PaginatestPdf paginatestPdf;
    public static HomePagePDF MainpagePdf() {
        return Tasks.instrumented(HomePagePDF.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginatestPdf));
    }
}
