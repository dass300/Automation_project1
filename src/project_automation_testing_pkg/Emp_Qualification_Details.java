package project_automation_testing_pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Emp_Qualification_Details {

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
		//// *****/////

		// locate PIM element
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();

		// Locate the Employee Id-input field for search
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("1001");
		Thread.sleep(1000);

		// Submit the search button
		driver.findElement(By.xpath("//button[text()=' Search ']")).submit();
		Thread.sleep(1000);

		// Locate the searched item to click
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div"))
				.click();
		Thread.sleep(1000);

		// Locate the qualification item button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[9]/a"))
				.click();
		Thread.sleep(1000);

		//// *****/////

		// Locate the Work Experience add button
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button")).click();
		// Locate the Company-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"))
				.sendKeys("ABC Company");
		// Locate the Job Title-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("Jr.Engineer");
		
		// Locate the period From-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input"))
				.sendKeys("2020-05-05");
		// Locate the period To-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input"))
				.sendKeys("2022-03-03");
		// Locate the Comment-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div/div/div/div[2]/textarea"))
				.sendKeys(
						"\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"
								+ " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.");
		// Submit the save button
		driver.findElement(By
				.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]"))
				.click();
		Thread.sleep(1000);

		//// *****/////

		// Locate the Experience add button(for multiple experiences)
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button")).click();

		// Locate the Company-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"))
				.sendKeys("ABC Company");
		// Locate the Job Title-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("Jr.Engineer");
		
		// Locate the period From-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input"))
				.sendKeys("2020-05-05");
		// Locate the period To-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input"))
				.sendKeys("2022-03-10");
		// Locate the Comment-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div/div/div/div[2]/textarea"))
				.sendKeys(
						"\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore"
								+ " et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.");

		// Submit the save button
		driver.findElement(By
				.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/form/div[4]/button[2]"))
				.click();
		Thread.sleep(1000);
		//// *****/////

		// delete selected details
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div[2]/div/div[7]/div/button[1]/i"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]")).click();
		//// *****/////

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

		// Locate the Skills- add button
		driver.findElement(

				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/div/button")).click();

		// Locate the skill select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[1]/div[2]"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[7]/span"))
				.click();
		
		// Locate the Years of Experience field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("05");
		// Locate the Comments field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[2]/div/div/div/div[2]/textarea"))
				.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.");

		// Submit the save button
		driver.findElement(By
				.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]/form/div[3]/button[2]"))
				.click();
		Thread.sleep(1000);
		//// *****/////

		
		
		

		
		//// *****/////
		// Locate the Languages-add button
		WebElement button = driver.findElement(By.xpath("(//button[text()=' Add ' and @type='button'])[4]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(button).click().perform();
		Thread.sleep(1000);

		// Locate the Languages-select filed
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[1]/div[2]/i"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[4]/span"))
				.click();

		// Locate the Fluency-select filed
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div[2]/div[3]/span"))
				.click();
		

		// Locate the Competency-select filed
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[4]/span"))
				.click();

		// Locate the Comments field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[2]/div/div/div/div[2]/textarea"))
				.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.");

		// Submit the save button
		driver.findElement(By
				.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]/form/div[3]/button[2]"))
				.click();
		Thread.sleep(1000);
		//// *****/////

		// Locate the License-add button
		driver.findElement(
				By.xpath("(//button[text()=' Add ' and @type='button'])[5]")).click();
		// Locate the License Type-select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i"))
				.click();

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[6]/span"))
				.click();
		// Locate the License Number-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("LCN-123456");
		// Locate the Issued Date-select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/input"))
				.sendKeys("2023-05-02");
		// Locate the Expiry Date-select field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/input"))
				.sendKeys("2025-10-05");

		// Submit the save button
		driver.findElement(By
				.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]/form/div[3]/button[2]"))

				.click();
		Thread.sleep(1000);

		//// *****/////

		// Locate the Attachments-add button
		driver.findElement(
				By.xpath("(//button[text()=' Add ' and @type='button'])[6]")).click();

		// locate uploadButton

		WebElement uploadButton = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));
		uploadButton.click();

		WebElement uploadfile = driver.findElement(By.xpath("//input[@type='file']"));
		uploadfile.sendKeys("C:\\Users\\dazzv\\OneDrive\\Desktop\\PRJ_AUTM\\asset\\Attachment01.pdf");
		Thread.sleep(2000);

		// for closing upload window
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);

		// Locate the Comments field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[2]/div/div/div/div[2]/textarea"))
				.sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt.");

		// Submit the save button
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]/div/form/div[3]/button[2]"))
				.click();
		

		//// *****/////

		Thread.sleep(1000);

		// Close the browser window
		 driver.quit();

	}
}