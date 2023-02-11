package Tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Search extends TestBase
{
      String product="طماطم";
      HomePage home;
      @Test
      public void userSearchSuccessfull()
      {
         home=new HomePage();
         home.user_canSearch(product);
         // driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
         Assert.assertTrue(home.resultSearch().isEnabled());
      }
}
