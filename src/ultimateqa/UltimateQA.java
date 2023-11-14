package ultimateqa;
/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class UltimateQA {

    static String baseUrl = "https://courses.ultimateqa.com/";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {

        // Step 1: Setup browser
        if (browser.trim().equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.trim().equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.trim().equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser");
        }

        // Step 2: Open URL
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        // Step 3: Print title of the page
        System.out.println("Title of the page: " + driver.getTitle());

        // Step 4: Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Step 5: Print the page resource
        System.out.println("Page resources: " + driver.getPageSource());

        // Step 6: Click on ‘Sign In’ link
        driver.findElement(By.cssSelector("a[href^='/users/sign_in']")).click();

        // Step7: Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Step 8: Enter email to the email field
        driver.findElement(By.id("user[email]")).sendKeys("hiren.italia@gmail.com");

        // Step 9: Enter password to the password field
        driver.findElement(By.id("user[password]")).sendKeys("Hiren123");

        // Step 10: Click on login button
        driver.findElement(By.cssSelector("button[type^='submit']")).click();

        // Step 11: Navigate to base URL
        driver.navigate().to(baseUrl);

        // Step 12: Navigate forward to Homepage
        driver.navigate().forward();

        // Step 13: Navigate back to base URL
        driver.navigate().back();

        // Step 14: Refresh the page
        driver.navigate().refresh();

        // Step 15: Close the browser
        driver.quit();

    }
}
