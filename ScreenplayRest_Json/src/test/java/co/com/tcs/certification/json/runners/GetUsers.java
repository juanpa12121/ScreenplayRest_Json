package co.com.tcs.certification.json.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/get_users.feature",
        glue = "co.com.tcs.certification.json.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@Scenario2"
)
public class GetUsers {
}
