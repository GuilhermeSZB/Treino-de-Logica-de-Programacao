package Java;
import java.util.Scanner;

public class relembrando {
    static Scanner sc = new Scanner(System.in);
    static double numero;
    static double num1;
    static double num2;

    private static double nums(){
        System.out.print("Qual é o numero: ");
        return numero = sc.nextDouble();

    }

    private static double soma(double num1, double num2){
        return (num1 + num2);
    }

    public static void main(String[] args) {
        num1 = nums();
        num2 = nums();
        double res = soma(num1, num2);

        System.out.println("O resultado é de " + res);
        sc.close();
    }
}
