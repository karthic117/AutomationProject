package SeleniumWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTestcase {
public static void main(String[] args) {
	String driverPath = "C:/Users/ADMIN/Downloads/";
	System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	 
	
	driver.get("http://toolsqa.com/selenium-webdriver/first-test-case/");
	driver.close();
}
	
	
	
}
