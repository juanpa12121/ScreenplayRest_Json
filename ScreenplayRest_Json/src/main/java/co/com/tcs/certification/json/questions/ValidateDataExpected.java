package co.com.tcs.certification.json.questions;

import co.com.tcs.certification.json.models.DataGetUser;
import co.com.tcs.certification.json.models.DataGetUserBuilder;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.Collections;
import java.util.List;

public class ValidateDataExpected implements Question<Boolean> {

    private DataGetUserBuilder dataGetUserBuilder;


    public ValidateDataExpected(DataGetUserBuilder dataGetUserBuilder) {
        this.dataGetUserBuilder = dataGetUserBuilder;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
    List<DataGetUserBuilder> dataGetUserBuilderList = SerenityRest.lastResponse().jsonPath().getList("", DataGetUserBuilder.class);
        DataGetUserBuilder dataFromApi = dataGetUserBuilderList.get(1);
        System.out.println(dataFromApi.build().getAddressObject());
        return true;
    }

    public static ValidateDataExpected validateDataExpected(DataGetUserBuilder data){
        return new ValidateDataExpected(data);
    }
}
