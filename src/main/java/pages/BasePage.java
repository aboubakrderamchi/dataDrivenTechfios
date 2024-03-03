package pages;
import org.testng.Assert;

public class BasePage {
	
	public void validateElements(String actual, String expected, String msg) {
		Assert.assertEquals(actual, expected, msg);
	}
}
