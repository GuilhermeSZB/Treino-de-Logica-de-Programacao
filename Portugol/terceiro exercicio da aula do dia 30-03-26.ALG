Algoritmo "semnome"
// Disciplina   : Algotimo e Lógica de Programação]
// Professor   : Willian Szabo 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 30/03/2026
Var
// Seção de Declarações das variáveis 
 a: logico
 def: logico
 cria: logico
 obes: logico
 gest: logico

 pr:inteiro

conc:real
larg:real
dist:real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("Qual sistema você que utilizar?")
escreval("1- Fila Prioritaria")
escreval("2- Asfalto")
escreval("Responda com 1 ou 2")
leia(pr)

se(pr = 1) entao
      escreval("Seja bem-vindo, este algorimo vai te informar se você entra em atendimento preferencial")
      escreval("Você tem 60 anos ou mais (Responda com V/F): ")
      leia(a)
      escreval("Você possui alguma deficiência (Responda com V/F): ")
      leia(def)
      escreval("Você pssui criança de colo (Responda com V/F): ")
      leia(cria)
      escreval("Você possui obsesidade (Responda com V/F): ")
      leia(obes)
      escreval("Você é gestante (Responda com V/F): ")
      leia(gest)

        se (a ou def ou cria ou obes ou gest) entao
        escreval("Você tem atentidmento de prioritario")
        senao
        escreval("Você não possui atendimento prioritario")
        fimse
fimse

se (pr = 2) entao
   escreval("Qual é a altura do concreto em cm: ")
   leia(conc)
   escreval("Qual é largura da faixa em cm: ")
   leia(larg)
   escreval("Qual é a distancia da malha de ferro em cm: ")
   leia(dist)

   se (conc >=30) e (larg =< 700) e (dist >= 35) entao
   escreval("Esta aprovado o asfalto")
   senao
   escreval("esta reprovado o asfalto")
   fimse
fimse

Fimalgoritmo