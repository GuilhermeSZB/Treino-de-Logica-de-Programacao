package Java;

public class media {
    
    public static double med(double num, double num1){
        return (num + num1)/2;
    }

    public static void main(String[] args) {
        double resultado = med(2, 2);
        System.out.println("A média destes numeros é de " + resultado);
    }
}
