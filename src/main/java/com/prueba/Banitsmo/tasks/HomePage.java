package com.prueba.Banitsmo.tasks;

import com.prueba.Banitsmo.userinterfaces.Paginatest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class HomePage implements Task {

    private Paginatest paginatest;
    public static HomePage Mainpage() {
        return Tasks.instrumented(HomePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginatest));
    }
}
