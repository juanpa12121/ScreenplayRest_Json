package co.com.tcs.certification.json.stepdefinitions;
import co.com.tcs.certification.json.models.DataGetUserBuilder;
import co.com.tcs.certification.json.questions.ValidateExpectedData;
import co.com.tcs.certification.json.questions.ValidateStatusCode;
import co.com.tcs.certification.json.tasks.GetUsersJson;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;

import java.util.List;

import static co.com.tcs.certification.json.utils.Constants.ACTOR_NAME;
import static co.com.tcs.certification.json.utils.Constants.BASE_ENDPOINT_JSON;

public class GetUsersStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_NAME);
    }

    @Given("^The user is in API$")
    public void theUserIsInAPI() {
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_ENDPOINT_JSON));
    }


    @When("^The user makes the query request$")
    public void theUserMakesTheQueryRequest() {
        OnStage.theActorInTheSpotlight().attemptsTo(GetUsersJson.getUserList());
    }

    //@Scenario1
    @Then("^The user validates the status code (\\d+)$")
    public void theUserValidatesTheStatusCode(int statusCode) {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(ValidateStatusCode.getStatusCode(),
                        Matchers.equalTo(200)));
    }

    //@Scenario2
    @Then("^The user validates that get response contains data expected$")
    public void theUserValidatesThatGetResponseContainsDataExpected(List<DataGetUserBuilder> dataGetList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateExpectedData.validateDataExpected(dataGetList.get(0))));
    }
}
