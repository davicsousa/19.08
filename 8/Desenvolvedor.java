public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;
    private int horasExtras;
    
    public Desenvolvedor(String nome, double salarioBase, String linguagemPrincipal, int horasExtras){
        super(nome, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
        this.horasExtras = horasExtras;
    }
    
    public String getLinguagemPrincipal(){
        return linguagemPrincipal;
    }
    public int getHorasExtras(){
        return horasExtras;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal){
        this.linguagemPrincipal = linguagemPrincipal;
    }
    public void setHorasExtras(int horasExtras){
        this.horasExtras = horasExtras;
    }
    
  
    public double calcularSalario(){
        double valorHoraExtra = 50.00;
        return salarioBase + (horasExtras * valorHoraExtra);
    }
    
   
    public void apresentar(){
        super.apresentar();
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
        System.out.println("Horas Extras Trabalhadas: " + horasExtras);
    }
}