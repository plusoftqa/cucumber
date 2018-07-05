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
Feature: Menu Administrativo Pessoa > Classificacoes
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @tag2
   Scenario: Acessar Menu Pessoa, Incluir um Classificacoes
    And Acessar menu "Pessoa"
    And Acessar sub-menu "Classificacoes"
    And Clicar botao "Novo"
    And Digitar Classificacoes "01AQAClassificacoes"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   

    
 @tag4
  Scenario: Incluir uma Classificacao
  And Clicar botao "Novo"
  And Digitar Classificacoes "02AQAClassificacoes"
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir uma Classificacao
  And Digitar Classificacoes "03AQAClassificacoes"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
    @tag6
  Scenario: Validar tela de busca
    And Validar title "Classificacoes"
    And Filtro buscar "Ativos"
    And Filtro buscar "Inativos"
    And Filtro buscar "Ativos / Inativos"
    And Validar Caminho do Menu "Classificacoes"
    And Validar ordenacao tela de busca
  
    @tag7
  Scenario: Editar registro
  And Digitar busca "03AQAClassificacoes"
  And Clicar botao "Editar"
  And Digitar Classificacoes "04AQAClassificacoes"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar busca "02AQAClassificacoes"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  And Digitar Classificacoes "05AQAClassificacoes"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar busca "05AQAClassificacoes"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQAClassificacoes"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar busca "02AQAClassificacoes"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
    @tag12
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Classificacoes ""
    And Clicar botao "Salvar"
    And Validar Alert de erro