package company.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestCheckEmail extends BaseTest {
    @Test
    public void checkMail(){
        app.login.login(validUser2);
        Assert.assertEquals(app.createLetter.getMailSubject(), "Subjecttest");
        app.common.closeApp();
    }

}
