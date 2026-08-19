public class ContaPoupanca extends Conta {
    private double taxaRendimento;
 
    public ContaPoupanca(int numero, String titular, double saldo, double taxaRendimento) {
        super(numero, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }
 
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
 
    public void apresentarContaPoupanca() {
        apresentar();
        System.out.println("Taxa de Rendimento: " + taxaRendimento + "%");
    }
}