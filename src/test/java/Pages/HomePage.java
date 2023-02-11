package Pages;
import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Tests.TestBase.driver;

public class HomePage
{
    Actions action= new Actions(driver);

    WebElement searchTxt= driver.findElement(By.className("search_input"));
    WebElement cart= driver.findElement(By.cssSelector("i.fa.fa-shopping-cart"));
    WebElement Addproduct= driver.findElement(By.cssSelector("a[class='item-cart-plus-button']"));
    WebElement hoverProduct= driver.findElement(By.cssSelector("div.featured__item__pic.set-bg"));
    WebElement lognBtn= driver.findElement(By.linkText("تسجيل الدخول"));
    WebElement language= driver.findElement(By.className("arrow_carrot-down"));
    public void user_canSearch(String category)
    {
        searchTxt.sendKeys(category);
        searchTxt.click();
    }
    public WebElement resultSearch()
    {
        return driver.findElement(By.cssSelector("div[class='product__item__pic set-bg']"));
    }
    public void userCanGoToLoginPage()
    {
        lognBtn.click();
    }
    public void AddProductCart()
    {
        action.moveToElement(hoverProduct).click().build().perform();
        action.moveToElement(Addproduct).clickAndHold().build().perform();
        Addproduct.click();
        cart.click();
    }
    public void ScroLLBottom()
    {
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("scrollBy(0,500)");
    }
    public void changeLanguage()
    {
        action.moveToElement(language).build().perform();
    }



}
