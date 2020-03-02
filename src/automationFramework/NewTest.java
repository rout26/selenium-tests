package automationFramework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
//import org.testng.annotations.Test;

public class NewTest {
	
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\routsu\\Documents\\DevTools\\selenium\\Drivers\\geckodriver.exe";
    public WebDriver driver ; 
  @Test
  public void verifyHomepageTitle() {
      
      System.out.println("launching firefox browser");
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      AssertJUnit.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
	
 @Test
  public void verifyLogin() {
      
      System.out.println("launching firefox browser");
      System.setProperty("webdriver.gecko.driver", driverPath);
      driver = new FirefoxDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      AssertJUnit.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}
