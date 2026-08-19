public class Passaro extends Animal {
    private String especiePassaro;
    
    public Passaro(String nome, int idade, double peso, String especiePassaro){
        super(nome, idade, peso);
        this.especiePassaro = especiePassaro;
    }
    
    public String getEspeciePassaro(){
        return especiePassaro;
    }

    public void setEspeciePassaro(String especiePassaro){
        this.especiePassaro = especiePassaro;
    }
    

    public void emitirSom(){
        System.out.println("Piu Piu!");
    }
    

    public void apresentar(){
        super.apresentar();
        System.out.println("Especie de Passaro: " + especiePassaro);
    }
}