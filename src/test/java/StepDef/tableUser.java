package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tableUser {
	WebDriver driver=null;
	@Given("User opens the application")
	public void user_opens_the_application1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}

	@When("User clicks on the signin link")
	public void user_clicks_on_the_signin_link1() {
		driver.findElement(By.linkText("Log in")).click();
	}

	@When("User eneters {string} and {string}")
	public void user_eneters_and1(String username, String password) {
		driver.findElement(By.id("Email") ).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@Then("User will click on Login Button")
	public void user_will_click_on_Login_Button1() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}
	
	@Then("Demo webshop homepage will be displayed")
	public void demo_webshop_homepage_will_be_displayed() {
		System.out.println("verify demo webshop login page is displayed");
	    System.out.println("verify the page name is "+ driver.getTitle());
	    driver.close();
	}
	
}
