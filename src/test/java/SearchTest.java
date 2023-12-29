import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchTest {
    WebDriver driver;
    SearchLocators searchLocators;
    SoftAssert soft = new SoftAssert();
    @BeforeTest
    public void Initiate(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        searchLocators= new SearchLocators(driver);


    }
    @Test
    public void FirstTest(){
        searchLocators.setSearchInput("Panda");

        searchLocators.setSearchResult();
        String name =searchLocators.getName().getText();
        System.out.println("Name Is : "+name);
        soft.assertEquals("Giant panda",name);


    }
    @AfterTest
    public void Quit(){
        driver.quit();
    }
}
