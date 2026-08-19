public class Main 
{
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos Andrade", 8000.00, 2500.00);
        Vendedor vendedor = new Vendedor("Beatriz Lima", 2500.00, 45000.00, 0.05);
        Tecnico tecnico = new Tecnico("Diego Santos", 3500.00, 12, 40.00);
        
        System.out.println("--- RELATORIO DE PAGAMENTO ---");
        gerente.apresentarRelatorio();
        System.out.println();
        vendedor.apresentarRelatorio();
        System.out.println();
        tecnico.apresentarRelatorio();
    }
}