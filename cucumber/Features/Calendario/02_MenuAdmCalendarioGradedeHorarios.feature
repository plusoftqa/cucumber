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
Feature: Menu Administrativo Calendario Grade de horarios
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
  @tag2
  Scenario: Acessar Menu Pessoa, Incluir uma Grade de Horarios
    And Acessar menu "Calendario"
    And Acessar sub-menu "Grade de horarios"
    And Clicar botao "Novov1"
    And Incluir Grade de horarios"01AQAGRADEDEHORARIOS"
    And Clicar botao "Salvarv1"
    And Validar Alert de Sucesso   
    
 @tag3
  Scenario: validar tela de busca
    And Validar title "Grade de Hor�rios"

    
  @tag4
  Scenario: Cadastrar uma Grade de Horarios
  And Clicar botao "Novov1"
  And Digitar descricao grade de horarios "02AQAGRADEDEHORARIOS"
  And Selecionar inclusao de horarios(Semana/Hora inicial/Hora Final) "Domingo", "08:00", "17:00"
  And Clicar botao "Salvar e Novov1"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir um feriado recorrente
  And Digitar descricao grade de horarios "03AQAGRADEDEHORARIOS"
  And Selecionar inclusao de horarios(Semana/Hora inicial/Hora Final) "Domingo", "08:00", "17:00"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
 
  
  @tag7
  Scenario: Editar registro
  And Digitar no campo de busca "03AQAGRADEDEHORARIOS"
  And Clicar botao "Editarv1"
  And Digitar descricao grade de horarios "04AQAGRADEDEHORARIOS"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar no campo de busca "02AQAGRADEDEHORARIOS"
  And Clicar botao "Editarv1"
  And Clicar botao "Duplicarv1"
  And Digitar descricao grade de horarios "05AQAGRADEDEHORARIOS"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar no campo de busca "05AQAGRADEDEHORARIOS"
  And Clicar botao "Excluir_buscarv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar no campo de busca "04AQAGRADEDEHORARIOS"
  And Clicar botao "Editarv1"
  And Clicar botao "Excluirv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar no campo de busca "02AQAGRADEDEHORARIOS"
  And Clicar botao "Excluir_buscarv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  

  
  
  
  
   