package company.Helper;

import company.Pages.LoginPage;
import company.Utils.Users.User;

public class LoginHelper extends LoginPage{

public void login (User user){

log.info(String.format("User login: userr -%s, password -%s",
        user.getLogin(),
        user.getPassword()));
    login(user.getLogin(), user.getPassword());

}


}
