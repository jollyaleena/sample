package MavenPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\New folder\\TestNG Project\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
          driver.get("https://demo.guru99.com/test/newtours/index.php");
          driver.close();
	}

}
