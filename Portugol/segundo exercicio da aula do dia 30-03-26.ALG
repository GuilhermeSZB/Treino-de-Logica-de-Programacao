Algoritmo "semnome"
// Disciplina   : Algotimo e Lógica de Programação]
// Professor   : Willian Szabo 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/03/2026
Var
// Seção de Declarações das variáveis 
conc:real
larg:real
dist:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Qual é a altura do concreto em cm: ")
leia(conc)
escreval("Qual é largura da faixa em cm: ")
leia(larg)
escreval("Qual é a distancia da malha de ferro em cm: ")
leia(dist)

se (conc >=30) e (larg >= 700) e (dist >= 35) entao
   escreval("Esta aprovado o asfalto")
senao
   escreval("esta reprovado o asfalto")
fimse


Fimalgoritmo