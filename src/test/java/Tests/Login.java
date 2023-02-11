package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Static.StaticData.mobile;
import static Static.StaticData.password;

public class Login extends TestBase
{

    HomePage home;
    LoginPage login;
    @Test
    public void userLoggedSuccessfully()
    {
        home=new HomePage();
        home.userCanGoToLoginPage();
        login=new LoginPage();
        login.userCanLoginSuccessfully(mobile,password);
       Assert.assertTrue(login.resultLogin().isEnabled());
    }
}
