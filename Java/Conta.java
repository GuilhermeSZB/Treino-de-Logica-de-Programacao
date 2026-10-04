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

public void sacar(double valor){
    if (this.saldo >= valor){
        this.saldo -= valor;
        System.out.println("Vocẽ sacou R$" + valor + " e ainda tem R$" + this.saldo + " na conta.");
    } else {
        System.out.println("Saldo insuficiente.");
    }
}
public void mostrarDados(){
    System.out.println("Titular: "+ this.titular);
    System.out.println("Saldo: "+ this.saldo);
}
public static void main(String[] args) {
    Conta conta1 = new Conta("Guilherme", 500);
    conta1.depositar(200);
    conta1.mostrarDados();
    conta1.sacar(200);

    Conta conta2 = new Conta("Joao", 1000);
    conta2.mostrarDados();
    conta2.sacar(1200);
}    

}
