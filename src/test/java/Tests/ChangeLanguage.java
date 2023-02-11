package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;


public class ChangeLanguage extends TestBase
{
    HomePage home;

    @Test
    public void userCanChangeLanguageSuccessfully()
    {
        home=new HomePage();
        home.changeLanguage();
    }
}


