# Automação Mantis
Automação de tarefas na aplicação Mantis

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [Sobre o Projeto](#sobre-o-projeto)
  * [Frameworks](#frameworks)
* [Uso](#uso)
* [Contact](#contact)

## Sobre o Projeto
Este projeto tem o intuito de automatizar testes na plataforma do Mantis.

Para isso, foi seguido algumas metodologias:
* Divisão de pacotes com atribuições específicas
  * Core -> possui as classes responsáveis pela estrutura que irá guiar a execução dos testes,
  * Pages -> possui as classes Page Object para cada página testada da aplicação,
  * Testes -> aonde estão as classes contendo os scripts de testes propriamente digo,
  * Suítes -> Nas suítes estão os testes na sequência mais performática possível.
  
### Frameworks

Os frameworks, linguagens e dependências utilizadas para a execução dos testes foram:
* [Java]
* [Maven]
* [Selenium Webdriver]

## Uso

O uso recomendável para execução dos testes se da pela Suíte de testes, pois a organização das classes de testes estão organizadas de forma otimizada na automação.


