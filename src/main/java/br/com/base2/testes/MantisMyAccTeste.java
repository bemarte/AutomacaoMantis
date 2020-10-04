package br.com.base2.testes;
import static br.com.base2.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.base2.core.BasePage;
import br.com.base2.pages.POMantisLoginTeste;
import br.com.base2.pages.POMantisMyAccTeste;

public class MantisMyAccTeste extends BasePage{
	
	private POMantisLoginTeste pageLogin;
	private POMantisMyAccTeste page;
	
	@Before
	public void inicializar() {

		System.setProperty("webdriver.chrome.driver", "/home/arax/Selenium_Docs/chromedriver_linux64/chromedriver");
		getDriver().get("https://mantis-prova.base2.com.br/login_page.php");
		
		pageLogin = new POMantisLoginTeste();
		page = new POMantisMyAccTeste();
		
	}
	
	
	@Test
	public void mudarDados() {
		
		logar();

		page.setSenha("123456");
		page.setPasswordConfirm("123456");
		
		if(page.LerEmail().equals("bemarte93@gmail.com")) {
			page.setEmail("brenomartynz@gmail.com");
		}
		if(page.LerEmail().equals("brenomartynz@gmail.com")) {
			page.setEmail("bemarte93@gmail.com");
		}
		
		page.clickUpdateUser();

		pageLogin.clickLogout();
		Assert.assertEquals("Login", pageLogin.obterNomePosLogoutXP());

	}
	
	public void logar() {
		
		pageLogin.setUsername("breno.martins");
		pageLogin.setPassword("123456");
		pageLogin.clickLogar();
		
		page.clickMyAcc();
		
	}

}
