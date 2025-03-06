package project_automation_testing_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl_Class {

	public static void main(String[] args) throws InterruptedException {

		// Initialize the Chrome browser driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window to fit the screen
		driver.manage().window().maximize();

		// Navigate to the OrangeHRM login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Pause execution for 2 seconds for demonstration purposes
		Thread.sleep(3000);

		// Close the browser window
		driver.quit();

	}

}
