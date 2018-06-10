package company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateLetterPage extends BasePage {

    @FindBy(id = "to")
    private WebElement letterTo;

    @FindBy(name = "subject")
    private WebElement letterSubject;

    @FindBy(id = "text")
    private WebElement letterBody;

    @FindBy(name = "send")
    private WebElement send;

    public String getMailSubject() {
        return letterTo.getText();
    }

    public void getLetter() {
        letterTo.sendKeys("ittest3@i.ua");
        letterSubject.sendKeys("Subjecttest");
        letterBody.sendKeys("Bodytest");
        send.click();
    }

}
