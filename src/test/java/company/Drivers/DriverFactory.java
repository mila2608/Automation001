package company.Drivers;

import company.Common.Constats;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver getDriver(){
        WebDriver driver = null;
        String name = System.getProperty("driver");

        if ("firefox".equals(name))
        {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Constats.BASE_URL);
        return driver;

    }

}
