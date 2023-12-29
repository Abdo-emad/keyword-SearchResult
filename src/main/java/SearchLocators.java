import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchLocators extends MainClass{
    public SearchLocators(WebDriver driver) {
        super(driver);
    }
    By searchInput = By.id("APjFqb");
    By searchResult = By.xpath("//a[@href=\"https://en.wikipedia.org/wiki/Giant_panda\"]");
    By resultName = By.xpath("//span[@class=\"mw-page-title-main\"]");

    public void setSearchInput(String phase){
        driver.findElement(searchInput).sendKeys(phase);
        driver.findElement(searchInput).sendKeys(Keys.ENTER);
    }
    public void setSearchResult(){
        driver.findElements(searchResult).get(1).click();
    }
    public WebElement getName(){
        WebElement element = driver.findElement(resultName);
        return element;
    }

}
