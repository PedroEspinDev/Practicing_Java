public class Raton extends Animal {
    public Raton(String nombre, double peso, double altura) {
        super(nombre, peso, altura);
    }

    public Raton() {
    }
    @Override
    public void hablar() {
        System.out.println("Roer! Roer! ");
    }
}
