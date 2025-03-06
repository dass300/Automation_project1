package project_automation_testing_pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login_Valid_Credentials {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the Chrome browser driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window to fit the screen
		driver.manage().window().maximize();

		// Set implicit wait to allow elements to load
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Create an instance of LoginPage and perform login
		ESS_User_Login essUserLogin = new ESS_User_Login(driver);
		essUserLogin.userLogin("POpolulu123", "POpolulu123");
		Thread.sleep(2000);

		// Close the browser window
		driver.quit();

	}

}
