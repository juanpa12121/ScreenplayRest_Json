package co.com.tcs.certification.json.questions;

import co.com.tcs.certification.json.models.*;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class ValidateExpectedData implements Question<Boolean> {

    private DataGetUserBuilder dataFromFeature;


    public ValidateExpectedData(DataGetUserBuilder dataFromFeature) {
        this.dataFromFeature = dataFromFeature;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<DataGetUserBuilder> dataGetUserBuilderList = SerenityRest.lastResponse().jsonPath().getList("", DataGetUserBuilder.class);
        DataGetUserBuilder dataFromApi = dataGetUserBuilderList.get(1);
        Address addressFromApi = dataFromApi.getAddress();
        Company companyFromApi = dataFromApi.getCompany();
        Geo geoFromApi = addressFromApi.getGeo();

        System.out.println("From api: " + dataFromApi.getAddress().getStreet());
        System.out.println("From api: " + dataFromApi.build().getAddressObject().getStreet());
        System.out.printf("From feature: " + dataFromFeature.getStreet());

        System.out.println("\nFrom api geo: " + dataFromApi.getAddress().getGeo().getLng());
        System.out.printf("\nFrom feature geo: " + dataFromFeature.getLng());


        return dataFromApi.getId() == dataFromFeature.getId() &&
                dataFromApi.getName().equals(dataFromFeature.getName()) &&
                dataFromApi.getAddress().getStreet().equals(dataFromFeature.getStreet()) &&
                addressFromApi.getSuite().equals(dataFromFeature.getSuite()) &&
                addressFromApi.getCity().equals(dataFromFeature.getCity()) &&
                addressFromApi.getZipcode().equals(dataFromFeature.getZipCode()) &&
                geoFromApi.getLng().equals(dataFromFeature.getLng()) &&
                geoFromApi.getLat().equals(dataFromFeature.getLat()) &&
                dataFromApi.getPhone().equals(dataFromFeature.getPhone()) &&
                dataFromApi.getWebsite().equals(dataFromFeature.getWebsite()) &&
                companyFromApi.getName().equals(dataFromFeature.getCompanyName()) &&
                companyFromApi.getCatchPhrase().equals(dataFromFeature.getCatchPhrase()) &&
                companyFromApi.getBs().equals(dataFromFeature.getBs());
    }

    public static ValidateExpectedData validateDataExpected(DataGetUserBuilder data) {
        return new ValidateExpectedData(data);
    }
}
