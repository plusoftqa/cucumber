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
Feature: Menu Administrativo Reclamacao > Fabrica
  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @Incluir_completo
   Scenario: Incluir registro completo 
    When Acessar menu "Reclamacao"
    And Acessar sub-menu "Fabrica"
    And Clicar botao "Novo"
    Given Digitar Fabrica "01AQAFABRICA"
    And Checkbox Fabrica
    And Checkbox Laboratorio
    Then Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    
 @Incluir_inativar
  Scenario: Incluir e inativar
  And Clicar botao "Novo"
  Given Digitar Fabrica "02AQAFABRICA"
  And Checkbox Fabrica
  And Checkbox Laboratorio
  And checkbox Inativo
  And Clicar botao "Salvar e Novo"
  And Validar Alert de Sucesso
  
  @Incluir
  Scenario: Incluir 
  Given Digitar Fabrica "03AQAFABRICA"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @Validar_tela_de_busca
  Scenario: Validar tela de busca
  And Validar title "Estado de ânimo"
  And Filtro buscar "Ativos"
  And Filtro buscar "Inativos"
  And Filtro buscar "Ativos / Inativos"
  And Validar Caminho do Menu "Estado de ânimo"
  And Validar ordenacao tela de busca
  
  
    @Editar
  Scenario: Editar registro
  And Digitar busca "03AQAFABRICA"
  And Clicar botao "Editar"
  Given Digitar Fabrica "04AQAFABRICA"
  And Checkbox Fabrica
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @Duplicar
  Scenario: Duplicar Registro
  And Digitar busca "02AQAFABRICA"
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
  Given Digitar Fabrica "05AQAFABRICA"
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
  @Excluir_Busca
  Scenario: Excluir registro na busca
  And Digitar busca "05AQAFABRICA"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @Excluir_Editar
  Scenario: Excluir apos clicar no botao editar
  And Digitar busca "04AQAFABRICA"
  And Clicar botao "Editar"
  And Clicar botao "Remover"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @Excluir_Busca
  Scenario: Excluir registro na busca
  And Digitar busca "02AQAFABRICA"
  And Clicar botao "Excluir busca"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
    @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    Given Digitar Fabrica ""
    And Checkbox Fabrica
    And Checkbox Laboratorio
    And Clicar botao "Salvar"
    And Validar Alert de erro
    
        @fechar_brownser
    Scenario: Encerrar
    Then fechar