package Java;
import java.util.Scanner;

public class Setimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual é sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 70) {
            System.out.println("Voto Facultativo");
        } else if (idade >= 18 && idade <= 69) {
            System.out.println("Voto Obrigatório");
        } else if (idade >= 16 && idade <= 17){
            System.out.println("Voto Facultativo");
        } else {
            System.out.println("Não Pode Votar Ainda");
        }


        sc.close();
    }
}
