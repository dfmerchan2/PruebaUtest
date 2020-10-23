package co.com.utest.stepdedefinitions;

import co.com.utest.interactions.AbrirNavegador;
import co.com.utest.tasks.InformacionDireccion;
import co.com.utest.tasks.InformacionPeronal;
import co.com.utest.tasks.IngresarFormulario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.utest.models.builder.PersonalBuilder.personal;
import static co.com.utest.models.builder.DireccionesBuilder.direcciones;

public class RegistroStepDefinition {

    @Dado("^que (.*) esta en la pagian uTest$")
    public void queDiegoEstaEnLaPagianUTest(String actor) {
        theActorCalled(actor).attemptsTo(
                AbrirNavegador.deUtest()
        );
    }

    @Y("^ingresa al formulario de registro$")
    public void ingresaAlFormularioDeRegistro() {
        theActorInTheSpotlight().attemptsTo(
                IngresarFormulario.deRegistro()
        );
    }

    @Cuando("^ingresa la informacion personal$")
    public void ingresaLaInformacionPersonal(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(
                InformacionPeronal.aRegistrar(personal()
                        .conNombre(data.get(0).get("Nombre"))
                        .conApellido(data.get(0).get("Apellido"))
                        .conCorreo(data.get(0).get("Correo"))
                        .conFecha(data.get(0).get("Fecha"))),
                InformacionDireccion.aRegistrar(direcciones()
                        .conCiudad(data.get(0).get("Ciudad"))
                        .conCodigoPostal(data.get(0).get("CodigoPostal"))
                        .conPais(data.get(0).get("Pais")))
        );
    }

    @Cuando("^la informacion de los dispositivos$")
    public void laInformacionDeLosDispositivos(List<Map<String, String>> data) {

    }

    @Entonces("^observa el mensaje de bienvenida (.*)$")
    public void observaElMensajeDeBienvenida(String arg1) {

    }

}
