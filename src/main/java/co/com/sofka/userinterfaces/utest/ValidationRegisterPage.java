package co.com.sofka.userinterfaces.utest;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ValidationRegisterPage extends PageObject {

    public static final Target MESSAGE_VALIDATION = Target
            .the("Message Validations")
            .located(xpath("//*[@id=\"rc-imageselect\"]/div[2]/div[1]/div[1]/div"));
}
