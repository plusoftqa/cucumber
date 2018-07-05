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
Feature: Menu Administrativo Localizacao > Regioes

  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"

  @Incluir_completo
  Scenario: Incluir Regioes
    And Acessar menu "Localizacao"
    And Acessar sub-menu "Regioes"
    And Clicar botao "Novo"
    And Digitar Regioes "01AQARegioes"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Incluir
  Scenario: Incluir regioes e Inativar
    And Clicar botao "Novo"
    And Digitar Regioes "02AQARegioes"
    And checkbox Inativo
    And Clicar botao "Salvar e Novo"
    And Validar Alert de Sucesso

  @Incluir
  Scenario: Incluir regioes
    And Digitar Regioes "03AQARegioes"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Validar_tela_de_busca
  Scenario: Validar tela de busca
    And Validar title "Regiões"
    And Filtro buscar "Ativos"
    And Filtro buscar "Inativos"
    And Filtro buscar "Ativos / Inativos"
    And Validar Caminho do Menu "Regiões"
    And Validar ordenacao tela de busca

  @Editar
  Scenario: Editar registro
    And Digitar busca "03AQARegioes"
    And Clicar botao "Editar"
    And Digitar Regioes "04AQARegioes"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Duplicar
  Scenario: Duplicar Registro
    And Digitar busca "02AQARegioes"
    And Clicar botao "Editar"
    And Clicar botao "Duplicar"
    And Digitar Regioes "05AQARegioes"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na tela de busca
    And Digitar busca "05AQARegioes"
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Editar
  Scenario: Inativar Registro
    And Digitar busca "04AQARegioes"
    And Clicar botao "Editar"
    And checkbox Inativo
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Excluir_Editar
  Scenario: Excluir registro apos editar
    And Digitar busca "04AQARegioes"
    And Clicar botao "Editar"
    And Clicar botao "Remover"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na busca
    And Digitar busca "02AQARegioes"
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Regioes ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
