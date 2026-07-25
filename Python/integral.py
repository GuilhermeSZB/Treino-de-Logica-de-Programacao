print("Qual é a area")
nums = []


for i in range(2):
    numero = float(input("Digite um número: "))
    nums.append(numero)
    
b = (nums[0]**2)/2
c = (nums[1]**2)/2

d = b - c

print(d)