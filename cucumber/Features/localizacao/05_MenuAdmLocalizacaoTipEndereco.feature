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
Feature: Menu Administrativo Localizacao > Tipo de Endereco
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "augustomarinho@plusoft.com.br" e senha "Mudar123"
    And Acessar modulo "Administrativo"
    
   @tag2
   Scenario: Acessar Menu Localização, Incluir um Tipos de endereco
    And Acessar menu "Localizacao"
    And Acessar sub-menu "Tipos de endereco"
    And Clicar botao "Novo"
    And Digitar Tipos de endereco "01AQATipos de endereco"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
   @tag3
  Scenario: validar tela de busca
    And Validar title "Tipo de Endereço"
    
    
 @tag4
  Scenario: Incluir um time
  And Clicar botao "Novo"
  And Digitar Tipos de endereco "02AQATipos de endereco"
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir um Departamento
  And Digitar Tipos de endereco "03AQATipos de endereco"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
    @tag7
  Scenario: Editar registro
  And Digitar busca "03AQATipos de endereco"
  And Clicar botao "Editar"
  And Digitar Tipos de endereco "04AQATipos de endereco"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar busca "02AQATipos de endereco"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  And Digitar Tipos de endereco "05AQATipos de endereco"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar busca "05AQATipos de endereco"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQATipos de endereco"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar busca "02AQATipos de endereco"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso