package video01;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Video01_OpenBrowser {
	
	@Parameters("Browser")
	@Test
	public void f(String browserName) throws Exception {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
       else if(browserName.equalsIgnoreCase("Edge")){
    	   WebDriverManager.edgedriver().setup();
    	   driver=new EdgeDriver();
		}
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
