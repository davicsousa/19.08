public class Main 
{
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Rodrigo Lima", 5000.00, "Java", 8);
        Analista analista = new Analista("Fernanda Alves", 6000.00, "Sistemas", 1500.00);
        Estagiario estagiario = new Estagiario("Gabriel Souza", 1500.00, "Ciencia da Computacao", 30);
        
        System.out.println("--- DESENVOLVEDOR ---");
        dev.apresentar();
        System.out.println("Salario Final: R$ " + dev.calcularSalario());
        
        System.out.println("\n--- ANALISTA ---");
        analista.apresentar();
        System.out.println("Salario Final: R$ " + analista.calcularSalario());
        
        System.out.println("\n--- ESTAGIARIO ---");
        estagiario.apresentar();
        System.out.println("Salario Final: R$ " + estagiario.calcularSalario());
    }
}