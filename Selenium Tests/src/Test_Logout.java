import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Logout {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "E:/uni/7 sem/DevOps/selenium/work/Assignment-3 devops/Selenium Tests/src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/Login");
        String pagesource = driver.getPageSource();
        boolean exists = pagesource.toLowerCase().contains(("Login to your Account").toLowerCase());

        if (exists) {
            System.out.print("Reached Login page");
            driver.findElement(By.name("email")).sendKeys("qasimMalik123@gmail.com");
            driver.findElement(By.id("password")).sendKeys("qasim123");
            WebElement button = driver.findElement(By.tagName("button"));
            Thread.sleep(2000);
            button.click();
            Thread.sleep(1000);
            boolean dashboard = pagesource.toLowerCase().contains(("Dashboard").toLowerCase());

            if (dashboard) {
                System.out.println("Reached Dashboard page");
                WebElement logout = driver.findElement(By.id("logoutbtn"));
                Thread.sleep(2000);
                logout.click();
                Thread.sleep(2000);
                System.out.println("Loged out Successfully");
                driver.quit();

            } else {
                System.out.println("Couldn't reach to the Dashboard page");
            }
            // driver.quit();
        } else {
            System.out.println("Couldn't reach to the Login page");
        }

    }

}