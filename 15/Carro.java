public class Carro extends Veiculo {
    private int quantidadePortas;
    
    public Carro(String placa, String modelo, double valorDiaria, int quantidadePortas){
        super(placa, modelo, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }
    
    public int getQuantidadePortas(){
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas){
        this.quantidadePortas = quantidadePortas;
    }
    
  
    public double calcularValorLocacao(int dias){
        double valorBase = valorDiaria * dias;
        double taxaLimpeza = 50.00;
        return valorBase + taxaLimpeza;
    }
    
    
    public void apresentar(){
        super.apresentar();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}