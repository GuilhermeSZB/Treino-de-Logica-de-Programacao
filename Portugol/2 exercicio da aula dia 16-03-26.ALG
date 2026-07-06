Algoritmo "Diferença"
// Disciplina   : Algotimo e Lógica de Programação]
// Professor   : Willian Szabo 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/03/2026
Var
// Seção de Declarações das variáveis 
num1: real
num2: real
diferenca: real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Qual é o primeiro numero: ")
leia(num1)
escreva("Qual é o segundo numero: ")
leia(num2)

se num1 > num2 entao
   diferenca <- num1 - num2
   escreva("O numero maior é o", num1, " A diferença é de: ", diferenca)
senao
     diferenca <- num2 - num1
     escreva("O numero maior é o", num2, " A diferença é de: ", diferenca)
fimse
     

Fimalgoritmo