public class ProdutoAlimenticio extends Produto {
    private String dataValidade;
    
    public ProdutoAlimenticio(int codigo, String nome, double preco, String dataValidade){
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }
    
    public String getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }
    
  
    public void apresentar(){
        super.apresentar();
        System.out.println("Data de Validade: " + dataValidade);
    }
}