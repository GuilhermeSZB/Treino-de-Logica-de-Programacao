package Java;


public class pessoa {
     
     String  nome;
     int idade;
     double altura;

    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

    public void aniversario(){
        System.out.println(nome + " Fez aniversário!");
        idade = idade + 1;
        System.out.println("Agora tem " + idade + " Anos.");
    }

    public pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }
 
    
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa("Guilherme", 17, 1.80);
        pessoa pessoa2 = new pessoa("João", 28, 1.95);

        pessoa1.apresentar();
        pessoa2.apresentar();

        pessoa1.aniversario();
        pessoa2.aniversario();
        
    }

   
}
