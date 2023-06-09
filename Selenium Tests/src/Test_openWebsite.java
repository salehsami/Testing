// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.bidi.log.Log;
// import org.openqa.selenium.chrome.ChromeDriver;

// // public class App {
// // public static void main(String[] args) throws Exception {
// // // System.out.println("Hello, World!");
// // System.setProperty("webdriver.chrome.driver",
// // "E:/uni/7
// sem/DevOps/selenium/work/first-test/src/drivers/chromedriver.exe");
// // WebDriver driver = new ChromeDriver();
// // driver.get("https://www.google.com");
// // System.out.println(driver.getTitle());
// // Thread.sleep(1000);
// // driver.quit();
// // }
// // }

// public class App {
// public static void main(String[] args) throws Exception {
// System.out.println("Running");
// System.setProperty("webdriver.chrome.driver",
// "E:/uni/7 sem/DevOps/selenium/work/first-test/src/drivers/chromedriver.exe");
// WebDriver Driver = new ChromeDriver();
// Driver.get("https://www.youtube.com/watch?v=sxmwGdZbV-Y");
// System.out.println(Driver.getTitle());
// Thread.sleep(1000);
// Driver.quit();
// }
// }

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_openWebsite {
    public static void main(String[] args) throws Exception {
        System.out.println("Running X2");
        System.setProperty("webdriver.chrome.driver",
                "E:/uni/7 sem/DevOps/selenium/work/Assignment-3 devops/Selenium Tests/src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        // driver.findElement(By.className("ytd-searchbox-spt")).sendKeys("how to make
        // an egg");
        Thread.sleep(4000);
        // driver.findElement(By.id("search-icon-legacy"));
        // Thread.sleep(4000);
        driver.quit();
    }
}