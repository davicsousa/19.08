public class Tecnico extends Funcionario {
    private int servicosRealizados;
    private double valorPorServico;
    
    public Tecnico(String nome, double salarioBase, int servicosRealizados, double valorPorServico){
        super(nome, salarioBase);
        this.servicosRealizados = servicosRealizados;
        this.valorPorServico = valorPorServico;
    }
    
    public int getServicosRealizados(){
        return servicosRealizados;
    }
    public double getValorPorServico(){
        return valorPorServico;
    }

    public void setServicosRealizados(int servicosRealizados){
        this.servicosRealizados = servicosRealizados;
    }
    public void setValorPorServico(double valorPorServico){
        this.valorPorServico = valorPorServico;
    }
    
    
    public double calcularBonus(){
        return servicosRealizados * valorPorServico;
    }
}