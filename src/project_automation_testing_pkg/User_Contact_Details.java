package project_automation_testing_pkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Contact_Details {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the Chrome browser driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window to fit the screen
		driver.manage().window().maximize();

		// Set up an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Create an instance of LoginPage and perform login
		ESS_User_Login essUserLogin = new ESS_User_Login(driver);
		essUserLogin.userLogin("POpolulu123", "POpolulu123");

		/// *******///
		// locate Myinfo tab
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();

		// locate Contact Details tab
		driver.findElement(By.linkText("Contact Details")).click();
		Thread.sleep(1000);
		/// *******///

		// locate Street 1- input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"))
				.sendKeys("street01");

		// locate Street 2- input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("street02");

		// locate City- input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input"))
				.sendKeys("vicecity");

		// locate State/Province- input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"))
				.sendKeys("alabama");

		// locate Zip/Postal Code- input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"))
				.sendKeys("666050");

		// locate Country-fileld
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div[4]/span"))
				.click();

		// locate Home - field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input"))
				.sendKeys("102030");

		// locate Mobile -field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"))
				.sendKeys("1234567");

		// locate Work -field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"))
				.sendKeys("302050");

		// locate Email- field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"))
				.sendKeys("popo@gmail.com");

		// locate Other Email- field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input"))
				.sendKeys("popo@outlook.com");

		// locate Other Email- field
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();

		/// *******///
		
		Thread.sleep(1000);
		// Close the browser window
		driver.quit();

	}
}