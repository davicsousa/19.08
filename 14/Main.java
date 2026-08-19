public class Main 
{
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas Ferreira", 20, "2023101");
        Professor professor = new Professor("Mariana Santos", 42, "Computacao");
        Funcionariobiblioteca funcionario = new Funcionariobiblioteca("Roberto Alves", 35, "GER-01");
        
        System.out.println("--- TESTE ALUNO (LIMITE: 3) ---");
        aluno.realizarEmprestimo("Java Como Programar");
        aluno.realizarEmprestimo("Estruturas de Dados");
        aluno.realizarEmprestimo("Engenharia de Software");
        aluno.realizarEmprestimo("Redes de Computadores");
        aluno.verificarLimiteEmprestimos();
        aluno.devolverLivro("Java Como Programar");
        aluno.verificarLimiteEmprestimos();
        
        System.out.println("\n--- TESTE PROFESSOR (LIMITE: 5) ---");
        professor.realizarEmprestimo("Banco de Dados");
        professor.verificarLimiteEmprestimos();
        
        System.out.println("\n--- TESTE FUNCIONARIO BIBLIOTECA (LIMITE: 10) ---");
        funcionario.realizarEmprestimo("Sistemas Operacionais");
        funcionario.verificarLimiteEmprestimos();
    }
}