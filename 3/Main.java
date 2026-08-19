public class Main 
{
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Carlos", 6000.00, "TI", 5, 10.0);
        
        gerente1.apresentar();
        System.out.println("Salario Final: " + gerente1.calcularSalarioFinal());
    }
}