package project_automation_testing_pkg;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adm_Login_InValid_Credentials {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the Chrome browser driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window to fit the screen
		driver.manage().window().maximize();

		// Set implicit wait to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Create an instance of LoginPage and perform login
		Adm_LoginPage admLoginPage = new Adm_LoginPage(driver);
		admLoginPage.login("admin", "Stctvm@123");
		
		Thread.sleep(1000);

		// Close the browser window
		driver.quit();

	}
}