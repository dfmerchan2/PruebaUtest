package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PersonalPage {
    public static final Target TXT_NOMBRE =
            Target.the("Caja de texto nombre").located(By.id("firstName"));
    public static final Target TXT_APELLIDO =
            Target.the("Caja de texto apellido").located(By.id("lastName"));
    public static final Target TXT_CORREO =
            Target.the("Caja de texto correo").located(By.id("email"));
    public static final Target LS_MES =
            Target.the("Lista de meses").located(By.id("birthMonth"));
    public static final Target LS_DIA =
            Target.the("Lista de dias").located(By.id("birthDay"));
    public static final Target LS_YEARS =
            Target.the("Lista de años").located(By.id("birthYear"));
    public static final Target BTN_SIGUIENTE_LOCALIZACION =
            Target.the("Boton siguiente localizacion").located(By.xpath("//span[contains(.,'Next: Location')]"));

}
