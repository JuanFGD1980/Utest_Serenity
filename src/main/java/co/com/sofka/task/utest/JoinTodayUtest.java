package co.com.sofka.task.utest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.utest.JoinTodayPage.JOIN_TODAY;

public class JoinTodayUtest implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(JOIN_TODAY),
                Click.on(JOIN_TODAY)
        );
    }

    public static JoinTodayUtest joinTodayUtest(){
        return new JoinTodayUtest();
    }

}
