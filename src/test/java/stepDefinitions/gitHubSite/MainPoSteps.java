package stepDefinitions.gitHubSite;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesSample.gitHubSite.EnterNewPersonPage;
import pagesSample.GooglePage;
import pagesSample.gitHubSite.oogeO;
import pagesSample.gitHubSite.PeopleWithJobPage;
import stepDefinitions.Hooks;

public class MainPoSteps {
    private WebDriver driver;
    static GooglePage googlePage;
    static oogeO oogeOPage;
    static PeopleWithJobPage peopleWithJobPage;
    static EnterNewPersonPage enterNewPersonPage;

    public MainPoSteps() {
        this.driver = Hooks.driver;
        googlePage = PageFactory.initElements(Hooks.driver, GooglePage.class);
        oogeOPage = PageFactory.initElements(Hooks.driver, oogeO.class);
        peopleWithJobPage = PageFactory.initElements(Hooks.driver, PeopleWithJobPage.class);
        enterNewPersonPage = PageFactory.initElements(Hooks.driver, EnterNewPersonPage.class);
    }

    /***
     *  below are steps definition for Google web site
     * */

    @When("^I am on Google homepage using PO$")
    public void iAmOnGoogleHomepage() throws Throwable {
        driver.get(googlePage.getPageUrl());
    }

    @Then("^I verify lucky button text using PO$")
    public void iVerifyLuckyButtonText() throws Throwable {

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
     *  below are steps definition for ooge0 web site
     * */

    @Given("^I am on (enter a number|people with jobs) page using PO$")
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