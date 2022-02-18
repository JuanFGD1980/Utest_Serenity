package co.com.sofka.task.utest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

import static co.com.sofka.userinterfaces.utest.Step2RegisterPage.*;

public class Step2Utest implements Task {

    private String city;
    private String zipCode;
    private String country;

    public Step2Utest withCity(String city) {
        this.city = city;
        return this;
    }

    public Step2Utest andZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public Step2Utest andCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        By selectCoubtry = By.xpath("//div[contains(text(),'"+country+"')]");
        actor.attemptsTo(
                Click.on(CITY),
                Clear.field(CITY),
                Enter.theValue(city).into(CITY),
                Click.on(SELECT_CITY),
                Click.on(ZIP_POSTAL_CODE),
                Clear.field(ZIP_POSTAL_CODE),
                Enter.theValue(zipCode).into(ZIP_POSTAL_CODE),
                Click.on(COUNTRY),
                Click.on(selectCoubtry),
                Click.on(NEXT_DEVICES)



        );
    }

    public static Step2Utest step2Utest(){
        return new Step2Utest();
    }
}
