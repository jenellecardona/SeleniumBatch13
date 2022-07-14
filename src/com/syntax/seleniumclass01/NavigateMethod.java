
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {//<== this must be added when you add "Thread.sleep()"
    System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        Thread.sleep(4000);//4000=4 sec pause
        driver.navigate().forward();
        Thread.sleep(4000);//
        driver.navigate().refresh();
        //driver.close(); will close the current tab
        //driver.quit(); will close the whole browser
    }
}
