package wikiTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WikiTest {
    WebDriver wiki;

    @BeforeMethod
    public void openWikiTest() {
        wiki = new ChromeDriver();
        wiki.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wiki.get("https://www.ebay.com");
    }

    @Test
    public void searchPenTest() throws InterruptedException {
        wiki.findElement(By.name("_nkw")).click();
        wiki.findElement(By.name("_nkw")).clear();
        wiki.findElement(By.name("_nkw")).sendKeys("pen" + Keys.ENTER);
        wiki.findElements(By.className("s-page no-touch skin-large srp--list-view no-touch skin-large gh-1199 gh-979 gh-939 gh-899 gh-799 gh-699 gh-599 gh-479"+Keys.ENTER));
        // wiki.findElement(By.id("gh-bt"n")).click();
        Thread.sleep(2000);
    }
        public void tearDawn(){
            wiki.quit();
        }
    }

