public class Analista extends Funcionario {
    private String areaEspecializacao;
    private double bonusProjeto;
    
    public Analista(String nome, double salarioBase, String areaEspecializacao, double bonusProjeto){
        super(nome, salarioBase);
        this.areaEspecializacao = areaEspecializacao;
        this.bonusProjeto = bonusProjeto;
    }
    
    public String getAreaEspecializacao(){
        return areaEspecializacao;
    }
    public double getBonusProjeto(){
        return bonusProjeto;
    }

    public void setAreaEspecializacao(String areaEspecializacao){
        this.areaEspecializacao = areaEspecializacao;
    }
    public void setBonusProjeto(double bonusProjeto){
        this.bonusProjeto = bonusProjeto;
    }
    
   
    public double calcularSalario(){
        return salarioBase + bonusProjeto;
    }
    

    public void apresentar(){
        super.apresentar();
        System.out.println("Area de Especializacao: " + areaEspecializacao);
        System.out.println("Bonus de Projeto: R$ " + bonusProjeto);
    }
}