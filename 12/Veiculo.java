public class Veiculo {
    protected String placa;
    protected String modelo;
    protected double capacidadeCarga;
    
    public Veiculo(String placa, String modelo, double capacidadeCarga){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public String getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public double calcularFrete(double distancia){
        return distancia * 2.0;
    }
    
    public void apresentar(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " kg");
    }
}