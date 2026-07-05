print (" ==== BEM-VINDO ==== ");
print("Este é o sistema de indentificação de qual numero é maior!");
print(" ");

i = 0
res = 0

while i < 3:
    num = int(input("Qual é o seu numero: "))
    if res < num:
        res = num
    i = i + 1

print("O maior numero é: ", res);