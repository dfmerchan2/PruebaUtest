package co.com.utest.stepdedefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }
}
