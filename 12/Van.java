public class Van extends Veiculo {
    private boolean refrigerada;
    
    public Van(String placa, String modelo, double capacidadeCarga, boolean refrigerada){
        super(placa, modelo, capacidadeCarga);
        this.refrigerada = refrigerada;
    }
    
    public boolean isRefrigerada(){
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada){
        this.refrigerada = refrigerada;
    }
    
    
    public double calcularFrete(double distancia){
        double valorBase = distancia * 3.0;
        if (refrigerada) {
            valorBase += 50.0;
        }
        return valorBase;
    }
    
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Refrigerada: " + (refrigerada ? "Sim" : "Nao"));
    }
}