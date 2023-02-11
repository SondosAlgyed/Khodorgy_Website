package Tests;
import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import static Static.StaticData.mobile;
import static Static.StaticData.password;

public class TestBase
{
   /* HomePage home;
    LoginPage login;*/
    public static WebDriver driver;
    @BeforeTest
    public void open_Browser()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://khodorgy.com/?#");
        driver.manage().window().maximize();

    }
  /*  public void userLoggedSuccessfully()
    {
        home=new HomePage();
        home.userCanGoToLoginPage();
        login=new LoginPage();
        login.userCanLoginSuccessfully(mobile,password);
        Assert.assertTrue(login.resultLogin().isEnabled());
    }*/
    @AfterTest
    public void close_Browser()
    {
      // driver.quit();
    }


}
