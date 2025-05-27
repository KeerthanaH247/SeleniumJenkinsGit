package Youtube;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Mukesh Otwani");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.quit();

	}

}
