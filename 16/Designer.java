public class Designer extends Funcionario {
    private String ferramentaPrincipal;
    private String especialidade;
    
    public Designer(String nome, double salarioBase, String ferramentaPrincipal, String especialidade){
        super(nome, salarioBase);
        this.ferramentaPrincipal = ferramentaPrincipal;
        this.especialidade = especialidade;
    }
    
    public String getFerramentaPrincipal(){
        return ferramentaPrincipal;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public void setFerramentaPrincipal(String ferramentaPrincipal){
        this.ferramentaPrincipal = ferramentaPrincipal;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    @Override
    public double calcularSalarioFinal(){
        double auxilioCriativo = 300.00;
        return salarioBase + auxilioCriativo;
    }
    
    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Cargo: Designer");
        System.out.println("Ferramenta Principal: " + ferramentaPrincipal);
        System.out.println("Especialidade: " + especialidade);
    }
}