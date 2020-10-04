package br.com.base2.pages;

import br.com.base2.core.BasePage;

public class POMantisLoginTeste extends BasePage{
	
	//set
	public void setUsername(String username) {
		dsl.escrever("username", username);
	}
	
	public void setEmail(String email) {
		dsl.escrever("email", email);
	}
	
	public void setPassword(String password) {
		dsl.escrever("password", password);
	}
	
	// click MantisLoginTeste
	
	public void clickSubmit() {
		dsl.clickButton("button");
	}
	
	public void clickLogar(){
		dsl.clickButton("button");
	}
	
	public void clickLogout() {
		dsl.clickLinkText("Logout");
	}
	
	public void resetPassword() {
		dsl.clickLinkText("Lost your password?");
	}
	
	public void resetPasswordProceed() {
		dsl.clickLinkText("Proceed");
	}
	
	
	//get value
	
	public String obterNomePosLoginXP() {
		return dsl.obterValorCampoXPath("//td/span");
	}
	
	public String obterNomePosLogoutXP() {
		return dsl.obterValorCampoXPath("//td");
	}
	
	public String obterRespostaResetPassword() {
		return dsl.obterValorCampoXPath("//b");
	}
	
	public String errorLogin() {
		return dsl.obterValorCampoXPath("//div[2]");
	}

}
