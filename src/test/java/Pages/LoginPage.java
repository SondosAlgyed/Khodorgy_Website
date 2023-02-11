package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static Tests.TestBase.driver;

public class LoginPage
{
    WebElement mobileTxt= driver.findElement(By.name("mobile"));
    WebElement passwordTxt= driver.findElement(By.name("password"));
    WebElement loginBtn= driver.findElement(By.cssSelector("button.site-btn"));
     public void userCanLoginSuccessfully(String mobile ,String password)
     {
         mobileTxt.sendKeys(mobile);
         passwordTxt.sendKeys(password);
         loginBtn.click();
     }
     public WebElement resultLogin()
     {
         return driver.findElement(By.cssSelector("a[title='خروج']"));
     }
    WebElement registerBtn= driver.findElement(By.linkText("إنشاء حساب جديد"));
    public void userCanGoToRegisterPage()
    {
            registerBtn.click();
    }



}
