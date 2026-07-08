print (" ==== BEM-VINDO ==== ");
print("Este é o sistema de adivinhar o numero");
print(" ");

import random;

num = random.randint (1, 100);
res = None

def analise1():
    res = int(input("Qual é o valor: "));
    if res == num:
        print("Acertou o Valor!")
    elif res < num:
        print("Tente Um Numero Maior!")
        analise1();
    else:
        print("Tente um Numero Menor!")
        analise1();


analise1();