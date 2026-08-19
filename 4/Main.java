public class Main 
{
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto1 = new Moto("Honda", "CB 500", 2023, "Eletrica");
        
        carro1.apresentar();
        System.out.println();
        moto1.apresentar();
    }
}