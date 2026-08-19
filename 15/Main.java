public class Main 
{
    public static void main(String[] args) {
        Carro carro = new Carro("ABC-1234", "Civic", 150.00, 4);
        Moto moto = new Moto("DEF-5678", "CB 500", 80.00, 500);
        SUV suv = new SUV("GHI-9012", "SW4", 300.00, true);
        
        int dias = 5;
        
        System.out.println("--- CALCULOS DE LOCACAO (" + dias + " dias) ---");
        carro.apresentar();
        System.out.println("Valor da Locacao: R$ " + carro.calcularValorLocacao(dias));
        
        System.out.println("\n----------------------------------");
        moto.apresentar();
        System.out.println("Valor da Locacao: R$ " + moto.calcularValorLocacao(dias));
        
        System.out.println("\n----------------------------------");
        suv.apresentar();
        System.out.println("Valor da Locacao: R$ " + suv.calcularValorLocacao(dias));
    }
}