package br.com.base2.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.base2.core.DriverFactory;
import br.com.base2.testes.MantisLoginTeste;
import br.com.base2.testes.MantisMyAccTeste;

@RunWith(Suite.class)
@SuiteClasses({
	
	MantisLoginTeste.class,
	MantisMyAccTeste.class
	
})


public class SuiteTestes {
	
	@AfterClass
	public static void finalizaTeste() {
		DriverFactory.killDriver();
	}

}
