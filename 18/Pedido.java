public class Pedido {
    protected int numero;
    protected String cliente;
    protected double valorTotal;
    protected String status;
    
    public Pedido(int numero, String cliente){
        this.numero = numero;
        this.cliente = cliente;
        this.valorTotal = 0.0;
        this.status = "Pendente";
    }
    
    public int getNumero(){
        return numero;
    }
    public String getCliente(){
        return cliente;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public String getStatus(){
        return status;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setCliente(String cliente){
        this.cliente = cliente;
    }
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    public void setStatus(String status){
        this.status = status;
    }
    
    public void adicionarValor(double valor){
        this.valorTotal += valor;
    }
    
    public double calcularFrete(){
        return 0.0;
    }
    
    public double calcularValorFinal(){
        return valorTotal + calcularFrete();
    }
    
    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }
    
    public void apresentarPedido(){
        System.out.println("Numero do Pedido: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Status: " + status);
        System.out.println("Valor dos Produtos: R$ " + valorTotal);
        System.out.println("Frete: R$ " + calcularFrete());
        System.out.println("Valor Final: R$ " + calcularValorFinal());
    }
}