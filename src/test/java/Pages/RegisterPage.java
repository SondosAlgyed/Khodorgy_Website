package Pages;

import Tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Tests.TestBase.driver;
import static java.awt.SystemColor.text;

public class RegisterPage
{
    WebElement nameTxt=driver.findElement(By.id("name"));
    WebElement passwordTxt= driver.findElement(By.id("password1"));
    WebElement confirmPasswordTxt= driver.findElement(By.id("password2"));
    WebElement AddressTxt= driver.findElement(By.cssSelector("input[name='description']"));
    WebElement mobileTxt= driver.findElement(By.id("mobile"));
    WebElement purposemobileTxt= driver.findElement(By.id("mobile2"));
    WebElement SelectCounty= driver.findElement(By.id("city"));
    WebElement SelectArea= driver.findElement(By.cssSelector("select[id='area']"));
    WebElement registerBtn= driver.findElement(By.cssSelector("button.site-btn"));
    Select select;

    public void userCanRegister(String name ,String mobile ,String password ,String Address)
    {
       nameTxt.sendKeys(name);
       mobileTxt.sendKeys(mobile);
       purposemobileTxt.sendKeys(mobile);
       passwordTxt.sendKeys(password);
       confirmPasswordTxt.sendKeys(password);
       AddressTxt.sendKeys(Address);
       select=new Select(SelectCounty);
       select.selectByIndex(1);
       registerBtn.click();
       select=new Select(SelectArea);
       select.selectByIndex(3);
       registerBtn.click();

    }
}
