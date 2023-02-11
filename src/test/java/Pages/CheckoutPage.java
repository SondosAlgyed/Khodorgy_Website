package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import static Tests.TestBase.driver;

public class CheckoutPage extends PageBase
{
    Select select;
    WebElement dliveryTime= driver.findElement(By.id("perfered_delivery_time_id"));
    WebElement cashBtn= driver.findElement(By.xpath("(//span[contains(@class,'checkmark')])[1]"));
    WebElement bankBtn= driver.findElement(By.id("bank"));
    WebElement walletBtn= driver.findElement(By.id("wallet"));
   WebElement confirmOrderBtn= driver.findElement(By.xpath("//button[contains(text(),'تأكيد الطلب')]"));

    public void userCanPayied ()
    {
      select=new Select(dliveryTime);
      select.selectByIndex(2);
      cashBtn.click();
      confirmOrderBtn.click();

    }





}
