package co.com.sofka.question.utest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.utest.ValidationRegisterPage.MESSAGE_VALIDATION;

public class Utest implements Question<Boolean> {

    public static final String MESSAGE_CONFIRMATION = "Selecciona todos los cuadrados que contengan ";

    @Override
    public Boolean answeredBy(Actor actor) {
        return (MESSAGE_VALIDATION.resolveFor(actor).containsOnlyText(MESSAGE_CONFIRMATION));
    }

    public static Utest utest(){
        return new Utest();
    }

}
