package project_automation_testing_pkg;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ESS_User_Signup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Initialize the Chrome browser driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window to fit the screen
		driver.manage().window().maximize();

		// Set implicit wait to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Create an instance of LoginPage and perform login
		Adm_LoginPage loginPage = new Adm_LoginPage(driver);
		loginPage.login("Admin", "admin123");

		//// *****/////

		// locate Admin element
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(1000);

		// locate Add button
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(1000);

		// Locate the user role select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[1]/div[2]/i"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[3]/span"))
				.click();

		// Locate the Employee Name-input field
		driver.findElement(By
				.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"))
				.sendKeys("popo pp lulu");
		Thread.sleep(2000);
		
		// Locate the searched Employee Name
				driver.findElement(By
						.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div/span"))
				.click();
				Thread.sleep(1000);
		
		

		// Locate the Status select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span"))
				.click();

		// Locate the Username-input field
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"))
				.sendKeys("POpolulu123");

		// Locate the password-input field
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"))
				.sendKeys("POpolulu123");

		// Locate the Confirm Password-input field
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"))
				.sendKeys("POpolulu123");

		// Submit the search button
		driver.findElement(By.xpath("//button[text()=' Save ']")).submit();
		Thread.sleep(2000);

		//// *****/////

		// Close the browser window
		driver.quit();

	}
}