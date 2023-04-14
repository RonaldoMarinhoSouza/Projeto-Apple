
@teste
Feature: Inclusao de produto mala de compras 
Como usuario   
Quero buscar um produto   
Para inclusao na mala de compras 
 

Scenario: Validar inclusao do produto     
Given que escolhe o produto na home    
And informo o tamanho    
And confirmo o tamanho
When selecionar o produto
Then valida a descricao do produto
And inclusao na mala de compras


  
