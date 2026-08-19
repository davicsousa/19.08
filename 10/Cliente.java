public class Cliente extends Pessoa {
    private double limiteCredito;
    
    public Cliente(String nome, int idade, double limiteCredito){
        super(nome, idade);
        this.limiteCredito = limiteCredito;
    }
    
    public double getLimiteCredito(){
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    
  
    public void apresentar(){
        super.apresentar();
        System.out.println("Limite de Credito: R$ " + limiteCredito);
    }
}