package project_automation_testing_pkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User_Personal_Details {

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

		// locate Personal Details tab
		driver.findElement(By.linkText("Personal Details")).click();
		Thread.sleep(1000);

		/// *******///

		// Locate the input field
		WebElement firstName = driver.findElement(By.name("firstName"));

		firstName.sendKeys(Keys.CONTROL + "a");
		firstName.sendKeys(Keys.DELETE);

		// Enter new data
		firstName.sendKeys("popo");

		// an explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement middleName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("middleName")));
		
		middleName.sendKeys(Keys.CONTROL + "A");
		middleName.sendKeys(Keys.DELETE);

		// Enter new data
		middleName.sendKeys("pp");

		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys(Keys.CONTROL + "A");
		lastName.sendKeys(Keys.DELETE);

		// Enter new data
		lastName.sendKeys("lulu");

		// Locate Nationality-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div[2]/div[4]/span"))
				.click();

		// Locate Marital Status-input field
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div[2]"))
				.click();

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