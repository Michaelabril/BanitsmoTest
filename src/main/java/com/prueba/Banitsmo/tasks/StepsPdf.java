package com.prueba.Banitsmo.tasks;
import com.prueba.Banitsmo.userinterfaces.PaginatestPdf;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

public class StepsPdf implements Task {

    public static StepsPdf navigationpagePdf() {
        return Tasks.instrumented(StepsPdf.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PaginatestPdf.PAGEPDF),
                Click.on(PaginatestPdf.DOWNLOADPDF),
                Click.on(PaginatestPdf.VIEWPAGE));

    }
}

