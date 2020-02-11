package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomtestcase {
@Test
public void f() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	PFactory PF=PageFactory.initElements(driver, PFactory.class);
	PF.loginmethod("wandringkesh@gmail.com","Test$123");
	}
}
