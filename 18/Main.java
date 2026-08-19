import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        
        PedidoNormal p1 = new PedidoNormal(101, "Carlos Andrade", 50.0);
        p1.adicionarValor(150.0);
        p1.atualizarStatus("Em Processamento");
        
        PedidoExpress p2 = new PedidoExpress(102, "Fernanda Costa", 100.0, 30.0);
        p2.adicionarValor(200.0);
        p2.atualizarStatus("Enviado");
        
        PedidoRetirada p3 = new PedidoRetirada(103, "Roberto Alves", "Loja Central");
        p3.adicionarValor(180.0);
        p3.atualizarStatus("Pronto para Retirada");
        
        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);
        
        System.out.println("--- RELATORIO DE PEDIDOS ---");
        for (Pedido p : pedidos) {
            p.apresentarPedido();
            System.out.println("----------------------------------");
        }
    }
}