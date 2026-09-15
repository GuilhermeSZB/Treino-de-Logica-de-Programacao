package Java;
import java.util.Scanner;

public class pessoa {
    static Scanner sc = new Scanner(System.in);
    static String nome =  null;
    static int idade = 0;
    static double altura = 0;

    public static void apresentar(String nome, int idade, double altura){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    public static void aniversario(String nome, int idade){
        System.out.println(nome + " Fez aniversário!");
        int idniver = idade + 1;
        System.out.println("Agora tem " + idniver + " Anos.");
    }

    public static void perguntas(){
        System.out.print("Qual é seu nome: ");
        nome = sc.next();

        System.out.print("Qual é sua idade: ");
        idade = sc.nextInt();

        System.out.print("Qual sua altura: ");
        altura = sc.nextDouble();
    }

    public static void user(){
        perguntas();
        apresentar(nome, idade, altura);
        System.out.println(" ");
        aniversario(nome, idade);
    }

    public static void main(String[] args) {
        System.out.println("A Primeira pessoa");
        user();

        System.out.println("A Segunda pessoa");
        user();

        sc.close();
    }

   
}
