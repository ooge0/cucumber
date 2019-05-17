package pagesSample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.*;


public class AgePage {
    @FindBy(how = How.ID, using = "name")
    private WebElement nameInput;
    @FindBy(how = How.NAME, using = "age")
    private WebElement ageInput;
    @FindBy(how = How.ID, using = "submit")
    private WebElement submitButton;
    @FindBy(how = How.CLASS_NAME, using = "error")
    private WebElement errorText;


    public String getPageUrl() {
        return "https://kristinek.github.io/site/examples/age";
    }

    public void enterName(String name) {
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void enterAge(String age) {
        ageInput.clear();
        ageInput.sendKeys(age);
    }

    public void enterNameAgeAndClickSubmit(String name, String age) {
        enterName(name);
        enterAge(age);
        submitButton.click();
    }

    public void checkThatFormIsClean() {
        assertEquals(nameInput.getAttribute("value"), "Enter name here");
        assertEquals(ageInput.getAttribute("value"), "");
        assertFalse(errorText.isDisplayed());
    }
}
