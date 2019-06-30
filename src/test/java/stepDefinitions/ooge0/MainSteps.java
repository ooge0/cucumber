package stepDefinitions.ooge0;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Resources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesSample.ooge0.EnterNewPersonPage;
import pagesSample.ooge0.PeopleWithJobPage;
import pagesSample.ooge0.oogeO;
import pagesSample.googlePage.GooglePage;
import pagesSample.ssLv.SsLv;
import stepDefinitions.Hooks;


public class MainSteps {
    private WebDriver driver;
    static GooglePage googlePage;
    static PeopleWithJobPage peopleWithJobPage;
    static SsLv ssLvPage;
    static oogeO oogeOPage;
    static EnterNewPersonPage enterNewPersonPage;

    public MainSteps() {
        this.driver = Hooks.driver;
        googlePage = PageFactory.initElements(Hooks.driver, GooglePage.class);
        ssLvPage = PageFactory.initElements(Hooks.driver, SsLv.class);
        oogeOPage = PageFactory.initElements(Hooks.driver, oogeO.class);
        peopleWithJobPage = PageFactory.initElements(Hooks.driver, PeopleWithJobPage.class);
        enterNewPersonPage = PageFactory.initElements(Hooks.driver, EnterNewPersonPage.class);
    }

    /***
     *  below are steps definition for Google web site
     * */

    @When("^I am on \"(Google|SS)\" homepage$")
    public void iAmOnHomepage(String siteName) throws Throwable {
        driver.get(Resources.getEnvValue());
    }

    @Then("^I verify lucky button text using PO$")
    public void iVerifyLuckyButtonText() throws Throwable {
        googlePage.verifyLuckyButton();

    }

    @And("^I found something using PO$")
    public void iFoundSomething() throws Throwable {
        googlePage.verifySearchResult();
    }

    @And("^I enter some text in searchBox using PO$")
    public void iEnterSomeTextInSearchbox() throws Throwable {
        googlePage.enterSomeText();
    }

    /***
     *  below are steps definition for Kristina web site
     * */

    @Given("^I am on (enter a number|people with jobs) page$")
    public void openOogeOPage(String menuItem) {
        driver.get(oogeOPage.getOogeOPageUrl(menuItem));
    }

    @When("^I enter \"([^\"]*)\" using PO$")
    public void iEnterNumber(String number) throws Throwable {
        oogeOPage.enterNumber(number);
    }


    @Then("^I see warning message: \"([^\"]*)\" using PO$")
    public void iSeeWarningMessage(String text) throws Throwable {
        oogeOPage.checkAllert(text);
    }

    @Then("^I check (valid|invalid) \"([^\"]*)\" using PO$")
    public void iCheckNumber(String statement, int number) throws Throwable {
        oogeOPage.numberValidation(statement, number);
    }

}