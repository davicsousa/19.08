public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;
    
    public PagamentoCartao(double valor, String data, String descricao, String numeroCartao, int parcelas){
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }
    
    public String getNumeroCartao(){
        return numeroCartao;
    }
    public int getParcelas(){
        return parcelas;
    }

    public void setNumeroCartao(String numeroCartao){
        this.numeroCartao = numeroCartao;
    }
    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }
    
    
    public void processarPagamento(){
        double valorParcela = valor / parcelas;
        System.out.println("Processando Pagamento via Cartao de Credito");
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor Total: R$ " + valor);
        System.out.println("Cartao Final: " + numeroCartao.substring(numeroCartao.length() - 4));
        System.out.println("Parcelado em: " + parcelas + "x de R$ " + valorParcela);
        System.out.println("Status: Autorizacao de cartao confirmada em " + data);
    }
}