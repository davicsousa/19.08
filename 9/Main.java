public class Main 
{
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas Ferreira", 20, "2023001");
        Professor professor1 = new Professor("Mariana Santos", 42, "Computacao");
        Livro livro1 = new Livro("Java Como Programar", "Deitel", 2017);
        
        System.out.println("--- DADOS INICIAIS ---");
        aluno1.apresentar();
        professor1.apresentar();
        livro1.apresentar();
        
        System.out.println("\n--- OPERACOES DE EMPRESTIMO ---");
        livro1.emprestarLivro(aluno1);
        livro1.emprestarLivro(professor1);
        
        System.out.println("\n--- OPERACOES DE DEVOLUCAO ---");
        livro1.devolverLivro();
        livro1.devolverLivro();
    }
}