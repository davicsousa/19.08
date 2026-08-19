public class Gerente extends Funcionario {
    private int quantidadeFuncionariosSupervisionados;
    private double percentualBonus;
    
    public Gerente(String nome, double salario, String setor, int quantidadeFuncionariosSupervisionados, double percentualBonus){
        super(nome, salario, setor);
        this.quantidadeFuncionariosSupervisionados = quantidadeFuncionariosSupervisionados;
        this.percentualBonus = percentualBonus;
    }
    
    public int getQuantidadeFuncionariosSupervisionados(){
        return quantidadeFuncionariosSupervisionados;
    }
    public double getPercentualBonus(){
        return percentualBonus;
    }

    public void setQuantidadeFuncionariosSupervisionados(int quantidadeFuncionariosSupervisionados){
        this.quantidadeFuncionariosSupervisionados = quantidadeFuncionariosSupervisionados;
    }
    public void setPercentualBonus(double percentualBonus){
        this.percentualBonus = percentualBonus;
    }
    
    public double calcularSalarioFinal(){
        return salario + (salario * (percentualBonus / 100));
    }
    
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Funcionarios Supervisionados: " + quantidadeFuncionariosSupervisionados);
        System.out.println("Percentual de Bonus: " + percentualBonus + "%");
    }
}