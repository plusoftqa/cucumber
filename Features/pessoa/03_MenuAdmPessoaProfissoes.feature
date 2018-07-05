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
Feature: Menu Administrativo Pessoa > Profissoes
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @tag2
   Scenario: Acessar Menu Pessoa, Incluir um Profissoes
    And Acessar menu "Pessoa"
    And Acessar sub-menu "Profissoes"
    And Clicar botao "Novo"
    And Digitar Profissoes "01AQAProfissoes"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
   @tag3
  Scenario: validar tela de busca
    And Validar title "Cargo"
    
    
 @tag4
  Scenario: Incluir uma profissao
  And Clicar botao "Novo"
  And Digitar Profissoes "02AQAProfissoes"
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir uma profissao
  And Digitar Profissoes "03AQAProfissoes"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
    @tag6
  Scenario: Validar tela de busca
    And Validar title "Profissao"
    And Filtro buscar "Ativos"
    And Filtro buscar "Inativos"
    And Filtro buscar "Ativos / Inativos"
    And Validar Caminho do Menu "Cargo"
    And Validar ordenacao tela de busca
    
    @tag7
  Scenario: Editar registro
  And Digitar busca "03AQAProfissoes"
  And Clicar botao "Editar"
  And Digitar Profissoes "04AQAProfissoes"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar busca "02AQAProfissoes"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  And Digitar Profissoes "05AQAProfissoes"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar busca "05AQAProfissoes"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQAProfissoes"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar busca "02AQAProfissoes"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
    @tag12
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Profissoes ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
  