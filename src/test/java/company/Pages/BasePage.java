package company.Pages;

import company.Drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected WebDriver driver = DriverFactory.getDriver();

   /* static {
       *//*  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();*//*
       *//*System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();*//*
      *//* System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();*//*

      //  driver.get(Constats.BASE_URL);
    }
*/
    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}

