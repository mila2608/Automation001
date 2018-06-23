package company.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement userEmail;

   /* @FindBy(xpath = "//*[@id=\"newMail\"]/a")
    private WebElement goIntoBox;*/

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[1]/p/a")
    private WebElement createLetter;

    @FindBy(name = "icon-ho ho_settings ho_i_settings")
    private WebElement settings;

   /* @FindBy(xpath = "")
    private WebElement logOut;*/
   public void scrollDown(){
       driver.scrollDown();
   }

    public String getUserEmail() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.visibilityOf(userEmail);
        wait.until(s->s.findElement(By.xpath("//span[@class='sn_menu_title']")).isDisplayed());
        return userEmail.getText();
    }

   /* public void getNextPage(){
        goIntoBox.click();
        createLetter.click();
    }
//    public DashboardPage(WebDriver driver) {
//        PageFactory.initElements(driver,this);
//    }

    public void userLogOut(){
        settings.click();
        logOut.click();
    }*/
}
