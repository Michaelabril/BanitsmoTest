package com.prueba.Banitsmo.tasks;

import com.prueba.Banitsmo.userinterfaces.Paginatest;
import com.prueba.Banitsmo.userinterfaces.PaginatestPdf;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class Steps implements Task {

    public static Steps navigationpage() {
        return Tasks.instrumented(Steps.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Paginatest.PRODUCTOSANDSERVICIOS),
        Click.on(Paginatest.DEPOSITOS),
        Click.on(Paginatest.CUENTACOMERCIAL),
        Click.on(Paginatest.DOCUMENTOS),
        Click.on(Paginatest.PDF));

    }
}
