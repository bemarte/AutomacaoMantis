package br.com.base2.core;
import static br.com.base2.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSLmantis {
	
	
	//set
	public void selecionarCombo(String name, String valor) {
		WebElement element = getDriver().findElement(By.name(name));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	
	/** escrever **/
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public void escrever(String name_campo, String texto){
		escrever(By.name(name_campo), texto);
	}
	
	// verificar string 
	
	public String obterValorCampoXPath(String id_campo) {
		return getDriver().findElement(By.xpath(id_campo)).getText();
	}
	
	
	public String obterValorName(String id_name) {
		return getDriver().findElement(By.name(id_name)).getText();
	}
	
	//click button
	
	public void clickButton(String id) {
		getDriver().findElement(By.className(id)).click();
	}
	
	public void clickLinkText(String id) {
		getDriver().findElement(By.linkText(id)).click();
	}

}
