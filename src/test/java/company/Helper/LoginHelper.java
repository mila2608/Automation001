package company.Helper;

import company.Pages.LoginPage;
import company.Utils.Users.User;

public class LoginHelper extends LoginPage{

public void login (User user){
    login(user.getLogin(), user.getPassword());
}


}
