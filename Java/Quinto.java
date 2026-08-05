package Java;
import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}
