package co.com.sofka.task.utest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static co.com.sofka.userinterfaces.utest.Step3RegisterPage.*;


public class Step3Utest implements Task {

    private String computer;
    private String version;
    private String computerLanguage;
    private String mobile;
    private String mobileModel;
    private String operatingSystem;

    public Step3Utest withComputer(String computer) {
        this.computer = computer;
        return this;
    }

    public Step3Utest andVersion(String version) {
        this.version = version;
        return this;
    }

    public Step3Utest andComputerLanguage(String computerLanguage) {
        this.computerLanguage = computerLanguage;
        return this;
    }

    public Step3Utest andMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Step3Utest andMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
        return this;
    }

    public Step3Utest andOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        By selectComputerOs = By.xpath("//div[contains(text(),'"+computer+"')]");
        By selectVersion = By.xpath("//div[contains(text(),'"+version+"')]");
        By selectLanguage = By.xpath("//div[contains(text(),'"+computerLanguage+"')]");
        By selectMobile = By.xpath("//div[contains(text(),'"+mobile+"')]");
        By selectModel = By.xpath("//div[contains(text(),'"+mobileModel+"')]");
        By selectOperatingSystem = By.xpath("//div[contains(text(),'"+operatingSystem+"')]");
        actor.attemptsTo(
                Click.on(COMPUTER),
                Click.on(selectComputerOs),
                Click.on(VERSION),
                Click.on(selectVersion),
                Click.on(LANGUAJE),
                Click.on(selectLanguage),
                Click.on(MOBILE),
                Click.on(selectMobile),
                Click.on(MODEL),
                Click.on(selectModel),
                Click.on(OPERATING_SYSTEM),
                Click.on(selectOperatingSystem),
                Click.on(NEXT_LAST_STEP)

        );
    }

    public static Step3Utest step3Utest(){
        return new Step3Utest();
    }
}
