package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class registrations {
	WebDriver driver=null;
	@Given("Iam on the Demo Web Shop Page")
	public void iam_on_the_Demo_Web_Shop_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
	}

	@Then("I click on the Register link in the header of the page")
	public void i_click_on_the_Register_link_in_the_header_of_the_page() {
		driver.findElement(By.xpath("//a[@href='/register']")).click();
	}

	@Then("I should be on the register page")
	public void i_should_be_on_the_register_page() {
		System.out.println("verify demo webshop registrations page is displayed");
	    System.out.println("verify the page name is "+ driver.getTitle());
	}

	@Then("click on the female radio button")
	public void click_on_the_female_radio_button() {
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	}

	@Then("Fill in the First Name field as Aurora")
	public void fill_in_the_First_Name_field_as_Aurora() {
		driver.findElement(By.id("FirstName") ).sendKeys("Aurora");
	}

	@Then("Fill in the Last Name field as Jackson")
	public void fill_in_the_Last_Name_field_as_Jackson() {
		driver.findElement(By.id("LastName") ).sendKeys("Jackson");
	}

	@Then("Fill in the email field as jackson.aurora@aol.com")
	public void fill_in_the_email_field_as_jackson_aurora_aol_com() {
		driver.findElement(By.id("Email") ).sendKeys("jackson.aurora@gmail.com");
	}

	@Then("Fill in the password field as Test$123")
	public void fill_in_the_password_field_as_Test$123() {
		driver.findElement(By.id("Password") ).sendKeys("Test$123");
	}

	@Then("Fill in the confirm password field as Test$123")
	public void fill_in_the_confirm_password_field_as_Test$123() {
		driver.findElement(By.id("ConfirmPassword") ).sendKeys("Test$123");
	}

	@Then("click on the register button")
	public void click_on_the_register_button() {
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
	}
	@Then("verify Toast Message exists on page")
	public void verify_Toast_Message_exists_on_page() {
		driver.findElement(By.xpath("//div[@class='result']"));
	}
}
