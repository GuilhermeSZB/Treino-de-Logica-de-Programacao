package Java;

public class quadrado {
    
    public static double quadrado1(double quad){
        return quad * quad;
    }

    public static void main(String[] args) {
        double resultado = quadrado1(5);
        System.out.println("O quadrado do numero é de " + resultado);
    }
}
