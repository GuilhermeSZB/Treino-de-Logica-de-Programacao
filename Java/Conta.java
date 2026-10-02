package Java;

public class Conta {

    String titular;
    double saldo;


public Conta(String titular, double saldo){
    this.titular = titular;
    this.saldo = saldo;
} 

public void depositar(double valor){
   this.saldo += valor; 
}

public void mostrarSaldo(){
    System.out.println(this.saldo);
}
public static void main(String[] args) {
    Conta conta1 = new Conta("Guilherme", 500);
    conta1.depositar(200);
    conta1.mostrarSaldo();
}    

}
