public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;
    
    public PagamentoBoleto(double valor, String data, String descricao, String codigoBarras){
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
    }
    
    public String getCodigoBarras(){
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras){
        this.codigoBarras = codigoBarras;
    }
    
   
    public void processarPagamento(){
        System.out.println("Processando Pagamento via Boleto Bancario");
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: R$ " + valor);
        System.out.println("Codigo de Barras: " + codigoBarras);
        System.out.println("Status: Boleto gerado em " + data + ". Aguardando compensacao bancaria.");
    }
}