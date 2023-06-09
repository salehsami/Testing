import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Auth {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "E:/uni/7 sem/DevOps/selenium/work/Assignment-3 devops/Selenium Tests/src/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
        String pagesource = driver.getPageSource();
        boolean exists = pagesource.toLowerCase().contains(("Goals Dashboard").toLowerCase());
        if (exists) {
            System.out.print("Reached Dashboard page");
            Thread.sleep(5000);
            driver.quit();
        } else {
            System.out.println("Couldn't reach to the Dashboard page");
            System.out.println("Authentication is Working");
            driver.quit();
        }

    }

}