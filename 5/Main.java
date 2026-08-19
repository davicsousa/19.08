public class Main 
{
    public static void main(String[] args) {
        ProdutoEletronico eletronico1 = new ProdutoEletronico(101, "Smartphone", 2500.00, 12);
        ProdutoAlimenticio alimenticio1 = new ProdutoAlimenticio(202, "Leite", 5.50, "10/10/2026");
        
        eletronico1.apresentar();
        System.out.println();
        alimenticio1.apresentar();
    }
}