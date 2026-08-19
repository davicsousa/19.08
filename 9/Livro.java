public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponibilidade;
    
    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAno(){
        return ano;
    }
    public boolean isDisponibilidade(){
        return disponibilidade;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    public void emprestarLivro(Pessoa pessoa){
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("O livro '" + titulo + "' foi emprestado com sucesso para " + pessoa.getNome());
        } else {
            System.out.println("O livro '" + titulo + "' nao esta disponivel para emprestimo.");
        }
    }
    
    public void devolverLivro(){
        if (!disponibilidade) {
            disponibilidade = true;
            System.out.println("O livro '" + titulo + "' foi devolvido e esta disponivel novamente.");
        } else {
            System.out.println("O livro '" + titulo + "' ja se encontra na biblioteca.");
        }
    }
    
    public void apresentar(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Disponivel: " + (disponibilidade ? "Sim" : "Nao"));
    }
}