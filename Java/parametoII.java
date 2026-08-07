package Java;

public class parametoII {

    public static void titulo(){
        System.out.println("===== Cadastro =====");
    }

    public static void linha(){
        System.out.println("===================");
    }

    public static void cadastro(String nome, int idade){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " Anos");
    }
    
    public static void main(String[] args) {
        titulo();
        cadastro("Guilherme", 17);
        linha();
    }
}
