package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks { // no need to extend hook class aytomatically it will excute. cucumer will
						// search before and after

	public static WebDriver driver;// static using directly can access class

	@Before
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

	}

	@After
	public void TearDown() {

		driver.close();
	}
}
