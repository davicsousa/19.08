public class Moto extends Veiculo {
    private int cilindradas;
    
    public Moto(String placa, String modelo, double valorDiaria, int cilindradas){
        super(placa, modelo, valorDiaria);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }
    

    public double calcularValorLocacao(int dias){
        double valorBase = valorDiaria * dias;
        if (dias > 3) {
            double desconto = valorBase * 0.10;
            return valorBase - desconto;
        }
        return valorBase;
    }
    

    public void apresentar(){
        super.apresentar();
        System.out.println("Cilindradas: " + cilindradas + " cc");
    }
}