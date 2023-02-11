package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Static.StaticData.mobile;
import static Static.StaticData.password;

public class AddProductToCart extends TestBase
{
    CartPage cart;
    HomePage home;
    @Test
    public void productAddToCart()
    {
        home=new HomePage();
        home.ScroLLBottom();
        home.AddProductCart();
    }
    @Test(dependsOnMethods = {"productAddToCart"})
    public void confirmProductAddedSuccessfully()
    {
       cart=new CartPage();
       Assert.assertTrue(cart.ResultOfAdding.isDisplayed());
    }


}
