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
Feature: Menu Administrativo Reclamacao > Motivos de Lote em branco
  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @Incluir_completo
   Scenario: Incluir registro completo 
    When Acessar menu "Reclamacao"
    And Acessar sub-menu "Motivos do lote em branco"
    And Clicar botao "Novo"
    Given Digitar Motivos do lote em branco "01AQAMOTLOTEMBRANCO"
    Then Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
 @Incluir
  Scenario: Incluir e inativar
  And Clicar botao "Novo"
  Given Digitar Motivos do lote em branco "02AQAMOTLOTEMBRANCO"
  And checkbox Inativo
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @Incluir
  Scenario: Incluir 
  Given Digitar Motivos do lote em branco "03AQAMOTLOTEMBRANCO"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @Validar_tela_de_busca
  Scenario: Validar tela de busca
  And Validar title "Prestador de serviço"
  And Filtro buscar "Ativos"
  And Filtro buscar "Inativos"
  And Filtro buscar "Ativos / Inativos"
  And Validar Caminho do Menu "Prestador de serviço"
  And Validar ordenacao tela de busca
  
  
    @Editar
  Scenario: Editar registro
  Given Digitar busca "03AQAMOTLOTEMBRANCO"
  And Clicar botao "Editar"
  Given Digitar Motivos do lote em branco "04AQAMOTLOTEMBRANCO"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @Duplicar
  Scenario: Duplicar Registro
  And Digitar busca "02AQAMOTLOTEMBRANCO"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  Given Digitar Motivos do lote em branco "05AQAMOTLOTEMBRANCO"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @Excluir_Busca
  Scenario: Excluir registro na busca
  And Digitar busca "05AQAMOTLOTEMBRANCO"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @Excluir_Editar
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQAMOTLOTEMBRANCO"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @Excluir_Busca
  Scenario: Excluir registro na busca
  And Digitar busca "02AQAMOTLOTEMBRANCO"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
    @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    Given Digitar Motivos do lote em branco ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
    
        @fechar_brownser
    Scenario: Encerrar
    Then fechar