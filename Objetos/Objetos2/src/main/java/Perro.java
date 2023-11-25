public class Perro extends Animal {
    //Constructor heredando los atributos de la clase padre,
    //de esta forma usamos super y no this.
    public Perro(String nombre, double peso, double altura) {
        super(nombre, peso, altura);
    }

    public Perro() {
    }

    //Utilizamos @Override para sobreescribir el método de la clase base.
    @Override
    public void hablar() {
        System.out.println("Guau! Guau!");
    }
    //--------------------------------------------------------------------------------
    //Métodos agenos al ejercicio(Sobrecarga).
    public void llamar(){
        System.out.println(getNombre() + " ven aqui!");
    }
    public void llamar(String objeto){
        System.out.println(getNombre() + " traeme la " + objeto);
    }
}
