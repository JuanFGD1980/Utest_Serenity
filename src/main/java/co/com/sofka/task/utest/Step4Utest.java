package co.com.sofka.task.utest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.sofka.userinterfaces.utest.Step4RegisterPage.*;

public class Step4Utest implements Task {

    private String createPassword;
    private String confirmPassword;

    public Step4Utest withCreatePassword(String createPassword) {
        this.createPassword = createPassword;
        return this;
    }

    public Step4Utest andConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CREATE_PASSWORD),
                Enter.theValue(createPassword).into(CREATE_PASSWORD),
                Click.on(CONFIRM_PASSWORD),
                Enter.theValue(confirmPassword).into(CONFIRM_PASSWORD),
                Click.on(STAY_INFORMED),
                Click.on(TERMS),
                Click.on(PRIVACY),
                Click.on(BTN_COMPLETE_SETUP)

        );
    }

    public static Step4Utest step4Utest(){
        return new Step4Utest();
    }
}
