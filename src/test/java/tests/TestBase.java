package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.Helper;

import java.io.IOException;

public class TestBase {

   public static WebDriver driver;

    @BeforeSuite
    @Parameters({"browser"})
    public void StartDraiver( @Optional("chrome") String browserName){

        if(browserName.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--no-sandbox");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--allow-running-insecure-content");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-extensions");
            options.addArguments("--incognito");
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

        }

        else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--no-sandbox");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--allow-running-insecure-content");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-extensions");
            options.addArguments("--incognito");
            options.addArguments("--remote-allow-origins=*");
            driver = new FirefoxDriver(options);
            
        }

        else if (browserName.equalsIgnoreCase("edgedriver")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--no-sandbox");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--allow-running-insecure-content");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-extensions");
            options.addArguments("--incognito");
            options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);

        }


        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @AfterSuite
    public void CloseDriver(){
        driver.close();
    }

    // take screenshot when test cases fails
    @AfterMethod
    public void screenshotOnfailure(ITestResult Result) throws IOException {
        if(Result.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("!Failed");
            System.out.println("Taking ScreenShot ....");
            Helper.captureScreenshot(driver, Result.getName());
        }
    }
}
