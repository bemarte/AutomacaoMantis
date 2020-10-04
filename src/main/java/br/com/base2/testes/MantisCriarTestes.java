package br.com.base2.testes;

import static br.com.base2.core.DriverFactory.getDriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import br.com.base2.pages.POMantisCriarTask;
import br.com.base2.pages.POMantisLoginTeste;

@RunWith(Parameterized.class)
public class MantisCriarTestes {
	
	private POMantisLoginTeste pageLogin;
	private POMantisCriarTask page;
	
	@Parameter
	public String summary;
	@Parameter(value=1)
	public String description;

	
	@Before
	public void inicializar() {

		System.setProperty("webdriver.chrome.driver", "/home/arax/Selenium_Docs/chromedriver_linux64/chromedriver");
		String baseURL = "https://mantis-prova.base2.com.br/login_page.php";
		
		getDriver().get(baseURL);
		
		page = new POMantisCriarTask();
		pageLogin = new POMantisLoginTeste();
		
		pageLogin.setUsername("breno.martins");
		pageLogin.setPassword("123456");
		pageLogin.clickLogar();

		
	}
	
	@Parameters
	public static Collection<Object[]> getCollection(){
		return Arrays.asList(new Object[][] {
			{"Teste 01", "Teste 01 - A"},
			{"Teste 02", "Teste 02 - A"},
			{"Teste 03", "Teste 03 - A"},
			{"Teste 04", "Teste 04 - A"},
		});
	}
	
	
	
	@Test
	public void manyTasks() {

		page.clickReportIssue();
		
		page.setCategory();
		page.setSumary(summary);
		page.setDescription(description);
		page.submitReport();

			
	}	

}
