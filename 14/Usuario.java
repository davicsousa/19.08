public class Usuario {
    protected String nome;
    protected int idade;
    protected int limiteLivros;
    protected int quantidadeEmprestada;
    
    public Usuario(String nome, int idade, int limiteLivros){
        this.nome = nome;
        this.idade = idade;
        this.limiteLivros = limiteLivros;
        this.quantidadeEmprestada = 0;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getLimiteLivros(){
        return limiteLivros;
    }
    public int getQuantidadeEmprestada(){
        return quantidadeEmprestada;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setLimiteLivros(int limiteLivros){
        this.limiteLivros = limiteLivros;
    }
    public void setQuantidadeEmprestada(int quantidadeEmprestada){
        this.quantidadeEmprestada = quantidadeEmprestada;
    }
    
    public void realizarEmprestimo(String livro){
        if (quantidadeEmprestada < limiteLivros) {
            quantidadeEmprestada++;
            System.out.println(nome + " realizou o emprestimo do livro: '" + livro + "'");
        } else {
            System.out.println("Emprestimo recusado para " + nome + ". Limite maximo atingido (" + limiteLivros + " livros).");
        }
    }
    
    public void devolverLivro(String livro){
        if (quantidadeEmprestada > 0) {
            quantidadeEmprestada--;
            System.out.println(nome + " devolveu o livro: '" + livro + "'");
        } else {
            System.out.println(nome + " nao possui livros pendentes para devolucao.");
        }
    }
    
    public void verificarLimiteEmprestimos(){
        System.out.println("Usuario: " + nome + " | Livros Emprestados: " + quantidadeEmprestada + "/" + limiteLivros);
    }
}