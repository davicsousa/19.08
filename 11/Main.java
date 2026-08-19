public class Main 
{
    public static void main(String[] args) {
        Pagamento pix = new PagamentoPix(150.00, "19/08/2026", "Compra Online", "chavepix@email.com");
        Pagamento cartao = new PagamentoCartao(450.00, "19/08/2026", "Eletronicos", "1234567890123456", 3);
        Pagamento boleto = new PagamentoBoleto(89.90, "19/08/2026", "Mensalidade", "34191.79001 01043.510047 91020.150008 5 900000000000");
        
        System.out.println("--- PROCESSANDO PAGAMENTOS ---");
        pix.processarPagamento();
        System.out.println();
        cartao.processarPagamento();
        System.out.println();
        boleto.processarPagamento();
    }
}