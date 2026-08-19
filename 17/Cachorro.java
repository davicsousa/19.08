public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, int idade, double peso, String raca){
        super(nome, idade, peso);
        this.raca = raca;
    }
    
    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    
  
    public void emitirSom(){
        System.out.println("Au Au!");
    }
    
 
    public void apresentar(){
        super.apresentar();
        System.out.println("Especie: Cachorro");
        System.out.println("Raca: " + raca);
    }
}