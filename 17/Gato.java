public class Gato extends Animal {
    private String raca;
    
    public Gato(String nome, int idade, double peso, String raca){
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
        System.out.println("Miau!");
    }
    
   
    public void apresentar(){
        super.apresentar();
        System.out.println("Especie: Gato");
        System.out.println("Raca: " + raca);
    }
}