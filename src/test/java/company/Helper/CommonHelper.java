package company.Helper;

import company.Pages.BasePage;

public class CommonHelper extends BasePage {
    public  void closeApp(){
        driver.quit();
    }
}
