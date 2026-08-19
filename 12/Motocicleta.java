public class Motocicleta extends Veiculo {
    private int cilindradas;
    
    public Motocicleta(String placa, String modelo, double capacidadeCarga, int cilindradas){
        super(placa, modelo, capacidadeCarga);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    
   
    public double calcularFrete(double distancia){
        double taxaFixaEntrega = 15.0;
        return (distancia * 1.5) + taxaFixaEntrega;
    }
    
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}