import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        //open site
        driver.get("https://en.wikipedia.org");

    }

    @AfterClass

    public void terDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}