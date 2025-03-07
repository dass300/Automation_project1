package project_automation_testing_pkg;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adm_Myinfo_Check_Availability {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Initialize the Chrome browser driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window to fit the screen
		driver.manage().window().maximize();

		// Set implicit wait to allow elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Create an instance of LoginPage and perform login
		Adm_LoginPage admLoginPage = new Adm_LoginPage(driver);
		admLoginPage.login("Admin", "admin123");

		/// *******///

		// locate Myinfo tab
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();

		// locate Personal Details tab
		driver.findElement(By.linkText("Personal Details")).click();
		Thread.sleep(1000);

		// update Personal Details

		// locate Driver License Number input field
		WebElement license = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
		license.sendKeys(Keys.CONTROL + "a");
		license.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		// Enter new data
		license.sendKeys("DL-10-2025-1234567");
		Thread.sleep(1000);

		// save the changes
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(1000);
		/// *******///

		// locate Contact Details tab
		driver.findElement(By.linkText("Contact Details")).click();
		Thread.sleep(1000);

		// update Contact Details Details

		// locate Work Email -input field
		WebElement email = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"));
		email.sendKeys(Keys.CONTROL + "a");
		email.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		// Enter new data
		email.sendKeys("demo@gmail.com");
		Thread.sleep(1000);

		// save the changes
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		Thread.sleep(1000);
		/// *******///

		// locate Job tab
		driver.findElement(By.linkText("Job")).click();

		// update Job Details

		// cannot update any details

		// locate Salary tab
		driver.findElement(By.linkText("Salary")).click();
		// update Contact Details Details

		// cannot update any details

		// locate Qualifications tab
		driver.findElement(By.linkText("Qualifications")).click();
		// update Contact Details Details

		// Locate the Education add button
		driver.findElement(

				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button")).click();

		// Locate the Level select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[1]/div[2]/i"))
				.click();

		// Locate the option for Level select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/span"))
				.click();

		// Locate the Institute-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("ABC coleage of Engineering");

		// Locate the Major/Specialization -input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[3]/div/div[2]/input"))
				.sendKeys("Computer science");

		// Locate the Year -input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"))
				.sendKeys("2019");
		// Locate the GPA/Score -input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"))
				.sendKeys("80%");

		// Locate the Start Date -input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div[1]/input"))
				.sendKeys("2015-06-06");

		// Locate the End Date -input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input"))
				.sendKeys("2019-03-03");

		// Submit the save button
		driver.findElement(By
				.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/form/div[3]/button[2]"))
				.click();
		Thread.sleep(1000);
		//// *****/////

		// Close the browser window
		 driver.quit();

	}
}