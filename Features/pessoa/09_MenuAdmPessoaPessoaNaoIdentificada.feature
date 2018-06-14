#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@tag
Feature: Menu Administrativo Pessoa > Pessoas nao identificadas
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "augustomarinho@plusoft.com.br" e senha "Mudar123"
    And Acessar modulo "Administrativo"
    
   @tag2
   Scenario: Acessar Menu Pessoa, Incluir um Pessoas nao identificadas
    And Acessar menu "Pessoa"
    And Acessar sub-menu "Pessoas nao identificadas"
    And Clicar botao "Novo"
    And Digitar Pessoas nao identificadas "01AQAPessoas nao identificadas"
    And Digitar Pessoa "10"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
   @tag3
  Scenario: validar tela de busca
    And Validar title "Pessoa nao identificada"
    
    
 @tag4
  Scenario: Incluir um time
  And Clicar botao "Novo"
  And Digitar Pessoas nao identificadas "02AQAPessoas nao identificadas"
  And Digitar Pessoa "22"
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir um Departamento
  And Digitar Pessoas nao identificadas "03AQAPessoas nao identificadas"
  And Digitar Pessoa "1542"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
    @tag7
  Scenario: Editar registro
  And Digitar busca "03AQAPessoas nao identificadas"
  And Clicar botao "Editar"
  And Digitar Pessoas nao identificadas "04AQAPessoas nao identificadas"
  And Digitar Pessoa "542"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar busca "02AQAPessoas nao identificadas"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  And Digitar Pessoas nao identificadas "05AQAPessoas nao identificadas"
  And Digitar Pessoa "00"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar busca "05AQAPessoas nao identificadas"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQAPessoas nao identificadas"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar busca "02AQAPessoas nao identificadas"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso