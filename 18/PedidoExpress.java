public class PedidoExpress extends Pedido {
    private double distanciaKm;
    private double taxaUrgencia;
    
    public PedidoExpress(int numero, String cliente, double distanciaKm, double taxaUrgencia){
        super(numero, cliente);
        this.distanciaKm = distanciaKm;
        this.taxaUrgencia = taxaUrgencia;
    }
    
    public double getDistanciaKm(){
        return distanciaKm;
    }
    public double getTaxaUrgencia(){
        return taxaUrgencia;
    }

    public void setDistanciaKm(double distanciaKm){
        this.distanciaKm = distanciaKm;
    }
    public void setTaxaUrgencia(double taxaUrgencia){
        this.taxaUrgencia = taxaUrgencia;
    }
    

    public double calcularFrete(){
        double taxaPorKm = 2.50;
        return (distanciaKm * taxaPorKm) + taxaUrgencia;
    }
    
   
    public void apresentarPedido(){
        System.out.println("Tipo: Pedido Express");
        super.apresentarPedido();
        System.out.println("Distancia: " + distanciaKm + " km");
        System.out.println("Taxa de Urgencia: R$ " + taxaUrgencia);
    }
}