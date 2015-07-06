package gridexamples;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EjemploGrid {
    private static RemoteWebDriver driver;
    
    @Parameters("browser")
    
    @BeforeClass
	   public void setUP(String browser) throws MalformedURLException {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("firefox")) {
	 		DesiredCapabilities capability = DesiredCapabilities.firefox();
		    driver = new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), capability);
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("ie")) { 
	 
		  // Here I am setting up the path for my IEDriver
	 		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		  	//System.setProperty("webdriver.ie.driver", "/Users/avega/Desktop/Drivers/IEDriverServer.exe");
	 		driver = new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), capability);
		  
	 
	  } else if(browser.equalsIgnoreCase("chrome")){
		  
		  DesiredCapabilities capability = DesiredCapabilities.chrome();
		  driver = new RemoteWebDriver(new URL("http://localhost:1234/wd/hub"), capability);

	  }
	 
	  // Doesn't the browser type, launch the Website
	 
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	 
	  }
    
    @Test
    public void successfullLogin() {
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
    
    @AfterMethod
    public void close(){
    	driver.close();   	
    }
	
}
