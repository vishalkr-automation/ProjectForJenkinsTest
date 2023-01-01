package video01;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Video01_OpenBrowser {
	@Test
	public void f() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Wait commands
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(1));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(1000));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
