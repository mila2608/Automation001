package company.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestSendMail extends BaseTest{
@Test
    public void testMail(){
    app.login.login(validUser1);
    Assert.assertEquals(app.dashboard.getUserEmail().split("@")[0],"ittest3");
   // app.dashboard.getNextPage();
    app.createLetter.getLetter();
    app.common.closeApp();

}


}
