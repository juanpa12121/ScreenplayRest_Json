package co.com.tcs.certification.json.tasks;

import co.com.tcs.certification.json.utils.Constants;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetUsersJson implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(Constants.USERS)
                        .with(requestSpecification -> requestSpecification
                                .log().all().relaxedHTTPSValidation())
        );
        SerenityRest.lastResponse().prettyPrint();
    }

    public static GetUsersJson getUserList() {
        return Tasks.instrumented(GetUsersJson.class);
    }
}
