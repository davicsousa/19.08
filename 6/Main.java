public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1001, "João Silva", 1500.00, 500.00);
        ContaPoupanca cp = new ContaPoupanca(2002, "Maria Souza", 3000.00, 0.5);
 
        System.out.println("====== Conta Corrente ======");
        cc.apresentarContaCorrente();
 
        System.out.println("\n====== Operações na Conta Corrente ======");
        cc.depositar(200.00);
        cc.sacar(500.00);
        cc.sacar(3000.00);
 
        System.out.println("\n====== Dados Atualizados (Conta Corrente) ======");
        cc.apresentarContaCorrente();
 
        System.out.println("\n====== Conta Poupança ======");
        cp.apresentarContaPoupanca();
 
        System.out.println("\n====== Operações na Conta Poupança ======");
        cp.depositar(500.00);
        cp.sacar(200.00);
 
        System.out.println("\n====== Dados Atualizados (Conta Poupança) ======");
        cp.apresentarContaPoupanca();
    }
}