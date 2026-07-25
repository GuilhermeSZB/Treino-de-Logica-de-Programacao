#Só um texto no começo para deixar bonito
print (" ==== BEM-VINDO ==== ");
print("Este é o JokenPo!");
print(" ");

#Puxei a biblioteca
import random;

#Variaveis
num = 0
num2 = 0


#E fiz em função para se a caso eu quiser melhorar depois já deixer pronto!
def inicio ():
    print("Esse numeros são os respctetivo a cada iten do jokenpo")
    print("1-Teseoura")
    print("2-Pedra")
    print("3-Papel")
    num = int(input("Digite o numero correspondente ao que você quer jogar: "))
    num2 = random.randint(1,3);
    if num == 1 and num2 == 1:
        print("O robo jogou tesoura");
        print("O Jogo empatou");
    elif num == 1 and num2 == 2:
        print("O robo jogou pedra");
        print("Você Perdeu")
    elif num == 1 and num2 == 3:
        print ("O robo jogou papel");
        print("Você ganhou!");
    elif num == 2 and num2 == 2:
        print("O robo jogou pedra");
        print("O Jogo empatou");
    elif num == 2 and num2 == 3:
        print ("O robo jogou papel");
        print("Você Perdeu")
    elif num == 2 and num2 == 1:
        print("O robo jogou tesoura");
        print("Você ganhou!");
    elif num == 3 and num2 == 3:
        print ("O robo jogou papel");
        print("O Jogo empatou");
    elif num == 3 and num2 == 1:
        print("O robo jogou tesoura");
        print("Você Perdeu")
    elif num == 3 and num2 == 2:
        print("O robo jogou pedra");
        print("Você ganhou!");

inicio();


