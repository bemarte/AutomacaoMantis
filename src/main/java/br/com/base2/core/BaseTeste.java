package br.com.base2.core;
import static br.com.base2.core.DriverFactory.killDriver;

import org.junit.After;

public class BaseTeste {
	
	
	@After
	public void finaliza() {
		
		if(Propriedades.FECHAR_BROWSER) {
			killDriver();
		}
		
	}
	
	
}
