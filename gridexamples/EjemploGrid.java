package gridexamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EjemploGrid {
	public WebDriver driver;
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	   public void beforeTest(String browser) {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 
		  driver = new FirefoxDriver();
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
		  // Here I am setting up the path for my IEDriver
	 
		  System.setProperty("webdriver.ie.driver", "/Users/avega/Desktop/Drivers/IEDriverServer.exe");
	 
		  driver = new InternetExplorerDriver();
	 
	  } else if(browser.equalsIgnoreCase("chrome")){
		  
		  System.setProperty("webdriver.chrome.driver", "/Users/avega/Desktop/Drivers/chromedriver.exe");
		  driver = new ChromeDriver();

	  }
	 
	  // Doesn't the browser type, launch the Website
	 
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/"); 
	 
	  }
	  
	  @AfterMethod
	  public void afterMethod() {

		  driver.close();
		  
	  }

	  
	  
	  @Test
	  public void successfullLogin(){
		  driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
		  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id("formLogin:ingresar")));
		  Assert.assertEquals(driver.getTitle(),"Clasificados Avantica");
		 
		  String username = "ccolon";
		  WebElement id = driver.findElement(By.name("formLogin:username"));
		  id.sendKeys(username);	
		  
		  String password = "123456";
		  WebElement pass = driver.findElement(By.name("formLogin:pass"));
		  pass.sendKeys(password); 
		  
		  WebElement button = driver.findElement(By.id("formLogin:ingresar"));   
		  button.click();
		  //new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(By.className("tituloEspecial")));
		  Assert.assertEquals(driver.getTitle(),"Inicio");
	  }
	
	
}
