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
Feature: Menu Administrativo Usuario > Grupo de usuarios
  @tag1
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "augustomarinho@plusoft.com.br" e senha "Mudar123"
    And Acessar modulo "Administrativo"
    
   @tag2
   Scenario: Acessar Menu Pessoa, Incluir uma Grade de Horarios
    And Acessar menu "Usuario"
    And Acessar sub-menu "Grupos de usuario"
    And Clicar botao "Novov1"
    And Incluir Grupo de usuarios"01AQAGRUPODEUSUARIOS"
    And Clicar botao "Salvarv1"
    And Validar Alert de Sucesso   
    
   @tag3
  Scenario: validar tela de busca
    And Validar title "Grupos de usuário"
    
  @tag4
  Scenario: Incluir um grupo de usuário e definir um modulo
  And Clicar botao "Novov1"
  And Digitar descricao grupo de usuario "02AQAGRUPODEUSUARIOS"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso 
  And Digitar no campo de busca v1 "02AQAGRUPODEUSUARIOS"
  And Clicar botao "Editarv1"
  And Selecionar modulo grupo de usuarios "OMNI - Básico"
  And Clicar botao "Associar Modulo"
  And Clicar botao "Salvar e Novov1"
  And Validar Alert de Sucesso
  
  
  @tag5
  Scenario: Incluir um grupo de usuários e associar um usuario
  And Digitar descricao grupo de usuario "03AQAGRUPODEUSUARIOS"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  And Digitar no campo de busca v1 "03AQAGRUPODEUSUARIOS"
  And Clicar botao "Editarv1"
  And Clicar botao "Associar Usuario"
  And Selecionar usuario grupo de usuarios "Augusto Marinho"  
  And Clicar botao "Salvar v1 Modal"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
  
  @tag6
  Scenario: Editar registro
  And Digitar no campo de busca v1 "03AQAGRUPODEUSUARIOS"
  And Clicar botao "Editarv1"
  And Digitar descricao grupo de usuario "04AQAGRUPODEUSUARIOS"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
  @tag7
  Scenario: Duplicar Registro
  And Digitar no campo de busca v1 "02AQAGRUPODEUSUARIOS"
  And Clicar botao "Editarv1"
  And Clicar botao "Duplicarv1"
  And Digitar descricao grupo de usuario "05AQAGRUPODEUSUARIOS"
  And Clicar botao "Salvarv1"
  And Validar Alert de Sucesso
  
  
    @tag9
  Scenario: Excluir registro na busca
  And Digitar no campo de busca v1 "05AQAGRUPODEUSUARIOS"
  And Clicar botao "Editarv1"
  And Clicar botao "Remover Modulo"
  And Clicar botao "confirmar"
  And Clicar botao "Salvarv1"
  And Digitar no campo de busca v1 "05AQAGRUPODEUSUARIOS"
  And Clicar botao "Excluir_buscarv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
  @tag10
  Scenario: Excluir apos clicar no botao editar
  And Digitar no campo de busca v1 "04AQAGRUPODEUSUARIOS"
  And Clicar botao "Editarv1"
  And Clicar botao "Remover Usuario"
  And Clicar botao "confirmar"
  And Clicar botao "Salvarv1"
  And Digitar no campo de busca v1 "04AQAGRUPODEUSUARIOS"  
  And Clicar botao "Editarv1"
  And Clicar botao "Excluirv1"
  And Clicar botao "confirmar"
  And Validar Alert de Sucesso
  
