package project_automation_testing_pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Create an instance of LoginPage and perform login
		Adm_LoginPage admLoginPage = new Adm_LoginPage(driver);
		admLoginPage.login("Admin", "admin123");

		// locate PIM element

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();

		// locate Add button
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();

		
		// locate uploadButton

		WebElement uploadButton = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']"));
		uploadButton.click();

		WebElement uploadPic = driver.findElement(By.xpath("//input[@type='file']"));
		uploadPic.sendKeys("C:\\Users\\dazzv\\OneDrive\\Desktop\\PRJ_AUTM\\asset\\propic1.jpeg");
		Thread.sleep(2000);

		// for closing upload window
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

		// Locate the input field
		driver.findElement(By.name("firstName")).sendKeys("popo");
		driver.findElement(By.name("middleName")).sendKeys("pp");
		driver.findElement(By.name("lastName")).sendKeys("lulu");

		Thread.sleep(2000);

		// Locate the input field
		WebElement inputField = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));

		// Clear the input field by selecting all and then deleting
		inputField.sendKeys(Keys.CONTROL + "a");
		inputField.sendKeys(Keys.DELETE);

		// Enter new data
		inputField.sendKeys("1001");

		// Submit the form
		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		Thread.sleep(1000);

		// Locate the otherID-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"))
				.sendKeys("OTH-123456");

		// Locate Driver's License Number-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"))
				.sendKeys("DV123456");

		// Locate License Expiry Date-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"))
				.sendKeys("2025-12-02");

		// Locate Nationality-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[4]/span"))
				.click();
		Thread.sleep(1000);

		// Locate Marital Status-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]"))
				.click();
		Thread.sleep(1000);

		// Locate Date of Birth-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"))
				.sendKeys("2000-10-02");

		Thread.sleep(1000);

		// Locate Gender-input field

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span"))
				.click();

		// Locate and click the save button
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"))
				.submit();

		Thread.sleep(1000);

		// Close the browser window
		driver.quit();

	}
}