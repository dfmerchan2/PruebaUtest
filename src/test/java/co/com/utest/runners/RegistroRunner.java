package co.com.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro.feature",
        glue = "co.com.utest.stepdedefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RegistroRunner {
}
