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
Feature: Menu Administrativo Calendario Feriado

  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
  @tag2
  Scenario: Acessar Menu Pessoa, Incluir um Feriado
    And Acessar menu "Calendario"
    And Acessar sub-menu "Feriados"
    And Clicar botao "Novov1"
    And Incluir feriados"01AQAFERIADOS"
    And Clicar botao "Salvarv1"
    And Validar Alert de Sucesso   
    
 @tag3
  Scenario: validar tela de busca
    And Validar title "Feriados"

    
  @tag4
  Scenario: Cadastrar um feriado
  And Clicar botao "Novov1"
  And Digitar data feriado "01/01/2018"
  And Digitar descricao feriado "02QAAUTOMACAO_QA"
  And Clicar botao "Salvar e Novov1"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir um feriado recorrente
  And Digitar data feriado "01/02/2018"
  And Digitar descricao feriado "03QAAUTOMACAO_INATIVO"
  And checkbox recorrente feriado
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
 
  
  @tag7
  Scenario: Editar registro
  And Digitar no campo de busca "03QAAUTOMACAO_INATIVO"
  And Clicar botao "Editarv1"
  And Digitar descricao feriado "04QAAUTOMACAO_ATIVO"
  And checkbox recorrente feriado 
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar no campo de busca "02QAAUTOMACAO_QA"
  And Clicar botao "Editarv1"
  And Clicar botao "Duplicarv1"
  And Digitar descricao feriado "05QAAUTOMACAO_QA"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar no campo de busca "05QAAUTOMACAO_QA"
  And Clicar botao "Excluir_buscarv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar no campo de busca "04QAAUTOMACAO_ATIVO"
  And Clicar botao "Editarv1"
  And Clicar botao "Excluirv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar no campo de busca "02QAAUTOMACAO_QA"
  And Clicar botao "Excluir_buscarv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  

  
  
  
  
   