public class Main 
{
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Carlos", 30, "Desenvolvedor", 5000.00);
        Funcionario funcionario2 = new Funcionario("Ana", 25, "Designer", 4200.00);
        Funcionario funcionario3 = new Funcionario("Roberto", 40, "Gerente", 8500.00);
        
        funcionario1.apresentar();
        System.out.println();
        funcionario2.apresentar();
        System.out.println();
        funcionario3.apresentar();
    }
}