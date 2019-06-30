package pagesSample.ssLv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.data.MapEntry.entry;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static stepDefinitions.Hooks.driver;

public class SsLv {

    @FindBy(how = How.ID, using = "")
    private WebElement buttonSearch;

    @FindBy(how = How.NAME, using = "")
    private WebElement searchInput;

    @FindBy(how = How.CLASS_NAME, using = "")
    List<WebElement> searchResults;

    @FindBy(how = How.CLASS_NAME, using = "")
    private WebElement result;

    public String getPageUrl() {
        return "https://www.ss.com/en";
    }


    int category = 1;
    public void openingCategory(int categoryNumber) {
//        int category = categoryNumber;
        /**
         * Here is possible to create an additional method that will use
         * a list of names for opening different categories. Best solution
         * is creating an additional method that will use some atribute for generating link
         * for webdriver
         * */
        WebElement categoryLinkButton = driver.findElement(By.cssSelector("#td_"+category+">div>div>div>div" ));
        categoryLinkButton.click();
    }
 public void openingSubCategory (String subName) {
     /**
      * Here is possible to create an additional method that will use
      * a list of names for opening different links that are available on the page.
      * Best solution is a switch/case statement.
      * */
//        WebElement category = driver.findElement(By.cssSelector("#td_"+category+">div>div>div>div"));
 }
}
