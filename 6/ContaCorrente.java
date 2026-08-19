public class ContaCorrente extends Conta {
    private double consultarSaldo;
 
    public ContaCorrente(int numero, String titular, double saldo, double consultarSaldo) {
        super(numero, titular, saldo);
        this.consultarSaldo = consultarSaldo;
    }
 
    public double getConsultarSaldo() {
        return consultarSaldo;
    }
 
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + consultarSaldo)) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na Conta Corrente.");
        } else {
            System.out.println("Saque recusado: valor excede o saldo e limite disponível.");
        }
    }
 
    public void apresentarContaCorrente() {
        apresentar();
        System.out.println("Saldo Disponível: R$ " + consultarSaldo);
    }
}