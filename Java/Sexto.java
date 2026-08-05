package Java;
import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}
