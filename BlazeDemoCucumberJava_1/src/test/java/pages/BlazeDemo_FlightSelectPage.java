package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemo_FlightSelectPage {

	WebDriver driver1;
	JavascriptExecutor js = (JavascriptExecutor)driver1;

	//	By selFlight = By.xpath("//tbody/child::tr[1]/child::input[@value='43']/preceding-sibling::td[6]/input[@type='submit']");
	By selFlight = By.xpath("//tbody/child::tr[1]/child::td[1]/input[@type='submit']");
	By nav_purchase = By.xpath("@input[id='inputName']");

	public BlazeDemo_FlightSelectPage(WebDriver driver){
		this.driver1 = driver;
	}


//	public Actions chooseFlight() {
//		//		driver.findElement(selFlight).click();
//
//		Actions act = new Actions(driver1);
//		return act.click(driver1.findElement(selFlight)).clickAndHold().release();
//
//			driver.findElement(selFlight).sendKeys(Keys.ENTER);
//			driver1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//			System.out.println("user chose a Flight");
//			return act;
//	}
	
	
			public void chooseFlight() {
//			driver1.findElement(selFlight).sendKeys(Keys.RETURN);
			driver1.findElement(selFlight).click();
//				js.executeScript("arguments[0].click();",selFlight);
				driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				System.out.println("User Chose a Flight");
			}
	
	

	public void purCnfrLanding(){
		driver1.findElement(nav_purchase).isDisplayed();
		System.out.println("User lands to Purchase page");
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver1.close();
		driver1.quit();
	}
}
