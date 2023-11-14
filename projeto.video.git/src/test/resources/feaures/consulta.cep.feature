#Author: natanaelrrsouza@hotmail.com

@regressivos
Feature: Buscar cep no correio
  Como usuario do correio
  Quero informar um cep na busca
  Para validar os dados de retorno

  @positivo
  Scenario: Realizar a busca do cep
    Given enviar os dados para busca
    Then validar os dados retornado
    
  
