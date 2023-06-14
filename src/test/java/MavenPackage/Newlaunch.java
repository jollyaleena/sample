package MavenPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Newlaunch {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  driver.manage().window().maximize();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\New folder\\New folder\\TestNG Project\\chromedriver.exe");
	   driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
