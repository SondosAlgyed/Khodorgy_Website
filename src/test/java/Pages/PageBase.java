package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Tests.TestBase.driver;

public class PageBase
{
    static WebDriverWait wait;
    public void actionClick(By locator)
    {
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        try
        {
            element.click();
        }
        catch
        (Exception e)
        {
            driver.findElement(locator).click();
        }
    }
}
