package co.com.sofka.userinterfaces.utest;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Step4RegisterPage extends PageObject {

    public static final Target CREATE_PASSWORD = Target
            .the("Create password")
            .located(id("password"));

    public static final Target CONFIRM_PASSWORD = Target
            .the("Confirm Password")
            .located(id("confirmPassword"));

    public static final Target STAY_INFORMED = Target
            .the("Stay Informed")
            .located(xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]"));

    public static final Target TERMS = Target
            .the("Terms")
            .located(xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));


    public static final Target PRIVACY = Target
            .the("Privacy")
            .located(xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BTN_COMPLETE_SETUP = Target
            .the("Btn setup")
            .located(id("laddaBtn"));
}
