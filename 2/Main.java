public class Main 
{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas", 20, "Engenharia de Software");
        Professor professor1 = new Professor("Mariana", 38, "Programacao");
        
        aluno1.apresentar();
        System.out.println();
        professor1.apresentar();
    }
}