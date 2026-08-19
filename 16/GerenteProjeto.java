public class GerenteProjeto extends Funcionario {
    private String metodologia;
    private int quantidadeProjetos;
    
    public GerenteProjeto(String nome, double salarioBase, String metodologia, int quantidadeProjetos){
        super(nome, salarioBase);
        this.metodologia = metodologia;
        this.quantidadeProjetos = quantidadeProjetos;
    }
    
    public String getMetodologia(){
        return metodologia;
    }
    public int getQuantidadeProjetos(){
        return quantidadeProjetos;
    }

    public void setMetodologia(String metodologia){
        this.metodologia = metodologia;
    }
    public void setQuantidadeProjetos(int quantidadeProjetos){
        this.quantidadeProjetos = quantidadeProjetos;
    }
    
  
    public double calcularSalarioFinal(){
        double bonusPorProjeto = 400.00;
        return salarioBase + (quantidadeProjetos * bonusPorProjeto);
    }
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Cargo: Gerente de Projeto");
        System.out.println("Metodologia: " + metodologia);
        System.out.println("Projetos Gerenciados: " + quantidadeProjetos);
    }
}