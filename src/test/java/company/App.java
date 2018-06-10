package company;

import company.Helper.CommonHelper;
import company.Helper.CreateLetterHelper;
import company.Helper.DashboardHelper;
import company.Helper.LoginHelper;
import company.Pages.CreateLetterPage;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CreateLetterHelper createLetter;


    public App() {
        this.login = new LoginHelper();
        this.dashboard = new DashboardHelper();
        this.common = new CommonHelper();
        this.createLetter = new CreateLetterHelper();

    }

//    public App(LoginHelper login, DashboardHelper dashboard, CommonHelper common) {
//        this.login = login;
//        this.dashboard = dashboard;
//        this.common = common;
//    }
}
