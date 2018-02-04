package cucumber_steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfter {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void afterTest() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
