package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo_FindFligtsPage {

	WebDriver driver;


	By departure_list_FindFlights = By.name("fromPort");
	By destination_list_FindFlights = By.name("toPort");
	By find_flight_button = By.xpath("//input[@value='Find Flights']");
	By nav_validation = By.xpath("//input[@value='Choose This Flight']");


	public BlazeDemo_FindFligtsPage(WebDriver driver){
		this.driver = driver;
	}

	public void selectDepCity(String departure) {
		Select dep_city = new Select(driver.findElement(departure_list_FindFlights));
		dep_city.selectByValue(departure);
		System.out.println("Departure City Selected");

	}

	public void selectDesCity(String destination) {
		Select des_city = new Select(driver.findElement(destination_list_FindFlights));
		des_city.selectByValue(destination);
		System.out.println("Destination Selected");
	}

	@SuppressWarnings("deprecation")
	public void flightButtonClick() {
		driver.findElement(find_flight_button).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("user clicked on Find flight button");
	}

	@SuppressWarnings("deprecation")
	public void confirmResPage() {
		driver.findElement(nav_validation).isDisplayed();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("user is navigated to Flight reserve page");
	}

}


