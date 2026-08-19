public class Produto {
    protected int codigo;
    protected String nome;
    protected double preco;
    
    public Produto(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void apresentar(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
    }
}