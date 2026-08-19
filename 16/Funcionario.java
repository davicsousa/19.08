public class Funcionario {
    protected String nome;
    protected double salarioBase;
    
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public String getNome(){
        return nome;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalarioFinal(){
        return salarioBase;
    }
    
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario Base: R$ " + salarioBase);
    }
}