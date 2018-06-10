package company.Utils;

import company.Utils.Users.User;

import java.util.ResourceBundle;

public class Factory {

   public static class Users {
        static ResourceBundle resourceUser = ResourceBundle.getBundle("user");

        public static User getValidUser() {
            return new User(resourceUser.getString("validUser.login"),
                    resourceUser.getString("validUser.password"),
                    resourceUser.getString("validUser.email"));
        }
       public static User getValidUser1() {
           return new User(resourceUser.getString("validUser1.login"),
                   resourceUser.getString("validUser1.password"),
                   resourceUser.getString("validUser1.email"));
       }
       public static User getValidUser2() {
           return new User(resourceUser.getString("validUser2.login"),
                   resourceUser.getString("validUser2.password"),
                   resourceUser.getString("validUser2.email"));
       }
        public static User getRandomUser() {
            return new User("ittest3", "112233q", "ittest3@i.ua");
        }
    }
}
