package co.com.sofka.userinterfaces.utest;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Step1RegisterPage extends PageObject {

    public static final Target FIRST_NAME = Target
            .the("First name")
            .located(id("firstName"));

    public static final Target LAST_NAME = Target
            .the("last name")
            .located(id("lastName"));

    public static final Target EMAIL = Target
            .the("Email")
            .located(id("email"));

    public static final Target DAY_BIRTH = Target
            .the("Birth day")
            .located(id("birthDay"));

    public static final Target MONTH_BIRTH = Target
            .the("Birth month")
            .located(id("birthMonth"));

    public static final Target YEAR_BIRTH = Target
            .the("Birth year")
            .located(id("birthYear"));

    public static final Target LANGUAGES = Target
            .the("languages")
            .located(id("languages"));

    public static final Target NEXT_LOCATION = Target
            .the("Next location")
            .located(xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));



}
