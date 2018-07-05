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
Feature: Menu Administrativo Localizacao > Paises
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @tag2
   Scenario: Acessar Menu Localização, Incluir um Paise
    And Acessar menu "Localizacao"
    And Acessar sub-menu "Paises"
    And Clicar botao "Novo"
    And Digitar Paises "01AQAPAISES"
    And Digitar Abreviacao "QA"
    And Digitar Codigo do Pais "55"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
 @tag4
  Scenario: Incluir um pais e inativar
  And Clicar botao "Novo"
  And Digitar Paises "02AQAPAISES"
  And Digitar Abreviacao "QA"
  And checkbox Inativo
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir um pais
  And Digitar Paises "03AQAPAISES"
  And Digitar Abreviacao "QA"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag6
  Scenario: Validar tela de busca
  And Validar title "País"
  And Filtro buscar "Ativos"
  And Filtro buscar "Inativos"
  And Filtro buscar "Ativos / Inativos"
  And Validar Caminho do Menu "Pais"
  And Validar ordenacao tela de busca
  
  
    @tag7
  Scenario: Editar registro
  And Digitar busca "03AQAPAISES"
  And Clicar botao "Editar"
  And Digitar Paises "04AQAPAISES"
  And Digitar Abreviacao "QA"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar busca "02AQAPAISES"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  And Digitar Paises "05AQAPAISES"
  And Digitar Abreviacao "QA"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar busca "05AQAPAISES"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQAPAISES"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar busca "02AQAPAISES"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
    @tag12
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Paises ""
    And Clicar botao "Salvar"
    And Validar Alert de erro