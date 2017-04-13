import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by User on 07.04.2017.
 */
public class ScriptB {


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
        mainThread.sleep(2000l);

//        WebElement dashboard = driver.findElement(By.id("subtab-AdminParentOrders"));
//        dashboard.click();
//        WebElement title = driver.findElement(By.className("title"));
//        System.out.println(title.getText());
//        driver.navigate().refresh();
//        mainThread.sleep(1000l);
//        WebElement title1 = driver.findElement(By.className("title"));
//        System.out.println(title1.getText());
        ArrayList<String> className = new ArrayList<String>();
        className.add(0, "tab-AdminDashboard");
        className.add(1, "subtab-AdminParentOrders");
        className.add(2, "subtab-AdminCatalog");
        className.add(3, "subtab-AdminParentCustomer");
        className.add(4, "subtab-AdminParentCustomerThreads");
        className.add(5, "subtab-AdminStats");
        int i;
        for(i = 0; i < 6; i++) {

            WebElement dashboard = driver.findElement(By.id(className.get(i)));
            dashboard.click();
            if( i == 2){
                WebElement title = driver.findElement(By.className("title"));
                System.out.println(title.getText());

                driver.navigate().refresh();
                mainThread.sleep(1000l);
                WebElement title1 = driver.findElement(By.className("title"));
                System.out.println(title1.getText());

                WebElement problem = driver.findElement(By.className("link-levelone"));
                problem.click();
                mainThread.sleep(1000l);
            } else {
                WebElement title = driver.findElement(By.className("page-title"));
                System.out.println(title.getText());

                driver.navigate().refresh();
                mainThread.sleep(1000l);
                WebElement title1 = driver.findElement(By.className("page-title"));
                System.out.println(title1.getText());
                mainThread.sleep(1000l);
//            String page = title.getText();
//            String page2 = title1.getText();
//            System.out.println(page);
//            boolean text = page == page2;
//            if (text == false){
//                System.out.println("После обновления страница изменилась!");
//            }
            }
        }
    }

    public static void  refreshPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread mainThread = Thread.currentThread();
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);

        mainThread.sleep(1000l);
        WebElement title1 = driver.findElement(By.className("title"));
        System.out.println(title1.getText());
    }

}
