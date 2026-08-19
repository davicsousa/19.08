public class PedidoNormal extends Pedido {
    private double distanciaKm;
    
    public PedidoNormal(int numero, String cliente, double distanciaKm){
        super(numero, cliente);
        this.distanciaKm = distanciaKm;
    }
    
    public double getDistanciaKm(){
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm){
        this.distanciaKm = distanciaKm;
    }
    
   
    public double calcularFrete(){
        double taxaPorKm = 1.50;
        return distanciaKm * taxaPorKm;
    }
    
    
    public void apresentarPedido(){
        System.out.println("Tipo: Pedido Normal");
        super.apresentarPedido();
        System.out.println("Distancia: " + distanciaKm + " km");
    }
}