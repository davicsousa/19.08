public class ProdutoEletronico extends Produto {
    private int garantiaMeses;
    
    public ProdutoEletronico(int codigo, String nome, double preco, int garantiaMeses){
        super(codigo, nome, preco);
        this.garantiaMeses = garantiaMeses;
    }
    
    public int getGarantiaMeses(){
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }
    
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}