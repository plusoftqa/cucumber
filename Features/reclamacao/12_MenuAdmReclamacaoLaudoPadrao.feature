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
Feature: Menu Administrativo Reclamacao > Laudo padrao
  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @Incluir_completo
   Scenario: Incluir registro completo 
    When Acessar menu "Reclamacao"
    And Acessar sub-menu "Laudos padrao"
    And Clicar botao "Novo"
    Given Digitar Laudo padrao "01AQALAUDOPADRAO"
    And Select Tipo "Consumidor"
    And Digitar Laudo "TESTE QA ESTA FUNCIONANDO"
    Then Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
 @Incluir
  Scenario: Incluir e inativar
  And Clicar botao "Novo"
  Given Digitar Laudo padrao "02AQALAUDOPADRAO"
  And Select Tipo "Consumidor"
  And Digitar Laudo "TESTE QA ESTA FUNCIONANDO"
  And checkbox Inativo
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @Incluir
  Scenario: Incluir 
  Given Digitar Laudo padrao "03AQALAUDOPADRAO"
  And Select Tipo "Consumidor"
  And Digitar Laudo "TESTE QA ESTA FUNCIONANDO"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @Validar_tela_de_busca
  Scenario: Validar tela de busca
  And Validar title "Forma de ressarcimento"
  And Filtro buscar "Ativos"
  And Filtro buscar "Inativos"
  And Filtro buscar "Ativos / Inativos"
  And Validar Caminho do Menu "Forma de ressarcimento"
  And Validar ordenacao tela de busca
  
  
    @Editar
  Scenario: Editar registro
  Given Digitar busca "03AQALAUDOPADRAO"
  And Clicar botao "Editar"
  Given Digitar Laudo padrao "04AQALAUDOPADRAO"
  And Select Tipo "Consumidor"
  And Digitar Laudo "TESTE QA ESTA FUNCIONANDO"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @Duplicar
  Scenario: Duplicar Registro
  And Digitar busca "02AQALAUDOPADRAO"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  Given Digitar Laudo padrao "05AQALAUDOPADRAO"
  And Select Tipo "Consumidor"
  And Digitar Laudo "TESTE QA ESTA FUNCIONANDO"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @Excluir_Busca
  Scenario: Excluir registro na busca
  And Digitar busca "05AQALAUDOPADRAO"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @Excluir_Editar
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQALAUDOPADRAO"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @Excluir_Busca
  Scenario: Excluir registro na busca
  And Digitar busca "02AQALAUDOPADRAO"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
    @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    Given Digitar Laudo padrao ""
    And Select Tipo "Consumidor"
    And Digitar Laudo "TESTE QA ESTA FUNCIONANDO"
    And Clicar botao "Salvar"
    And Validar Alert de erro
    Given Digitar Laudo padrao "TESTEQA"
    And Select Tipo "Nenhuma opção selecionada"
    And Clicar botao "Salvar"
    And Validar Alert de erro
    
        @fechar_brownser
    Scenario: Encerrar
    Then fechar