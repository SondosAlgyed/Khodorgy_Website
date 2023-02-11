package Tests;

import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Static.StaticData.mobile;
import static Static.StaticData.password;

public class CheckOut extends TestBase {
    CartPage cart;
    HomePage home;
    LoginPage login;
    CheckoutPage checkout;

    @Test(priority = 1)
    public void productAddToCart()
    {
        home = new HomePage();
        home.ScroLLBottom();
        home.AddProductCart();
        cart = new CartPage();
        Assert.assertTrue(cart.ResultOfAdding.isDisplayed());
        home.ScroLLBottom();
        cart.userCanCompletRequest();
    }

    @Test(priority = 2)
    public void loginUserCanPayment()
    {
        login = new LoginPage();
        login.userCanLoginSuccessfully(mobile, password);
        Assert.assertTrue(login.resultLogin().isEnabled());
        Assert.assertEquals(driver.getCurrentUrl(), "https://khodorgy.com/checkout");
        home.ScroLLBottom();
        checkout = new CheckoutPage();
        checkout.userCanPayied();
        Assert.assertTrue(driver.getCurrentUrl().contains("orders/"));

    }

}