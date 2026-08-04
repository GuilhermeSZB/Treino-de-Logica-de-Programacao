package Java;
import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Qual é sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá " + nome + "!");
        System.out.println("Você tem " + idade + " Anos.");
        sc.close();
    }
}
