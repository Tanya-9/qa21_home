import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchTests extends TestBase {


    @Test
    public void searchWikiTestJava() throws InterruptedException {
        click(By.name("search"));
        Thread.sleep(2000);
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("Java");
        Thread.sleep(3000);
        click(By.name("go"));
        Thread.sleep(4000);
    }

    @Test
    public void searchWikiTestQA() throws InterruptedException {
        click(By.name("search"));
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("QA");
        Thread.sleep(3000);
        click(By.name("go"));


    }


}

