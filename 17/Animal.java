public class Animal {
    protected String nome;
    protected int idade;
    protected double peso;
    
    public Animal(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getPeso(){
        return peso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void emitirSom(){
        System.out.println("O animal emite um som generico.");
    }
    
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
    }
}