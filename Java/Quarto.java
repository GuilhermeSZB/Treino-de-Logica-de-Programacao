package Java;
import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é su nome: ");
        String nome = sc.nextLine();

        System.out.print("Qual sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Qual sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("===== CADASTRO =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("===================");

        sc.close();
    }
}
