Algoritmo "Média"
// Disciplina   : Algotimo e Lógica de Programação]
// Professor   : Willian Szabo
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 12/05/2026
Var
// Seção de Declarações das variáveis
notas: vetor [1..5] de real
nome: vetor [1..5] de caracter
i: inteiro
media: real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
para i <- 1 ate 5 passo 1 faca
escreval("Qual é o nome do aluno(A): ")
leia(nome[i])
fimpara

para i <- 1 ate 5 passo 1 faça
escreval("Qual é a nota do(A) ", nome[i], ": ")
leia(notas[i])
fimpara

para i <- 1 ate 5 passo 1 faca
media <- media + notas[i]
fimpara

escreval("A média da turma é de: ", media/5)
Fimalgoritmo