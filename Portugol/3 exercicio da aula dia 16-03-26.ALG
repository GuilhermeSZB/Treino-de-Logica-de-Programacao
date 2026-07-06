Algoritmo "PositivoIgualNegativo"
// Disciplina   : Algotimo e Lógica de Programação]
// Professor   : Willian Szabo 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/03/2026
Var
// Seção de Declarações das variáveis 
num1: real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Qual é o primeiro numero: ")
leia(num1)

se num1 < 0 entao
   escreva("Este numero é negativo")
senao
     se num1 = 0 entao
        escreva("seu numero é igual a zero")
     senao
        escreva("O seu numero é maior que zero")
     fimse
fimse
Fimalgoritmo