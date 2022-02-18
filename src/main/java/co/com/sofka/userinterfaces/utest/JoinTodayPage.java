package co.com.sofka.userinterfaces.utest;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class JoinTodayPage extends PageObject {

    public static final Target JOIN_TODAY = Target
            .the("Join Today")
            .located(xpath("//a[@href='/signup/personal']"));

}
