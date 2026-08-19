   public class Conta {
    private int numero;
    private String titular;
    public double saldo;
 
    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
 
    public int getNumero() {
        return numero;
    }
 
    public String getTitular() {
        return titular;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }
 
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
 
    public void apresentar() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}