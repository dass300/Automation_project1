package project_automation_testing_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Adm_LoginPage {

	WebDriver driver;

	// Constructor to initialize WebDriver and WebDriverWait
	public Adm_LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	// Reusable method for login
	public void login(String username, String password) throws InterruptedException {
		// Navigate to the OrangeHRM login page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Locate the username input field and enter the username
		driver.findElement(By.name("username")).sendKeys(username);

		// Locate the password input field and enter the password
		driver.findElement(By.name("password")).sendKeys(password);

		// Locate and click the login button
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		// Pause execution for 2 seconds for demonstration purposes
		Thread.sleep(1000);
	}
}
