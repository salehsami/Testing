import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Register {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "E:/uni/7 sem/DevOps/selenium/work/Assignment-3 devops/Selenium Tests/src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/register");
        String pagesource = driver.getPageSource();
        boolean exists = pagesource.toLowerCase().contains(("Please Create an Account").toLowerCase());

        if (exists) {
            System.out.print("Reached Register page");
            driver.findElement(By.id("name")).sendKeys("Sir Qasim Malik");
            driver.findElement(By.id("email")).sendKeys("qasimMalik123@gmail.com");
            driver.findElement(By.id("password")).sendKeys("qasim123");
            driver.findElement(By.id("password2")).sendKeys("qasim123");
            Thread.sleep(4000);
            WebElement button = driver.findElement(By.tagName("button"));
            button.click();

        } else {
            System.out.println("Couldn't reach to the Register page");
        }
    }
}