print(" =====Bem-Vindo===== ");
print(" ");
print("Este é o Sistema de Ímpar ou Par");
print(" ");

num = float(input("Qual é o numero que você precisa saber: "))
res = (num % 2);

if res == 0:
    print("O numero ", num, " é par!");
else:
    print("O numero ", num, " é ímpar!")
