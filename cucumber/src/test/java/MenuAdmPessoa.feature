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
Feature: Menu Administrativo Pessoa 

  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "augustomarinho@plusoft.com.br" e senha "Mudar123"
    And Acessar modulo "Administrativo"
    
  @tag2
  Scenario: Acessar Menu Pessoa, Incluir um CARGO
    And Acessar menu "PESSOA""
    And Acessar sub-menu "Cargo"
    And Clicar botao "Novo"
    And Incluir cargo "AQAAUTOMACAO"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
 @tag3
  Scenario: validar tela de busca
    And Validar Caminho do Menu "Plusoft CRM > Pessoa > Cargos > Buscar"
    And Validar title "Cargo"
    And Validar Tooltips "CSV"
    And Validar Tooltips "Atualizar"
    And Validar Tooltips "Imprimir"
    
  @tag4
  Scenario: Cadastrar um cargo
  And Clicar botao "Novo"
  And Validar Campo "Cargo"
  And Digitar cargo "QAAUTOMACAO_QA"
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @tag5
  Scenario: Incluir um cargo Inativo
  And Digitar cargo "QAAUTOMACAO_INATIVO"
  And checkbox Inativo
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag6
  Scenario: Tela de Busca Validar Campos Inativos e Ativos
  And Selecionar Opcao "Inativo"
  And Selecionar Opcao "Ativo"
  And Selecionar Opcao "Todos"
  And Digitar no campo de busca "QAAUTOMACAO"
  And Selecionar Opcao "Inativo"
  And Selecionar Opcao "Ativo"
  And Selecionar Opcao "Todos"
  
  @tag7
  Scenario: Editar registro
  And Digitar no campo de busca "QAAUTOMACAO_INATIVO"
  And Clicar botao "Editar"
  And Validar Caminho do Menu "Plusoft CRM > Pessoa > Cargos > QAAUTOMACAO_INATIVO"
  And Digitar cargo "QAAUTOMACAO_ATIVO"
  And checkbox Inativo
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @tag8
  Scenario: Duplicar Registro
  And Digitar no campo de busca "QAAUTOMACAO_QA"
  And Clicar botao "Editar"
  And Validar Caminho do Menu "Plusoft CRM > Pessoa > Cargos > QAAUTOMACAO_QA"
  And Clicar botao "Duplicar"
  And Digitar cargo "QAAUTOMACAO_AQA"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @tag9
  Scenario: Excluir registro na busca
  And Digitar no campo de busca "QAAUTOMACAO_QA"
  And Clicar botao "Excluir"
  And Clicar botao "Confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar no campo de busca "QAAUTOMACAO_AQA"
  And Clicar botao "Editar"
  And Validar Caminho do Menu "Plusoft CRM > Pessoa > Cargos > QAAUTOMACAO_AQA"
  And Clicar botao "Excluir"
  And Clicar botao "Confirmar"
  And Validar Alert de Sucesso
  
  @tag11
  Scenario: Excluir registro na busca
  And Digitar no campo de busca "QAAUTOMACAO_ATIVO"
  And Clicar botao "Excluir"
  And Clicar botao "Confirmar"
  And Validar Alert de Sucesso
  
  

  
  
  
  
   