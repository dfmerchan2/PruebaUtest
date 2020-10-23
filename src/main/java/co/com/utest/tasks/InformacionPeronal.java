package co.com.utest.tasks;

import co.com.utest.models.Personal;
import co.com.utest.models.builder.PersonalBuilder;
import co.com.utest.utils.Obtener;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.utest.userinterface.PersonalPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InformacionPeronal implements Task {

    private Personal personal;

    public InformacionPeronal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(personal.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(personal.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(personal.getCorreo()).into(TXT_CORREO),
                SelectFromOptions.byVisibleText(Obtener.mes(personal.getFecha())).from(LS_MES),
                SelectFromOptions.byVisibleText(Obtener.dia(personal.getFecha())).from(LS_DIA),
                SelectFromOptions.byVisibleText(Obtener.year(personal.getFecha())).from(LS_YEARS),
                Click.on(BTN_SIGUIENTE_LOCALIZACION)
        );
    }

    public static Performable aRegistrar(PersonalBuilder personalBuilder){
        return instrumented(InformacionPeronal.class, personalBuilder.builder());
    }
}
