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
Feature: Cadastrar Nova Pessoa

  @Acesso_sistema
  Scenario: Cadastrar Nova Pessoa
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Call Center"
    And Clicar botao Novo Atendimento
    And Clicar botao Identificar Pessoa e acionar botao novo
    And Preencher Campos Obrigatorios
    And Clicar botao Salvar
    Then Cliente incluido com sucesso

  @Incluir_completo
  Scenario: Criar uma ocorrencia valida
    Given Gerar Protocolo
    And Abrir ocorrencia
    And Preencher todos os campos obrigatorios
    And Criar um follow up
    And Salvar ocorrencia
    And Verifica codigo de ocorrencia
