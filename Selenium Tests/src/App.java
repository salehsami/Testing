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

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Running X2");
//         System.setProperty("webdriver.chrome.driver",
//                 "E:/uni/7 sem/DevOps/selenium/work/first-test/src/drivers/chromedriver.exe");
//         WebDriver driver = new ChromeDriver();
//         driver.get("https://www.youtube.com/watch?v=sxmwGdZbV-Y");
//         driver.findElement(By.className("ytd-searchbox-spt")).sendKeys("how to make an egg");
//         Thread.sleep(4000);
//         driver.findElement(By.id("search-icon-legacy")).click();
//         // Driver.getClass("ytd-searchbox-spt");
//         Thread.sleep(4000);
//         driver.quit();
//     }
// }

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Running X2");
        System.setProperty("webdriver.chrome.driver",
                "E:/uni/7 sem/DevOps/selenium/work/first-test/src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/watch?v=sxmwGdZbV-Y");
        Thread.sleep(2000); // Adding a short delay to let the page load completely

        driver.findElement(By.className("ytd-searchbox-spt")).sendKeys("how to make an egg");
        Thread.sleep(4000);

        WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
        searchButton.click();

        Thread.sleep(4000); // Adding a delay to observe the search results

        driver.quit();
    }
}
