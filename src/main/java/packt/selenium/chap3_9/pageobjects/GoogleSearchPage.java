package packt.selenium.chap3_9.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Ripon on 11/19/2015.
 */
public class GoogleSearchPage {
    private WebDriver driver;
    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getTitle());
        if (!driver.getTitle().equals("Mastering Selenium Testing Tools - Google Search")){
            throw new WrongPageException("Incorrect page for Google Search page");
        }
    }
    public String getNumberOfResults(){
        String numberOfResults = driver.findElement(By.id("resultStats")).getText();
        System.out.println(numberOfResults);
        return  numberOfResults;
    }

    public Lynda goToLynda (WebDriver driver){
        driver.findElement(By.linkText("Mastering Selenium Testing Tools - Lynda.com")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("nav-logooooo")));
        return new Lynda(driver);
    }
}