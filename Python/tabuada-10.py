print(" ==== BEM-VINDO ==== ");
print("Este é o sistema da tabuada do 1 até o 10");
print(" ");

n = float(input("Qual é o numero que você precisa de saber a tabuada: "));
i = 1
res = None

while i < 11:
    res = n * i
    print(n, " X ", i, " = ", res)
    i = i + 1