public class SUV extends Veiculo {
    private boolean tracao4x4;
    
    public SUV(String placa, String modelo, double valorDiaria, boolean tracao4x4){
        super(placa, modelo, valorDiaria);
        this.tracao4x4 = tracao4x4;
    }
    
    public boolean isTracao4x4(){
        return tracao4x4;
    }

    public void setTracao4x4(boolean tracao4x4){
        this.tracao4x4 = tracao4x4;
    }
    
    
    public double calcularValorLocacao(int dias){
        double valorBase = valorDiaria * dias;
        double seguroObrigatorio = 100.00 * dias;
        return valorBase + seguroObrigatorio;
    }
    
 
    public void apresentar(){
        super.apresentar();
        System.out.println("Tracao 4x4: " + (tracao4x4 ? "Sim" : "Nao"));
    }
}