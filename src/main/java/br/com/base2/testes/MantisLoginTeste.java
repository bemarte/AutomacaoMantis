package br.com.base2.testes;
import static br.com.base2.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.base2.core.BaseTeste;
import br.com.base2.pages.POMantisLoginTeste;

public class MantisLoginTeste extends BaseTeste {

	private POMantisLoginTeste page;
	
	@Before
	public void inicializar() {
		
		//atribuir webdriver via $PATH ou em inicializar
		System.setProperty("webdriver.chrome.driver", "/home/arax/Selenium_Docs/chromedriver_linux64/chromedriver");
		getDriver().get("https://mantis-prova.base2.com.br/login_page.php");
		
		page = new POMantisLoginTeste();
		
	}
	

	@Test
	public void VerificaCampoVazioInvalido() {
		
		page.clickLogar();
		
		Assert.assertEquals("Your account may be disabled or blocked or the username/password you entered is incorrect.", 
				page.errorLogin());
		
	}
	
	@Test
	public void VerficaLoginLogoutValido() {
		
		page.setUsername("breno.martins");
		page.setPassword("123456");
		page.clickLogar();
		
		WebDriverWait wait = new WebDriverWait(getDriver(),5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td/span")));
		
		Assert.assertEquals("breno.martins", page.obterNomePosLoginXP());
		
		page.clickLogout();
		Assert.assertEquals("Login", page.obterNomePosLogoutXP());
			
	}
	
	@Test
	public void RecuperarSenha() {
	
		page.resetPassword();
		page.setUsername("breno.martins");
		page.setEmail("bemarte93@gmail.com");
		page.clickSubmit();
		Assert.assertEquals("Password Message Sent", page.obterRespostaResetPassword());
		page.resetPasswordProceed();
		Assert.assertEquals("Login", page.obterNomePosLogoutXP());
		
	}
	
}
