public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    
    public Funcionario(String nome, int idade, String cargo, double salario){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCargo(){
        return cargo;
    }
    public double getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }
}
