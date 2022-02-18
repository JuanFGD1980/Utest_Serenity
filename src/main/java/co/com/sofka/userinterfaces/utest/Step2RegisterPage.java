package co.com.sofka.userinterfaces.utest;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Step2RegisterPage extends PageObject {

    public static final Target CITY = Target
            .the("City")
            .located(id("city"));

    public static final Target SELECT_CITY = Target
            .the("Select languages")
            .located(xpath("//span[@class='pac-matched']//preceding::*[contains(text(), 'Antioquia, Colombia')]"));

    public static final Target ZIP_POSTAL_CODE = Target
            .the("Zip postal code")
            .located(id("zip"));

    public static final Target COUNTRY = Target
            .the("Country")
            .located(xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));


    public static final Target NEXT_DEVICES = Target
            .the("Next devices")
            .located(xpath("//span[contains(text(),'Next: Devices')]"));
}
