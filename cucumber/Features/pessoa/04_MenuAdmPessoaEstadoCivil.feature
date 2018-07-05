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
Feature: Menu Administrativo Pessoa > Estado Civil
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @tag2
   Scenario: Acessar Menu Pessoa, Incluir um Estado Civil
    And Acessar menu "Pessoa"
    And Acessar sub-menu "Estado Civil"
    And Clicar botao "Novo"
    And Digitar Estado Civil "01AQAEstado Civil"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    

    
 @tag4
  Scenario: Incluir um Estado Civil
  And Clicar botao "Novo"
  And Digitar Estado Civil "02AQAEstado Civil"
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir um Estado Civil
  And Digitar Estado Civil "03AQAEstado Civil"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
    @tag6
  Scenario: Validar tela de busca
    And Validar title "Estado Civil"
    And Filtro buscar "Ativos"
    And Filtro buscar "Inativos"
    And Filtro buscar "Ativos / Inativos"
    And Validar Caminho do Menu "Estado Civil"
    And Validar ordenacao tela de busca
  
    @tag7
  Scenario: Editar registro
  And Digitar busca "03AQAEstado Civil"
  And Clicar botao "Editar"
  And Digitar Estado Civil "04AQAEstado Civil"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar busca "02AQAEstado Civil"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  And Digitar Estado Civil "05AQAEstado Civil"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar busca "05AQAEstado Civil"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQAEstado Civil"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar busca "02AQAEstado Civil"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
    @tag12
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Estado Civil ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
  