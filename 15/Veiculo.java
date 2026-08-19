public class Veiculo {
    protected String placa;
    protected String modelo;
    protected double valorDiaria;
    
    public Veiculo(String placa, String modelo, double valorDiaria){
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
    
    public String getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public double getValorDiaria(){
        return valorDiaria;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setValorDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }
    
    public double calcularValorLocacao(int dias){
        return valorDiaria * dias;
    }
    
    public void apresentar(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor Diaria: R$ " + valorDiaria);
    }
}