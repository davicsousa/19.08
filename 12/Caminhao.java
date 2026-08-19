public class Caminhao extends Veiculo {
    private int quantidadeEixos;
    
    public Caminhao(String placa, String modelo, double capacidadeCarga, int quantidadeEixos){
        super(placa, modelo, capacidadeCarga);
        this.quantidadeEixos = quantidadeEixos;
    }
    
    public int getQuantidadeEixos(){
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos){
        this.quantidadeEixos = quantidadeEixos;
    }
    
  
    public double calcularFrete(double distancia){
        double taxaEixo = quantidadeEixos * 20.0;
        double valorBase = distancia * 5.0;
        return valorBase + taxaEixo;
    }
    

    public void apresentar(){
        super.apresentar();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
    }
}