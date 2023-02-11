package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Static.StaticData.*;

public class Register extends TestBase
{
    HomePage home;
    LoginPage login;
    RegisterPage register;

    @Test
    public void userRegisterSuccessfully()
    {
        home = new HomePage();
        home.userCanGoToLoginPage();
        login=new LoginPage();
        login.userCanGoToRegisterPage();
        register= new RegisterPage();
        register.userCanRegister(name,mobile,password,Adress);
        Assert.assertEquals(TestBase.driver.getCurrentUrl(),"https://khodorgy.com/shop");
    }
}
