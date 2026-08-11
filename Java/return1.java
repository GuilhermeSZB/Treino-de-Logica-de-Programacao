package Java;

public class return1 {
    
    public static int idadedobro(int idade){
        return idade * 2;
    }

    public static void main(String[] args) {
        int resultado = idadedobro(17);
        System.out.println("O dobro da idade é de " + resultado);
    }
}
