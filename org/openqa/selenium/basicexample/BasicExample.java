package org.openqa.selenium.basicexample;


import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BasicExample {

	public static void main(String[] args) {
		//succesfullLogin();
		//wrongLogin1();
		//wrongLogin2();
		//wrongLogin3();
		
		//succesfullRegistration();
		//wrongRegistration1();
		//wrongRegistration2();
		//wrongRegistration3();
		testGoogleSearch();
		
	}
	
	
	public static void testGoogleSearch() {
		  // Optional, if not specified, WebDriver will search your path for chromedriver.
		  System.setProperty("webdriver.chrome.driver", "/Users/avega/Desktop/Drivers/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com/xhtml");
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Let the user actually see something!
		  WebElement searchBox = driver.findElement(By.name("q"));
		  searchBox.sendKeys("ChromeDriver");
		  searchBox.submit();
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Let the user actually see something!
		  driver.close();
		}
	
	public static void succesfullLogin() {
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
        driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
      //Espera a que elementos sean visibles
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
        System.out.println("Elementos visibles");
        
        //Busco los elementos del username, password y el boton
        WebElement id = driver.findElement(By.name("formLogin:username"));
        WebElement pass = driver.findElement(By.name("formLogin:pass"));
        WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));         

        //Asigno valores a esos elementos
        id.sendKeys("ccolon");
        pass.sendKeys("123456");      
        
        //Envio el request
        button.click();
                
        //Imprimo resultados
        System.out.println("El login fue exitoso");
        
    }
	
	public static void wrongLogin1() {
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
        driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
      //Espera a que elementos sean visibles
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
        System.out.println("Elementos visibles");
        
        //Busco los elementos del username, password y el boton
        WebElement id = driver.findElement(By.name("formLogin:username"));
        WebElement pass = driver.findElement(By.name("formLogin:pass"));
        WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));         

        //Asigno valores a esos elementos
        id.sendKeys("nacho");
        pass.sendKeys("123456");      
        
        //Envio el request
        button.click();
                
        //Imprimo resultados
        System.out.println("El login no fue exitoso");
        
    }
	
	public static void wrongLogin2(){
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
        driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
      //Espera a que elementos sean visibles
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
        System.out.println("Elementos visibles");
        
        //Busco los elementos del username, password y el boton
        WebElement id = driver.findElement(By.name("formLogin:username"));
        WebElement pass = driver.findElement(By.name("formLogin:pass"));
        WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));         

        //Asigno valores a esos elementos
        id.sendKeys("pedro");
        pass.sendKeys("123456");      
        
        //Envio el request
        button.click();
                
        //Imprimo resultados
        System.out.println("El login no fue exitoso");
		
	}
	
	public static void wrongLogin3(){
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
        driver.get("https://avansecu-qa:8181/SecurityTestingSite/");
      //Espera a que elementos sean visibles
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/section[2]/button")));
        System.out.println("Elementos visibles");
        
        //Busco los elementos del username, password y el boton
        WebElement id = driver.findElement(By.name("formLogin:username"));
        WebElement pass = driver.findElement(By.name("formLogin:pass"));
        WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/button"));         

        //Asigno valores a esos elementos
        id.sendKeys("nacho");
        pass.sendKeys("123");      
        
        //Envio el request
        button.click();
                
        //Imprimo resultados
        System.out.println("El login no fue exitoso");
		
	}
	
	
	public static void succesfullRegistration(){
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
		driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		//Espera a que elementos sean visibles
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
        System.out.println("Elementos visibles");
		
		//Busco todos los elementos del formulario que ocupo llenar
		WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		
	
		/*Para obtener cosas en un dropdown pongo el Xpath y li para que me regrese todo el select y lo almacene en una lista*/
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		//Tambien debo buscar que el dropdown (lista abierta) sea visible y la encuentre
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));         
		
		
		//Inserto valores del nuevo usuario
		username.sendKeys("ironman");
		name.sendKeys("Tony");
		lastname.sendKeys("Stark");
		phone.sendKeys("22224444");
		email1.sendKeys("ironman@avantica.net");
		email2.sendKeys("ironman@avantica.net");
		pass1.sendKeys("jarvis");
		pass2.sendKeys("jarvis");
		
		//Hago click en el dropdown y espero a que sea visible
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(10)));
        System.out.println("Opcion Kenia visible");
        
        //seleciono que valor quiero en este caso 10=Kenia
		country.get(10).click();

		//Espero a que el dropdown sea visible
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(1)));
        System.out.println("Opcion superpoder visible");
        //seleciono que valor quiero en este caso 1=Pregunta del superpoder
        securityquestion.get(1).click();
		
		
		securityanswer.sendKeys("money");
		//envio request al hacer click en el boton
		button.click();
		
		
        System.out.println("El registro fue exitoso");
		
	}
	
	public static void wrongRegistration1(){
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
		driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		//Espera a que elementos sean visibles
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
        System.out.println("Elementos visibles");
		
		//Busco todos los elementos del formulario que ocupo llenar
		WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		
	
		/*Para obtener cosas en un dropdown pongo el Xpath y li para que me regrese todo el select y lo almacene en una lista*/
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		//Tambien debo buscar que el dropdown (lista abierta) sea visible y la encuentre
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));         
		
		

		//Inserto valores del nuevo usuario
		username.sendKeys("superman");
		name.sendKeys("Clark");
		lastname.sendKeys("Kent");
		phone.sendKeys("22224444");
		email1.sendKeys("superman@avantica.net");
		email2.sendKeys("superman@gmail.net");
		pass1.sendKeys("lois");
		pass2.sendKeys("lois");
		
		//Hago click en el dropdown y espero a que sea visible
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(12)));
        System.out.println("Opcion pais visible");
        
        //seleciono que valor quiero en este caso 12=Argentina
		country.get(12).click();

		//Espero a que el dropdown sea visible
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(16)));
        System.out.println("Opcion pregunta visible");
        //seleciono que valor quiero en este caso 16=Pregunta del equipo preferido
        securityquestion.get(16).click();
		
		
		securityanswer.sendKeys("Real Madrid");
		//envio request al hacer click en el boton
		button.click();
		
		
        System.out.println("El registro no fue exitoso los correos no coinciden");
		
		
	}
	
	public static void wrongRegistration2(){
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
		driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		//Espera a que elementos sean visibles
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
        System.out.println("Elementos visibles");
		
		//Busco todos los elementos del formulario que ocupo llenar
		WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		
	
		/*Para obtener cosas en un dropdown pongo el Xpath y li para que me regrese todo el select y lo almacene en una lista*/
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		//Tambien debo buscar que el dropdown (lista abierta) sea visible y la encuentre
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));         
		
		

		//Inserto valores del nuevo usuario
		username.sendKeys("superman");
		name.sendKeys("Clark");
		lastname.sendKeys("Kent");
		phone.sendKeys("22224444");
		email1.sendKeys("superman@avantica.net");
		email2.sendKeys("superman@avantica.net");
		pass1.sendKeys("123");
		pass2.sendKeys("123");
		
		//Hago click en el dropdown y espero a que sea visible
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(12)));
        System.out.println("Opcion pais visible");
        
        //seleciono que valor quiero en este caso 12=Argentina
		country.get(12).click();

		//Espero a que el dropdown sea visible
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(16)));
        System.out.println("Opcion pregunta visible");
        //seleciono que valor quiero en este caso 16=Pregunta del equipo preferido
        securityquestion.get(16).click();
		
		
		securityanswer.sendKeys("Real Madrid");
		//envio request al hacer click en el boton
		button.click();
		
		
        System.out.println("El registro no fue exitoso la contraseña no cumple con los requisitos");
		
		
	}

	public static void wrongRegistration3(){
		//Creo instancia del browser
		WebDriver driver = new FirefoxDriver();
		//Le digo a cual URL ocupo que vaya
		driver.get("https://avansecu-qa:8181/SecurityTestingSite/faces/nuevo_usuario.xhtml");
		//Espera a que elementos sean visibles
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/section/form/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img")));
        System.out.println("Elementos visibles");
		
		//Busco todos los elementos del formulario que ocupo llenar
		WebElement username = driver.findElement(By.id("j_idt7:username"));
		WebElement name = driver.findElement(By.id("j_idt7:nombre"));
		WebElement lastname = driver.findElement(By.id("j_idt7:apellidos"));
		WebElement phone = driver.findElement(By.id("j_idt7:telefono"));
		WebElement email1 = driver.findElement(By.id("j_idt7:correo1"));
		WebElement email2 = driver.findElement(By.id("j_idt7:correo2"));
		WebElement pass1 = driver.findElement(By.id("j_idt7:pass1"));
		WebElement pass2 = driver.findElement(By.id("j_idt7:pass2"));
		
		
	
		/*Para obtener cosas en un dropdown pongo el Xpath y li para que me regrese todo el select y lo almacene en una lista*/
		List<WebElement> country = driver.findElements(By.xpath(".//*[@id='j_idt7:paises_panel']/div/ul/li"));
		List<WebElement> securityquestion = driver.findElements(By.xpath(".//*[@id='j_idt7:preguntas_panel']/div/ul/li"));
		//Tambien debo buscar que el dropdown (lista abierta) sea visible y la encuentre
		WebElement countrydropdown = driver.findElement(By.id("j_idt7:paises_label"));
		WebElement securityquestiondropdown = driver.findElement(By.id("j_idt7:preguntas_label"));
		
		WebElement securityanswer = driver.findElement(By.id("j_idt7:respuesta"));
		WebElement button = driver.findElement(By.xpath("/html/body/section/form/section[2]/table/tbody/tr/td[2]/button"));         
		
		

		//Inserto valores del nuevo usuario
		username.sendKeys("superman");
		name.sendKeys("Clark");
		lastname.sendKeys("Kent");
		phone.sendKeys("22224444");
		email1.sendKeys("superman@avantica.net");
		email2.sendKeys("superman@avantica.net");
		pass1.sendKeys("123456");
		pass2.sendKeys("123456");
		
		//Hago click en el dropdown y espero a que sea visible
		countrydropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(country.get(12)));
        System.out.println("Opcion pais visible");
        
        //seleciono que valor quiero en este caso 12=Argentina
		country.get(12).click();

		//Espero a que el dropdown sea visible
		securityquestiondropdown.click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(securityquestion.get(16)));
        System.out.println("Opcion pregunta visible");
        //seleciono que valor quiero en este caso 16=Pregunta del equipo preferido
        securityquestion.get(16).click();
		
		
		securityanswer.sendKeys("");
		//envio request al hacer click en el boton
		button.click();
		
		
        System.out.println("El registro no fue exitoso es necesario llenar todos los campos requeridos");
		
		
	}
	
}
