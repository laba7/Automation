import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by User on 04.04.2017.
 */
public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        WebDriver driver = new ChromeDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");
//        WebElement go = driver.findElement(By.name("go"));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("webinar.test@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement searchButton = driver.findElement(By.name("submitLogin"));
        searchButton.click();
        Thread mainThread = Thread.currentThread();
        mainThread.sleep(1000l);
        WebElement avatar = driver.findElement(By.className("employee_avatar_small"));
        avatar.click();
        WebElement exit = driver.findElement(By.className("icon-signout"));
        exit.click();
//        firefoxDriver.get("https://www.bing.com/");
//        By by = By.className("b_searchbox");
//        WebElement element = firefoxDriver.findElement(by);
//
//        firefoxDriver.quit();
      driver.quit();
    }
}
