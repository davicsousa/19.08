public class Funcionario {
    protected String nome;
    protected double salario;
    protected String setor;
    
    public Funcionario(String nome, double salario, String setor){
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }
    
    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }
    public String getSetor(){
        return setor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario Base: " + salario);
        System.out.println("Setor: " + setor);
    }
}