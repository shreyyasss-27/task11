import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "E:/Selenium/chromedriver-win64/chromedriver.exe"); // Update path as needed

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to GitHub
        driver.get("https://github.com");

        // Wait for 5 seconds to observe
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}