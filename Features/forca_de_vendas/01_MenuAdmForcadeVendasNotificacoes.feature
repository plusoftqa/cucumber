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
Feature: Menu Administrativo Força de vendas > Notificacao
  @Acesso_sistema
  Scenario: Logar acessar Modulo Administrativo
    Given Abrir brownser
    And Acessar Sistema com o usuario "automacaoqa" e senha "Testeqa123"
    And Acessar modulo "Administrativo"
    
   @Incluir_completo
   Scenario: Incluir registro completo
    And Acessar menu "Forca de vendas"
    And Acessar sub-menu "Notificacoes"
    And Clicar botao "Novo"
    And Digitar Tempo de Notificacao antes do vencimento "10"
    And Selecionar Periodo "Dias"
    And Checkbox Notificar o proprietario da Oportunidade
    And Checkbox Notificar Responsaveis do time
    And Checkbox Notificar Notificar email
    And Digitar Informar todos os email que serao notificados "teste@teste.com.br"
    And Clicar botao "Salvar"
    And Validar Alert de Sucesso   
    


  
  @Validar_tela_de_busca
  Scenario: Validar tela de busca
  And Validar title "País"
  And Validar Caminho do Menu "Pais"
  And Validar ordenacao tela de busca
  
  
    @Editar
  Scenario: Editar registro
  And Clicar botao "Editar"
    And Digitar Tempo de Notificacao antes do vencimento "10"
    And Selecionar Periodo "Dias"
    And Checkbox Notificar o proprietario da Oportunidade
    And Checkbox Notificar Responsaveis do time
    And Checkbox Notificar Notificar email
  And Clicar botao "Salvar"
  And Validar Alert de Sucesso
  
   @Duplicar
  Scenario: Duplicar Registro
  And Clicar botao "Editar"
  And Clicar botao "Duplicar"
    And Digitar Tempo de Notificacao antes do vencimento "10"
    And Selecionar Periodo "Dias"
    And Checkbox Notificar o proprietario da Oportunidade
    And Checkbox Notificar Responsaveis do time
    And Checkbox Notificar Notificar email
    And Digitar Informar todos os email que serao notificados "teste@teste.com.br"
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
  

  
    @Validar_Alert_Erro
  Scenario: Validar Alert de erro
    And Clicar botao "Novo"
    And Digitar Tempo de Notificacao antes do vencimento ""
    And Selecionar Periodo "Dias"    
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Digitar Tempo de Notificacao antes do vencimento "10"
    And Selecionar Periodo "Nenhuma opção selecionada"  
    And Clicar botao "Salvar"
    And Validar Alert de erro
    And Selecionar Periodo "Dias" 
    And Checkbox Notificar Notificar email
    And Digitar Informar todos os email que serao notificados ""
    And Clicar botao "Salvar"
    And Validar Alert de erro
    
    @fechar_brownser
    Scenario: Encerrar
    Then fechar