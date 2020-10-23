package co.com.utest.tasks;

import co.com.utest.models.Direcciones;
import co.com.utest.models.builder.DireccionesBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.utest.userinterface.DireccionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InformacionDireccion implements Task {

    private Direcciones direcciones;

    public InformacionDireccion(Direcciones direcciones) {
        this.direcciones = direcciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                /*Enter.theValue(direcciones.getCiudad()).into(TXT_CIUDAD),
                Click.on(LBL_TITULO),
                Enter.theValue(direcciones.getCodigoPostal()).into(TXT_CIUDAD),
                Ensure.that(TXT_PAIS).text().isEqualTo(direcciones.getPais())*/
        );
    }

    public static Performable aRegistrar(DireccionesBuilder direccionesBuilder){
        return instrumented(InformacionDireccion.class, direccionesBuilder.builder());
    }

}
