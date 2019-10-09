import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
    public void logiinTest() throws InterruptedException {
        //init login
        click(By.id("pt-login"));
//fill login
        click(By.name("wpName"));
        Thread.sleep(3000);
        driver.findElement(By.name("wpName")).clear();
        driver.findElement(By.name("wpName")).sendKeys("gdhfjf@jfjf.com");

        click(By.name("wpPassword"));
        Thread.sleep(2000);
        driver.findElement(By.name("wpPassword")).clear();
        driver.findElement(By.name("wpPassword")).sendKeys("6543210987");

        //confirm login
        click(By.id("wpLoginAttempt"));

    }


}
