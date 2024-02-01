package com.virgingames.currencyinfo;

import com.virgingames.currencynote.BingoSteps;
import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class BingoCRUDSteps extends TestBase {



    @Steps
    BingoSteps bingoSteps;

    @Title("Getting all jackport inforamtion")
    @Test
    public void test001(){
        ValidatableResponse response = bingoSteps.getAllJackPort();
        response.log().all().statusCode(200);

    }
    @Title("Getting all jackport by currency GBP ")
    @Test
    public void test002(){
        ValidatableResponse response = bingoSteps.getAllJackPortCurrencyGBP();
        response.log().all().statusCode(200);
    }

    @Title("Getting all information by currency EUR")
    @Test
    public void test003(){
        ValidatableResponse response = bingoSteps.getAllJackPortCurrencyEUR();
        response.log().all().statusCode(200);

    }

    @Title("Getting all information by currency SEK")
    @Test
    public void test004(){
        ValidatableResponse response = bingoSteps.getAllJackPortCurrencySEK();
        response.log().all().statusCode(200);
    }
}
