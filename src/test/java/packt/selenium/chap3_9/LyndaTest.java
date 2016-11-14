package packt.selenium.chap3_9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import packt.selenium.chap3_9.pageobjects.Google;
import packt.selenium.chap3_9.pageobjects.GoogleSearchPage;
import packt.selenium.chap3_9.pageobjects.Lynda;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

/**
 * Created by talr on 14/11/2016.
 */
public class LyndaTest {
    private WebDriver driver;
    public Google googlePage;
    public GoogleSearchPage searchPage;
    public Lynda lynda;

    @Before
    public void setUp() throws Exception {
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "c:\\D\\Online Courses\\Selenium and continoues integration\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
    @Test
    public void testGoogleSearch(){
        googlePage = new Google(driver);
        searchPage = googlePage.goToSearchPage();
        lynda = searchPage.goToLynda();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Mastering Selenium Testing Tools";
        assertEquals(expectedTitle, actualTitle);


    }

}


