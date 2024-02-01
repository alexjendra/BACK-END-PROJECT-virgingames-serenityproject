package com.virgingames.currencynote;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.rest.SerenityRest;

public class BingoSteps {

    @Step("Getting all JackPort information")
    public ValidatableResponse getAllJackPort() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT)
                .then();
    }

    @Step("Getting all JackPort information By currency GBP")
    public ValidatableResponse getAllJackPortCurrencyGBP() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_GBP)
                .then();
    }


    @Step("Getting all JackPort information By currency EUR")
    public ValidatableResponse getAllJackPortCurrencyEUR() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_EUR)
                .then();
    }

    @Step("Getting all JackPort information By currency SEK")
    public ValidatableResponse getAllJackPortCurrencySEK() {
        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_JACKPOT_SEK)
                .then();
    }

}
