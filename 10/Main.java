public class Main 
{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Roberto Alves", 35, 5000.00);
        Funcionario funcionario1 = new Funcionario("Fernanda Costa", 28, "Analista de Sistemas", 4500.00);
        
        System.out.println("--- DADOS DO CLIENTE ---");
        cliente1.apresentar();
        
        System.out.println("\n--- DADOS DO FUNCIONARIO ---");
        funcionario1.apresentar();
    }
}