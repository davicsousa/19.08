public class Main 
{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas Ferreira", 20, "Engenharia de Software", 8.5, 7.5);
        Professor professor1 = new Professor("Mariana Santos", 42, "Programacao Orientada a Objetos", 6500.00);
        
        System.out.println("--- DADOS DO ALUNO ---");
        aluno1.apresentar();
        System.out.println("Media das Notas: " + aluno1.calcularMedia());
        
        System.out.println("\n--- DADOS DO PROFESSOR ---");
        professor1.apresentar();
    }
}