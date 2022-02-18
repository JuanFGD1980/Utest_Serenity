package co.com.sofka.task.utest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.By;

import static co.com.sofka.userinterfaces.utest.Step1RegisterPage.*;


public class Step1Utest implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String month;
    private String day;
    private String year;
    private String languages;

    public Step1Utest withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Step1Utest andLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Step1Utest andEmail(String email) {
        this.email = email;
        return this;
    }

    public Step1Utest andMonth(String month) {
        this.month = month;
        return this;
    }

    public Step1Utest andDay(String day) {
        this.day = day;
        return this;
    }

    public Step1Utest andYear(String year) {
        this.year = year;
        return this;
    }

    public Step1Utest andLanguages(String languages) {
        this.languages = languages;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        By selectLanguage = By.xpath("//div[contains(text(),'"+languages+"')]");
        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(email).into(EMAIL),
                Click.on(MONTH_BIRTH),
                SelectFromOptions.byVisibleText(month).from(MONTH_BIRTH),
                Click.on(DAY_BIRTH),
                SelectFromOptions.byVisibleText(day).from(DAY_BIRTH),
                Click.on(YEAR_BIRTH),
                SelectFromOptions.byVisibleText(year).from(YEAR_BIRTH),
                Scroll.to(LANGUAGES),
                Click.on(LANGUAGES),
                Click.on(selectLanguage),
                Click.on(NEXT_LOCATION)

        );
    }

    public static Step1Utest step1Utest(){
        return new Step1Utest();
    }
}
