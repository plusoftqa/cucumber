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
Feature: Menu Administrativo Força de Vendas > Controle de Metas

  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"

  @Incluir_completo
  Scenario: Incluir registro completo
    And Acessar menu "Forca de vendas"
    And Acessar sub-menu "Controles de metas"
    And Clicar botao "Novo"
    And Digitar Controle de metas "01AQACONTROLE DE METAS"
    And Digitar Data inicio "01/01/2018"
    And Digitar Data final "31/01/2018"
    And Digitar Valor "152325"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Incluir_inativar
  Scenario: Incluir e inativar
    And Clicar botao "Novo"
    And Digitar Controle de metas "02AQACONTROLE DE METAS"
    And Digitar Data inicio "01/01/2018"
    And Digitar Data final "31/01/2018"
    And Digitar Valor "152325"
    And checkbox Inativo
    And Clicar botao "Salvar e Novo"
    And Validar Alert de Sucesso

  @Incluir
  Scenario: Incluir
    And Digitar Controle de metas "03AQACONTROLE DE METAS"
    And Digitar Data inicio "01/01/2018"
    And Digitar Data final "31/01/2018"
    And Digitar Valor "152325"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Validar_tela_de_busca
  Scenario: Validar tela de busca
    And Validar title "Tipos de Endereco"
    And Filtro buscar "Ativos"
    And Filtro buscar "Inativos"
    And Filtro buscar "Ativos / Inativos"
    And Validar Caminho do Menu "Cidades"
    And Validar ordenacao tela de busca

  @Editar
  Scenario: Editar registro
    And Digitar busca "03AQACONTROLE DE METAS"
    And Clicar botao "Editar"
    And Digitar Controle de metas "04AQACONTROLE DE METAS"
    And Digitar Data inicio "01/01/2018"
    And Digitar Data final "31/01/2018"
    And Digitar Valor "152325"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Duplicar
  Scenario: Duplicar Registro
    And Digitar busca "02AQACONTROLE DE METAS"
    And Clicar botao "Editar"
    And Clicar botao "Duplicar"
    And Digitar Controle de metas "05AQACONTROLE DE METAS"
    And Digitar Data inicio "01/01/2018"
    And Digitar Data final "31/01/2018"
    And Digitar Valor "152325"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na busca
    And Digitar busca "05AQACONTROLE DE METAS"
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Editar
  Scenario: Excluir apos clicar no botao editar
    And Digitar busca "04AQACONTROLE DE METAS"
    And Clicar botao "Editar"
    And Clicar botao "Remover"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na busca
    And Digitar busca "02AQACONTROLE DE METAS"
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Controle de metas ""
    And Digitar Data inicio "01/01/2018"
    And Digitar Data final "31/01/2018"
    And Digitar Valor "152325"
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Digitar Controle de metas "qa"
    And Digitar Data inicio ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Digitar Data inicio "01/01/2018"
    And Digitar Data final ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Digitar Data final "31/01/2018"
    And Digitar Valor ""
    And Clicar botao "Salvar"
    And Validar Alert de erro

  @fechar_brownser
  Scenario: Encerrar
    Then fechar
