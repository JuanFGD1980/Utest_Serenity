package co.com.sofka.stepdefinitions;

import co.com.sofka.Setup;

import co.com.sofka.model.utest.UtestModel;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;

import java.util.Locale;

import static co.com.sofka.question.utest.Utest.utest;
import static co.com.sofka.task.OpenLandingPage.openLandingPage;
import static co.com.sofka.task.utest.JoinTodayUtest.joinTodayUtest;
import static co.com.sofka.task.utest.Step1Utest.step1Utest;
import static co.com.sofka.task.utest.Step2Utest.step2Utest;
import static co.com.sofka.task.utest.Step3Utest.step3Utest;
import static co.com.sofka.task.utest.Step4Utest.step4Utest;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class UtestStepDefinition extends Setup {

    public static Logger LOGGER = Logger.getLogger(UtestStepDefinition.class);

    private UtestModel user;

    Faker faker = new Faker(new Locale("en-US"));

    @Given("the user is located on the page www.utest.com")
    public void theUserIsLocatedOnThePageHttpsWwwUtestCom() {
        try {
            actorSetupTheBrowser(actor.getName());
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
            LOGGER.info("** Inicio scenario");
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
            Assertions.fail("");
        }
    }

    @When("the user performs the registration process")
    public void theUserPerformsTheRegistrationProcess() {
        try {
            generateUser();
            theActorInTheSpotlight().wasAbleTo(
                    joinTodayUtest(),
                    step1Utest()
                            .withFirstName(user.getFirstName())
                            .andLastName(user.getLastName())
                            .andEmail(user.getEmail())
                            .andMonth(user.getMonth())
                            .andDay(user.getDay())
                            .andYear(user.getYear())
                            .andLanguages(user.getLanguages()),
                    step2Utest()
                            .withCity(user.getCity())
                            .andZipCode(user.getZipCode())
                            .andCountry(user.getCountry()),
                    step3Utest()
                            .withComputer(user.getComputer())
                            .andVersion(user.getVersion())
                            .andComputerLanguage(user.getComputerLanguage())
                            .andMobile(user.getMobile())
                            .andMobileModel(user.getMobileModel())
                            .andOperatingSystem(user.getOperatingSystem()),
                    step4Utest()
                            .withCreatePassword(user.getCreatePassword())
                            .andConfirmPassword(user.getConfirmPassword())
            );
            LOGGER.info("** Inicio when");
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
            Assertions.fail("");
        }
    }

    @Then("the user should see the registration confirmation")
    public void theUserShouldSeeTheRegistrationConfirmation() {
       /* try {
            theActorInTheSpotlight().should(
                    seeThat(
                            utest(),equalTo(true)
                    )
            );
            LOGGER.info("** Inicio scenario");
        }catch (Exception e){
            LOGGER.warn(e.getMessage(), e);
            Assertions.fail("");
        }*/

    }


    private void generateUser(){
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String fullName = StringUtils.deleteWhitespace(firstName+lastName);
        String email = fullName+"@gmail.com";
        String password = faker.bothify("Qa?????####");

        user = new UtestModel();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setMonth("February");
        user.setDay("14");
        user.setYear("1980");
        user.setLanguages("Spanish");
        user.setCity("Rionegro");
        user.setZipCode("054040");
        user.setCountry("Colombia");
        user.setComputer("Chrome OS");
        user.setVersion("Chrome OS 78");
        user.setComputerLanguage("Italian");
        user.setMobile("Xiaomi");
        user.setMobileModel("Redmi Note 9");
        user.setOperatingSystem("Android 11");
        user.setCreatePassword(password);
        user.setConfirmPassword(password);

    }
}
