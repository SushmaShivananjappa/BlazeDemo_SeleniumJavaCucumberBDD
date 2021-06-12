package genericFunctions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class GenericMethods {

	public static WebDriver driver;
	
	/**
	 * Opens Url
	 */

	public static void openURL(String url) {
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

	/**
	 * maximize current window
	 */
	public static void maximizeWinDow() throws Exception {
		driver.manage().window().maximize();
	}

	
	
}
