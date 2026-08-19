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
    
    public double calcularBonus(){
        return 0.0;
    }
    
    public double calcularSalarioFinal(){
        return salarioBase + calcularBonus();
    }
    
    public void apresentarRelatorio(){
        System.out.println("Funcionario: " + nome);
        System.out.println("Salario Base: R$ " + salarioBase);
        System.out.println("Bonus: R$ " + calcularBonus());
        System.out.println("Salario Final: R$ " + calcularSalarioFinal());
    }
}