package company.Pages;

import company.Drivers.MyDriver;
import org.apache.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected org.apache.log4j.Logger log = LogManager.getLogger(this.getClass());
    static protected MyDriver driver = MyDriver.getInstance();

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

