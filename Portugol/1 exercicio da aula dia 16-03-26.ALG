Algoritmo "Media"
// Disciplina   : Algotimo e Lógica de Programação]
// Professor   : Willian Szabo 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/03/2026
Var
// Seção de Declarações das variáveis 
nota1: real
nota2: real
nota3: real
nota4: real
media: real


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreva("Qual é sua primeira nota: ")
leia(nota1)
escreva("Qual é sua segunda nota: ")
leia(nota2)
escreva("Qual é sua terceira nota: ")
leia(nota3)
escreva("Qual é sua quarta nota: ")
leia(nota4)

media <- (nota1 + nota2 + nota3 + nota4) / 4
escreva ("A media é de: ", media)

se media >= 70 entao
   escreva("Você esta aprovado!")
senao
     escreva("Você é um animal")
fimse

Fimalgoritmo