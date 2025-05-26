package OpenBrowser;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenOrangeHRM {
	@Parameters("Browser")
	@Test
	public void open(String browserName)
	{
		System.out.println("Parameter name is "+ browserName);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("OrangeHRM opened successfully!!!!");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.quit();
		System.out.println("Browser closed Succesfully!!!");
	}
}
