package company.Pages;

import company.Common.Constats;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    static protected WebDriver driver;

    static {
       /*  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();*/
       System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();
      /* System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        driver = new FirefoxDriver();*/

        driver.get(Constats.BASE_URL);
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}

