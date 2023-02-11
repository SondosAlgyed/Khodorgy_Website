package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Tests.TestBase.driver;

public class CartPage
{
    public WebElement ResultOfAdding= driver.findElement(By.cssSelector("img[alt='طماطم سلطة']"));
    public WebElement completRequstBtn = driver.findElement(By.xpath("//*[@id=\"cart-items-table-container\"]/div[2]/div[3]/div/a"));
    WebElement codeTxt= driver.findElement(By.name("code"));
    WebElement CuponCodeTxt= driver.findElement(By.name("code"));
    WebElement ApplyCuponBtn= driver.findElement(By.cssSelector("button[class='site-btn']"));

    public void userCanCompletRequest()
    {
        completRequstBtn.click();
    }


}

