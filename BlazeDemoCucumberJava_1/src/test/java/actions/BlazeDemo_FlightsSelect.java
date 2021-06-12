package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import genericFunctions.GenericMethods;
import io.cucumber.java.en.*;
import pages.BlazeDemo_FindFligtsPage;
import pages.BlazeDemo_FlightSelectPage;

public class BlazeDemo_FlightsSelect {

	public static WebDriver driver = null;
	public static BlazeDemo_FlightSelectPage selflgt;

	@And("^user choose one of the flight for booking by clicking on Choose this flight button$")
	public void user_choose_one_of_the_flight_for_booking_by_clicking_on_choose_this_flight_button() {
		System.out.println("selflgt="+selflgt);
		selflgt.chooseFlight();

		//	By btn = By.xpath("//tbody/child::tr[1]/child::td[2]/preceding-sibling::td[1]/input[@type='submit']");
		//	driver.findElement(btn).submit();
		//	System.out.println("button"+btn);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//	btn.click();
	}

	@Then("^user is navigated to Flights purchase page$")
	public void user_is_navigated_to_flights_purchase_page() {
		selflgt.purCnfrLanding();
	}
}