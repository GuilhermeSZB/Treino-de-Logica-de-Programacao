package Java;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double conta = 0;
        int res = 0;
        while (res == 0 ) {
            System.out.println("===== Calculadora =====");
            System.out.println(" ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Mutiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.println(" ");

            System.out.print("Escolha: ");
            int opcao = sc.nextInt();

            if (opcao == 1 ) {
                System.out.print("Qual é o primeiro numero da soma: ");
                num1 = sc.nextDouble();

                System.out.print("Qual é o segundo numero da soma: ");
                num2 = sc.nextDouble();

                conta = num1 + num2;
                System.out.println("A soma é de " + conta);

            }   else  if (opcao == 2 ) {

                System.out.print("Qual é o primeiro numero da Subtração: ");
                num1 = sc.nextDouble();

                System.out.print("Qual é o segundo numero da Subtração: ");
                num2 = sc.nextDouble();

                conta = num1 - num2;
                System.out.println("A subtração é de " + conta);

            }   else  if (opcao == 3 ) {

                System.out.print("Qual é o primeiro numero da multiplicação: ");
                num1 = sc.nextDouble();

                System.out.print("Qual é o segundo numero da multiplicação: ");
                num2 = sc.nextDouble();

                conta = num1 * num2;
                System.out.println("A multiplicação é de " + conta);

            }   else  if (opcao == 4 ) {

                System.out.print("Qual é o primeiro numero da divisão: ");
                num1 = sc.nextDouble();

                System.out.print("Qual é o segundo numero da divisão: ");
                num2 = sc.nextDouble();

                    if (num2 != 0) {
                        conta = num1 / num2;
                        System.out.println("A divisão é de " + conta); 
                    } else {
                        System.out.println("Não é possível dividir por zero!");
                    }

            } else if (opcao == 5) {

                res = 1;

            } else {
                System.out.println("Digite o numero certo!");
            }


        }

        sc.close();
    }
}
