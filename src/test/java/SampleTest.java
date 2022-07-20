import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SampleTest {

    // protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    // public static String remote_url_chrome = "http://localhost:4444/wd/hub";

    @Test
    public void test() throws MalformedURLException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        WebDriver driver=new ChromeDriver();
        //   ChromeOptions options = new ChromeOptions();
        //   driver.set(new RemoteWebDriver(new URL(remote_url_chrome), options));
        driver.navigate().to("https://www.facebook.com/login/");
        Thread.sleep(5000);
        System.out.println("This is executed");


        //testrampseejenkinsfile


        //sample
    }

}
