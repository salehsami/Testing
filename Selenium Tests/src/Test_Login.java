import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Login {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "E:/uni/7 sem/DevOps/selenium/work/Assignment-3 devops/Selenium Tests/src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/Login");
        String pagesource = driver.getPageSource();
        boolean exists = pagesource.toLowerCase().contains(("Please Create an Account").toLowerCase());
        if (exists) {
            System.out.print("Reached Login page");
            driver.findElement(By.name("email")).sendKeys("qasimMalik123@gmail.com");
            driver.findElement(By.id("password")).sendKeys("qasim123");
            WebElement button = driver.findElement(By.tagName("button"));
            Thread.sleep(3000);
            button.click();
            Thread.sleep(5000);
            driver.quit();
        } else {
            System.out.println("Couldn't reach to the Login page");
        }

    }

}