package Java;

public class maturidade {
    
    public static String verificaridade(int idade){
         if (idade >= 18){
             return "Você é de Maior!";
        } else {
            return "Você é  de Menor!";
        }
    }

    public static void main(String[] args) {
        String resultado = verificaridade(17);

        System.out.println(resultado);
    }
}
