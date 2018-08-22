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
Feature: Menu Administrativo Força de Vendas > Estagios de negociacao

  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"

  @Incluir_completo
  Scenario: Incluir registro completo
    And Acessar menu "Forca de vendas"
    And Acessar sub-menu "Estagios de negociacao"
    And Clicar botao "Novo"
    And Digitar Sequencia "01"
    And Select Tipo de negocio "01AQATIPODENEGOCIO"
    And Select Estagio de oportunidade "01AQAESTAGIO DE OPORTUNIDADE"
    And Digitar Percentual "20"
    And Digitar Prazo "10"
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Incluir_inativar
  Scenario: Incluir e inativar
    And Clicar botao "Novo"
    And Digitar Sequencia "02"
    And Select Tipo de negocio "01AQATIPODENEGOCIO"
    And Select Estagio de oportunidade "01AQAESTAGIO DE OPORTUNIDADE"
    And Digitar Percentual "20"
    And Digitar Prazo "10"
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar e Novo"
    And Validar Alert de Sucesso

  @Incluir
  Scenario: Incluir
    And Digitar Sequencia "03"
    And Select Tipo de negocio "01AQATIPODENEGOCIO"
    And Select Estagio de oportunidade "01AQAESTAGIO DE OPORTUNIDADE"
    And Digitar Percentual "20"
    And Digitar Prazo "10"
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
    And Clicar botao "Editar"
    And Digitar Sequencia "04"
    And Select Tipo de negocio "01AQATIPODENEGOCIO"
    And Select Estagio de oportunidade "01AQAESTAGIO DE OPORTUNIDADE"
    And Digitar Percentual "20"
    And Digitar Prazo "10"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Duplicar
  Scenario: Duplicar Registro
    And Clicar botao "Editar"
    And Clicar botao "Duplicar"
    And Digitar Sequencia "05"
    And Select Tipo de negocio "01AQATIPODENEGOCIO"
    And Select Estagio de oportunidade "01AQAESTAGIO DE OPORTUNIDADE"
    And Digitar Percentual "20"
    And Digitar Prazo "10"
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na busca
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Editar
  Scenario: Excluir apos clicar no botao editar
    And Clicar botao "Editar"
    And Clicar botao "Remover"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Excluir_Busca
  Scenario: Excluir registro na busca
    And Clicar botao "Excluir busca"
    And Clicar botao "confirmar"
    And Validar Alert de Sucesso

  @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Sequencia ""
    And Select Tipo de negocio "01AQATIPODENEGOCIO"
    And Select Estagio de oportunidade "01AQAESTAGIO DE OPORTUNIDADE"
    And Digitar Percentual "20"
    And Digitar Prazo "10"
    And Digitar Pontuacao "01"
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Digitar Sequencia "01"
    And Select Tipo de negocio "Nenhuma opção selecionada"
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Select Tipo de negocio "01AQATIPODENEGOCIO"
    And Select Estagio de oportunidade "Nenhuma opção selecionada"
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Select Estagio de oportunidade "01AQAESTAGIO DE OPORTUNIDADE"
    And Digitar Percentual ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Digitar Percentual "20"
    And Digitar Prazo ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Digitar Prazo "10"
    And Digitar Pontuacao ""
    And Clicar botao "Salvar"
    And Validar Alert de erro

  @fechar_brownser
  Scenario: Encerrar
    Then fechar
