print (" ==== BEM-VINDO ==== ");
print("Este é o sistema de Fatorial");
print(" ");

n = int(input("Qual é o fatorial que você precisa saber o resultado: "))
soma = 1

while n > 1:
    soma = soma * n
    n -= 1

print("O fatorial deste numero é de: ", soma);