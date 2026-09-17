package Java;
import java.util.Scanner;

public class pessoa {
     static Scanner sc = new Scanner(System.in);
     String nome =  null;
     int idade = 0;
     double altura = 0;

    public void apresentar(String nome, int idade, double altura){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    public void aniversario(String nome, int idade){
        System.out.println(nome + " Fez aniversário!");
        int idniver = idade + 1;
        System.out.println("Agora tem " + idniver + " Anos.");
    }

    public void perguntas(){
        System.out.print("Qual é seu nome: ");
        nome = sc.next();

        System.out.print("Qual é sua idade: ");
        idade = sc.nextInt();

        System.out.print("Qual sua altura: ");
        altura = sc.nextDouble();
    }

    public void user(){
        perguntas();
        apresentar(nome, idade, altura);
        System.out.println(" ");
        aniversario(nome, idade);
    }
    
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();
        pessoa pessoa2 = new pessoa();

        pessoa1.user();
        pessoa2.user();

        System.out.println(pessoa1.altura);
        System.out.println(pessoa2.altura);
        
        sc.close();
    }

   
}
