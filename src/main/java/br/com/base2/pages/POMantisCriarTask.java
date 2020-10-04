package br.com.base2.pages;

import br.com.base2.core.BasePage;

public class POMantisCriarTask extends BasePage {
	
	//text
	public void setSumary(String sumary) {
		dsl.escrever("summary", sumary);
	}
	
	public void setDescription(String description) {
		dsl.escrever("description", description);
	}
	
	//set
	public void setCategory() {
		dsl.selecionarCombo("category_id", "[All Projects] Apptest");
	}
		
	//click
	public void clickReportIssue() {
		dsl.clickLinkText("Report Issue");
	}
	
	public void submitReport() {
		dsl.clickButton("button");
	}
	
	

}
