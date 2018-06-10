package company.Tests;

import company.App;
import company.Utils.Factory;
import company.Utils.Users.User;

public class BaseTest {
    static App app = new App();
    static User validUser = Factory.Users.getValidUser();
    static User validUser1 = Factory.Users.getValidUser1();
    static User validUser2 = Factory.Users.getValidUser2();

    public void TearDown() {
        app.common.closeApp();
    }
}