print (" ==== BEM-VINDO ==== ");
print("Este é o sistema de média de 3 notas!");
print(" ");

n1 = float(input("Qual é a primeira nota do aluno(a): "))
n2 = float(input("Qual é a segunda nota do aluno(a): "))
n3 = float(input("Qual é a terceira nota do aluno(a): "))

media = (n1 + n2 + n3 )/ 3

if media >= 7:
    print("Aprovado!")
elif media >= 5 and media < 7:
    print("Recuperação!")
else:
    print("Reprovado!")
    