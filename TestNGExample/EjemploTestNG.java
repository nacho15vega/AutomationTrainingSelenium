package TestNGExample;

import java.util.List;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;




public class EjemploTestNG {
  
	WebDriver driver = new FirefoxDriver();
	
   
  @BeforeClass
  public void beforeMethod() {
	 driver = new FirefoxDriver();    	 
  }

  
  @AfterMethod
  public void afterMethod() {

	  driver.close();
  }

  @Test(groups=("loginSucess"))
  public void successfullLogin(){
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
	  Assert.assertEquals(driver.getTitle(),"Clasificados Avantica");
	 
	  String username = "ccolon";
	  WebElement id = driver.findElement(By.name("formLogin:username"));
	  id.sendKeys(username);	
	  
	  String password = "123456";
	  WebElement pass = driver.findElement(By.name("formLogin:pass"));
	  pass.sendKeys(password); 
	  
	  WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));   
	  button.click();
	  Assert.assertEquals(driver.getTitle(),"Inicio");
	  
  }
  
  @Test(groups=("LoginFailiures"))
  public void wrongLogin1(){
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
	  Assert.assertEquals(driver.getTitle(),"Clasificados Avantica");
	  
	  String username = "nacho";
	  WebElement id = driver.findElement(By.name("formLogin:username"));
	  id.sendKeys(username);	
	  
	  String password = "123456";
	  WebElement pass = driver.findElement(By.name("formLogin:pass"));
	  pass.sendKeys(password); 
	  
	  WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));   
	  button.click();
	  Assert.assertNotEquals(driver.getTitle(), "Inicio");
  }
  
  @Test(groups=("LoginFailiures"))
  public void wrongLogin2(){
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
	  Assert.assertEquals(driver.getTitle(),"Clasificados Avantica");
	  
	  String username = "pedro";
	  WebElement id = driver.findElement(By.name("formLogin:username"));
	  id.sendKeys(username);	
	  
	  String password = "123456";
	  WebElement pass = driver.findElement(By.name("formLogin:pass"));
	  pass.sendKeys(password); 
	  
	  WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));   
	  button.click();
	  Assert.assertNotEquals(driver.getTitle(), "Inicio");
	  	  
  }

  @Test(groups=("LoginFailiures"))
  public void wrongLogin3(){

	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
	  Assert.assertEquals(driver.getTitle(),"Clasificados Avantica");
	  
	  String username = "nacho";
	  WebElement id = driver.findElement(By.name("formLogin:username"));
	  id.sendKeys(username);	
	  
	  String password = "123";
	  WebElement pass = driver.findElement(By.name("formLogin:pass"));
	  pass.sendKeys(password); 
	  
	  WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));   
	  button.click();
	  Assert.assertNotEquals(driver.getTitle(), "Inicio");
	  	  
  }
 
  @Test(groups=("registrationSuccess")) 
  public void successfullRegistration(){
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
	  
	  	WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));  
		
		username.sendKeys("ironman");
		name.sendKeys("Tony");
		lastname.sendKeys("Stark");
		phone.sendKeys("22224444");
		email1.sendKeys("ironman@avantica.net");
		email2.sendKeys("ironman@avantica.net");
		pass1.sendKeys("jarvis");
		pass2.sendKeys("jarvis");
		
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(10)));
		country.get(10).click();
		
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(1)));
		securityquestion.get(1).click();
		
		securityanswer.sendKeys("money");
		
		button.click();
		//Si el registro fue exitoso me lleva al login page
		Assert.assertEquals(driver.getTitle(),"Clasificados Avantica");
		
  }
 
  @Test(groups=("registrationFail"))
  public void wrongRegistration1(){
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
	  
	  	WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));        
		
		username.sendKeys("superman");
		name.sendKeys("Clark");
		lastname.sendKeys("Kent");
		phone.sendKeys("22224444");
		email1.sendKeys("superman@avantica.net");
		email2.sendKeys("superman@gmail.net");
		pass1.sendKeys("lois");
		pass2.sendKeys("lois");
		
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(12)));
		country.get(12).click();
		
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(16)));
		securityquestion.get(16).click();
		
		securityanswer.sendKeys("Real Madrid");
		
		button.click();
		Assert.assertEquals(driver.getTitle(),"Registro usuario");
	  
  }
  
  @Test(groups=("registrationFail"))
  public void wrongRegistration2(){
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
	  
	  	WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));        
		
		username.sendKeys("superman");
		name.sendKeys("Clark");
		lastname.sendKeys("Kent");
		phone.sendKeys("22224444");
		email1.sendKeys("superman@avantica.net");
		email2.sendKeys("superman@gmail.net");
		pass1.sendKeys("123");
		pass2.sendKeys("123");
		
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(12)));
		country.get(12).click();
		
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(16)));
		securityquestion.get(16).click();
		
		securityanswer.sendKeys("Real Madrid");
		
		button.click();
		Assert.assertEquals(driver.getTitle(),"Registro usuario");
	  
  }
  
  @Test(groups=("registrationFail"))
  public void wrongRegistration3(){
	  driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
	  new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
	  
	  	WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));        
		
		username.sendKeys("superman");
		name.sendKeys("Clark");
		lastname.sendKeys("Kent");
		phone.sendKeys("22224444");
		email1.sendKeys("superman@avantica.net");
		email2.sendKeys("superman@gmail.net");
		pass1.sendKeys("123");
		pass2.sendKeys("123");
		
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(12)));
		country.get(12).click();
		
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(16)));
		securityquestion.get(16).click();
		
		securityanswer.sendKeys("");
		
		button.click();
		Assert.assertEquals(driver.getTitle(),"Registro usuario");
	
	  
  }

}
