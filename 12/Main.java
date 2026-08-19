public class Main 
{
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ABC-1234", "Volvo FH", 20000.0, 4);
        Van van = new Van("DEF-5678", "Renault Master", 1500.0, true);
        Motocicleta moto = new Motocicleta("GHI-9012", "Honda Cargo", 50.0, 150);
        
        double distancia = 100.0;
        
        System.out.println("--- CALCULOS DE FRETE (Distancia: " + distancia + " km) ---");
        caminhao.apresentar();
        System.out.println("Valor do Frete: R$ " + caminhao.calcularFrete(distancia));
        
        System.out.println("\n----------------------------------");
        van.apresentar();
        System.out.println("Valor do Frete: R$ " + van.calcularFrete(distancia));
        
        System.out.println("\n----------------------------------");
        moto.apresentar();
        System.out.println("Valor do Frete: R$ " + moto.calcularFrete(distancia));
    }
}