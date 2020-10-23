package co.com.utest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DireccionPage {
    public static final Target TXT_CIUDAD =
            Target.the("caja de texto ciudad").located(By.id("city"));
    public static final Target TXT_CODIGO_POSTAL =
            Target.the("caja de texto codigo postal").located(By.id("zip"));
    public static final Target TXT_PAIS=
            Target.the("caja de texto ciudad").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target LBL_TITULO=
            Target.the("Descripcion titulo").located(By.className("sub-title"));


}
