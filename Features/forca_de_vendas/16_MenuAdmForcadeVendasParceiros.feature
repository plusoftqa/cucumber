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
Feature: Menu Administrativo Força de Vendas > Parceiros

  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"

  @Incluir_completo
  Scenario: Incluir registro completo
    And Acessar menu "Forca de vendas"
    And Acessar sub-menu "Parceiros"
    And Clicar botao "Novo"
    And Digitar Parceiros "01AQAPARCEIROS"
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Incluir_inativar
  Scenario: Incluir e inativar
    And Clicar botao "Novo"
    And Digitar Parceiros "02AQAPARCEIROS"
    And Digitar Pontuacao "01"
    And checkbox Inativo
    And Clicar botao "Salvar e Novo"
    And Validar Alert de Sucesso

  @Incluir
  Scenario: Incluir
    And Digitar Parceiros "03AQAPARCEIROS"
    And Digitar Pontuacao "01"
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
    And Digitar busca "03AQAPARCEIROS"
    And Clicar botao "Editar"
    And Digitar Parceiros "04AQAPARCEIROS"
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Duplicar
  Scenario: Duplicar Registro
    And Digitar busca "02AQAPARCEIROS"
    And Clicar botao "Editar"
    And Clicar botao "Duplicar"
    And Digitar Parceiros "05AQAPARCEIROS"
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na busca
    And Digitar busca "05AQAPARCEIROS"
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Editar
  Scenario: Excluir apos clicar no botao editar
    And Digitar busca "04AQAPARCEIROS"
    And Clicar botao "Editar"
    And Clicar botao "Remover"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na busca
    And Digitar busca "02AQAPARCEIROS"
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Parceiros ""
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar"
    And Validar Alert de erro

  @fechar_brownser
  Scenario: Encerrar
    Then fechar
