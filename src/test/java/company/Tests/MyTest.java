package company.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void testWeb() {
  //      app.login.login("ittest2", "337774a");
        app.login.login(validUser);
        Assert.assertEquals(app.dashboard.getUserEmail().split("@")[0],"ittest2");
                //split("@")[0],"ittest2");
//        new LoginPage().login("ittest2","337774a");
//        String userEmail = new DashboardPage().getUserEmail();
//        Assert.assertEquals(userEmail.split("@")[0],"ittest2");
        //    driver.quit();
        app.common.closeApp();
    }
}
