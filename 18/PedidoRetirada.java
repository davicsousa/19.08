public class PedidoRetirada extends Pedido {
    private String localRetirada;
    
    public PedidoRetirada(int numero, String cliente, String localRetirada){
        super(numero, cliente);
        this.localRetirada = localRetirada;
    }
    
    public String getLocalRetirada(){
        return localRetirada;
    }

    public void setLocalRetirada(String localRetirada){
        this.localRetirada = localRetirada;
    }
    

    public double calcularFrete(){
        return 0.0;
    }
    
  
    public double calcularValorFinal(){
        double descontoRetirada = valorTotal * 0.05;
        return valorTotal - descontoRetirada;
    }
    
    
    public void apresentarPedido(){
        System.out.println("Tipo: Pedido Retirada no Local");
        super.apresentarPedido();
        System.out.println("Local de Retirada: " + localRetirada);
        System.out.println("Desconto Aplicado (Retirada): 5%");
    }
}