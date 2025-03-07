package project_automation_testing_pkg;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_MyInfo_feature_availability {

	public static void main(String[] args) throws InterruptedException {
		// Initialize the Chrome browser driver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window to fit the screen
		driver.manage().window().maximize();

		// Set implicit wait to allow elements to load
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

		// locate Contact Details tab
		driver.findElement(By.linkText("Contact Details")).click();
		Thread.sleep(1000);

		// locate Emergency Contacts tab
		driver.findElement(By.linkText("Emergency Contacts")).click();
		Thread.sleep(1000);

		// locate Dependents tab
		driver.findElement(By.linkText("Dependents")).click();
		Thread.sleep(1000);

		// locate Immigration tab
		driver.findElement(By.linkText("Immigration")).click();
		Thread.sleep(1000);

		// locate Job tab
		driver.findElement(By.linkText("Job")).click();
		Thread.sleep(1000);

		// locate Salary tab
		driver.findElement(By.linkText("Salary")).click();
		Thread.sleep(1000);

		// locate Report-to tab
		driver.findElement(By.linkText("Report-to")).click();
		Thread.sleep(1000);

		// locate Qualifications tab
		driver.findElement(By.linkText("Qualifications")).click();
		Thread.sleep(1000);

		// locate Memberships tab
		driver.findElement(By.linkText("Memberships")).click();
		Thread.sleep(1000);
		/// *******///

		Thread.sleep(1000);

		// Close the browser window
		driver.quit();

	}
}