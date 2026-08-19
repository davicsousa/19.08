public class Vendedor extends Funcionario {
    private double totalVendas;
    private double percentualComissao;
    
    public Vendedor(String nome, double salarioBase, double totalVendas, double percentualComissao){
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    public double getPercentualComissao(){
        return percentualComissao;
    }

    public void setTotalVendas(double totalVendas){
        this.totalVendas = totalVendas;
    }
    public void setPercentualComissao(double percentualComissao){
        this.percentualComissao = percentualComissao;
    }
    
    
    public double calcularBonus(){
        return totalVendas * percentualComissao;
    }
}