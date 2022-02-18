package co.com.sofka.userinterfaces.utest;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class Step3RegisterPage extends PageObject {

    public static final Target COMPUTER = Target
            .the("Computer")
            .located(xpath("//*[@id=\"web-device\"]/div[1]/div[2]"));

    public static final Target VERSION = Target
            .the("Version")
            .located(xpath("//*[@id=\"web-device\"]/div[2]/div[2]"));

    public static final Target LANGUAJE = Target
            .the("languaje computer")
            .located(xpath("//*[@id=\"web-device\"]/div[3]/div[2]"));

    public static final Target MOBILE = Target
            .the("mobile")
            .located(xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));


    public static final Target MODEL = Target
            .the("Model")
            .located(xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));

    public static final Target OPERATING_SYSTEM = Target
            .the("Operating system")
            .located(xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));

    public static final Target NEXT_LAST_STEP = Target
            .the("Next devices")
            .located(xpath("//span[contains(text(),'Next: Last Step')]"));



}
