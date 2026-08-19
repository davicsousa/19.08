import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Desenvolvedor("Rodrigo Lima", 6000.00, "Java", 12));
        funcionarios.add(new Designer("Juliana Costa", 4500.00, "Figma", "UI/UX"));
        funcionarios.add(new GerenteProjeto("Carlos Andrade", 8500.00, "Scrum", 5));
        
        System.out.println("--- RELATORIO GERAL DE FUNCIONARIOS ---");
        for (Funcionario f : funcionarios) {
            f.apresentar();
            System.out.println("Salario Final: R$ " + f.calcularSalarioFinal());
            System.out.println("----------------------------------");
        }
    }
}