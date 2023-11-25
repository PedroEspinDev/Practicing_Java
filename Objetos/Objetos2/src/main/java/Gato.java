public class Gato extends Animal{
    public Gato(String nombre, double peso, double altura) {
        super(nombre, peso, altura);
    }

    public Gato() {
    }
    @Override
    public void hablar() {
        System.out.println("Miau! Miau!" );
    }
}
