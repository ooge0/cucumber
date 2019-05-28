package stepDefinitions.ssLv;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pagesSample.gitHubSite.AgePage;
import stepDefinitions.Hooks;

import static org.junit.Assert.*;


public class ssLvSteps {
    private WebDriver driver;
    static AgePage agePage;

    public ssLvSteps() {
        this.driver = Hooks.driver;
    }

//    @When("^I am on ss.com homepage$")
//    public void iAmSsHomepage() throws Throwable {
//        driver.get("https://google.com");
//    }

    @Then("^I am open \"([^\"]*)\" subcategory$")
    public void iAmOpen(String subCategoryName) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
