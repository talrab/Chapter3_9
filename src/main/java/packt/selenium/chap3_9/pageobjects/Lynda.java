package packt.selenium.chap3_9.pageobjects;

import org.openqa.selenium.WebDriver;


/**
 * Created by talr on 10/11/2016.
 */
public class Lynda {
    private WebDriver driver;

    public Lynda(WebDriver driver){
        this.driver = driver;
        //System.out.println(driver.getTitle()+ " (In Lynda constractor)");

    }


}
