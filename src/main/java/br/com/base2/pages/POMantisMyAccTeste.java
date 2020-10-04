package br.com.base2.pages;

import br.com.base2.core.BasePage;

public class POMantisMyAccTeste extends BasePage {
	
	//set
	public void setEmail(String email) {
		dsl.escrever("email", email);
	}
	
	public void setSenha(String senha) {
		dsl.escrever("password", senha);
	}
	
	public void setPasswordConfirm(String senha_confirma) {
		dsl.escrever("password_confirm", senha_confirma);
	}
	
	
	//click
	
	public void clickMyAcc() {
		dsl.clickLinkText("My Account");
	}
	
	public void clickUpdateUser() {
		dsl.clickButton("button");
	}
	
	public void clickProceed() {
		dsl.clickLinkText("Proceed");
	}
	
	//obter valor
	
	public String LerEmail() {
		return dsl.obterValorName("email");
	}
	
	public String SuccFalse() {
		return dsl.obterValorCampoXPath("//div[2]");
	}

}
