import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        
        animais.add(new Cachorro("Rex", 4, 15.5, "Labrador"));
        animais.add(new Gato("Mimi", 2, 4.2, "Siames"));
        animais.add(new Passaro("Piu", 1, 0.3, "Canario"));
        
        System.out.println("--- REGISTRO DE ANIMAIS ---");
        for (Animal animal : animais) {
            animal.apresentar();
            System.out.print("Som emitido: ");
            animal.emitirSom();
            System.out.println("----------------------------------");
        }
    }
}