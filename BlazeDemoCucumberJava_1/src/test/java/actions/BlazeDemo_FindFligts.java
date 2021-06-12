package actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pages.BlazeDemo_FindFligtsPage;

public class BlazeDemo_FindFligts {

	public static WebDriver driver;
	public static BlazeDemo_FindFligtsPage ref;
	
		
	@Given("^The Web Browser is open$")
	public void the_web_browser_is_open() throws Exception {
		String project_loc = System.getProperty("user.dir");
		//System.out.println("Project Location is: " + project_loc);
		System.setProperty("webdriver.chrome.driver",project_loc+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("driver="+driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	

	}

	@SuppressWarnings("deprecation")
	@And("^the user launches BlazeDemo URL$")
	public void the_user_launches_blaze_demo_url() throws InterruptedException {
		driver.navigate().to("http://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

		
	@Then("^the user lands on BlazeDemo page successfully$")
	public void the_user_lands_on_blaze_demo_page_successfully() {

		driver.findElement(By.name("fromPort")).isDisplayed();
		System.out.println("user lands successfully");
	}

	@And("^the user selects (.*) and (.*)$")
	public void the_user_selects_departure_and_destination(String departure, String destination) {

		ref = new BlazeDemo_FindFligtsPage(driver);

		ref.selectDepCity(departure);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		ref.selectDesCity(destination);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@And("^user clicks on Find Flight button$")
	public void user_clicks_on_find_flight_button() {
		System.out.println("ref status="+ref);
		ref.flightButtonClick();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Then("^user is navigated to Flights reserve page$")
	public void user_is_navigated_to_flights_reserve_page() {
		ref.confirmResPage();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.close();
//		driver.quit();
	}

}
