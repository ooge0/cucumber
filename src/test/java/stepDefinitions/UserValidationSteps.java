package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagesSample.EnterNewPersonPage;
import pagesSample.KristinaPage;
import pagesSample.PeopleWithJobPage;

import static stepDefinitions.MainPoSteps.peopleWithJobPage;

public class UserValidationSteps {
    private WebDriver driver;
    static KristinaPage kristinaPage;
    static EnterNewPersonPage enterNewPersonPage;


    public UserValidationSteps() {
        this.driver = Hooks.driver;
        kristinaPage = PageFactory.initElements(Hooks.driver, KristinaPage.class);
        enterNewPersonPage = PageFactory.initElements(Hooks.driver, EnterNewPersonPage.class);
        peopleWithJobPage = PageFactory.initElements(Hooks.driver, PeopleWithJobPage.class);
    }

    @And("^I click \"(submit|add a new)\" button using PO$")
    public void iClickSubmitButton(String nameButton) throws Throwable {
        kristinaPage.clickButton(nameButton);

    }

    @When("^I fill the form using PO$")
    public void fillingRecordForm(DataTable table) throws Throwable {
        enterNewPersonPage.enteringUserInfo(table);
    }

    @And("^I click Add button using PO$")
    public void iClickAddPersonButton() throws Throwable {
        enterNewPersonPage.clickOnAddPersonButton();
    }

    @And("^I check that table contains \"(\\d+)\" records using PO$")
    public void validationRecordsQuantity(int refValue) throws Throwable {

        peopleWithJobPage.checkRecordsListSie(refValue);
    }

    @And("^I delete last created user using PO$")
    public void deleteLastRecords() throws Throwable {
        peopleWithJobPage.deleteLastRecord();
    }

}

