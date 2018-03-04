package SeleniumWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
	private static WebDriver driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		String driverPath = "C:/Users/ADMIN/Downloads/";
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
	    driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    driver.get("http://toolsqa.wpengine.com/automation-practice-form");

	    driver.findElement(By.id("photo")).click();

	    Runtime.getRuntime().exec("D:\\karthic\\Karthic Selenium-software\\AutoIt3\\SciTE\\FileUpload.exe");

	    Thread.sleep(5000);

	    driver.close();

	}
}



