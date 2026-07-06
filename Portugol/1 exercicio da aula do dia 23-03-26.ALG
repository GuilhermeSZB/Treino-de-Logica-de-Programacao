Algoritmo "Dias em Meses"
// Disciplina   : Algotimo e Lógica de Programação]
// Professor   : Willian Szabo
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/03/2026
Var
// Seção de Declarações das variáveis
dia: inteiro
resultado: inteiro
semana: inteiro
mes: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
escreva("Quantos dias para ser cauculado: ")
leia(dia)
se (dia > 30) entao
   mes <- dia div 30
   dia <- dia - (mes * 30)
   
   se (dia > 7) entao
      semana <- dia div 7
      dia <- dia - (semana * 7)
      escreva(mes, " meses, ", semana, " semanas, ", dia, " dias")
fimse
fimse

se (dia > 7) entao
   semana <- dia div 7
   dia <- dia - (semana * 7)
   escreva(semana, " semanas, ", dia, " dias")
fimse

se (dia < 7) entao
   escreva(dia, " Dias")
   
fimse
   


Fimalgoritmo