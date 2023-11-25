/*
---------------------Ejercicio II---------------------
Vamos a crear una clase Animal.java esta clase tendrá las propiedades nombre, peso y altura,
crearemos las clases Perro.java, Gato.java y Raton.java, cada una de estas clases tendrá las tres
propiedades anteriores y además el perro podrá ladrar, el gato maullar y el ratón roer.

A continuación desde una clase main llamada AnimalesDomesticos.java almacenaremos 5 perros,
5 gatos y 5 ratones en sus respectivos arrays, por último recorreremos cada array e imprimiremos
el siguiente mensaje por cada animal:

{nombre} es un {Perro/Gato/Ratón} pesa {peso} y mide {altura}.
---------------------Ejercicio II---------------------
Tras recorrer el array se mostrará el siguiente mensaje:
El animal más pesado es: {nombre} con {peso} Kg
 */

public class AnimalesDomesticos {
    public static void main(String[] args) {

        //Generamos una array para los 5 animales de cada tipo.
        Animal[] animalesDomesticos = new Animal[15];
        animalesDomesticos[0] = new Perro("Peke", 7.4, 35.2);
        animalesDomesticos[1] = new Perro("Toby", 5.2, 25.6);
        animalesDomesticos[2] = new Perro("Luna", 26.1, 64.1);
        animalesDomesticos[3] = new Perro("Coco", 2.4, 21.2);
        animalesDomesticos[4] = new Perro("Runnie", 52.4, 73.3);
        animalesDomesticos[5] = new Gato("Mishi", 3.4, 31.8);
        animalesDomesticos[6] = new Gato("Whiskers", 4.2, 29.5);
        animalesDomesticos[7] = new Gato("Luna", 3.8, 30.2);
        animalesDomesticos[8] = new Gato("Félix", 4.5, 28.0);
        animalesDomesticos[9] = new Gato("Garfield", 5.0, 32.1);
        animalesDomesticos[10] = new Raton("Stuart", 0.360, 0.90);
        animalesDomesticos[11] = new Raton("Jerry", 0.250, 0.75);
        animalesDomesticos[12] = new Raton("Nibbles", 0.180, 0.60);
        animalesDomesticos[13] = new Raton("Squeaky", 0.320, 0.85);
        animalesDomesticos[14] = new Raton("Bigotes", 0.200, 0.70);

        System.out.println("----------------------------------------------------------------------------");

        //Bucle para recorrer el array e imprimir cada animal.
        for (Animal animal : animalesDomesticos) {
            System.out.println(animal.getNombre() + " es un, " + animal.getClass().getName() + " pesa " + animal.getPeso() + "kg " + ", y mide " + animal.getAltura() + "cm");

        }

        /*
        ------ IMPLEMENTACIONES FUERA DE ENUNCIADO ------
        Generamos un objeto de tipo Perro, y llamamos a los métodos que se llaman iguales,
        pero ejecutan acciones distintas.
        */

        System.out.println("----------------------------------------------------------------------------");
        Perro perro = new Perro();
        perro.setNombre("Manchas");
        perro.llamar();
        perro.llamar("pelota");

        System.out.println("----------------------------------------------------------------------------");

        //Instaciamos un objeto de cada animal con un método común (hablar).

        Animal sonidoAnimal = new Perro();
        sonidoAnimal.hablar();
        Animal sonidoAnimal1 = new Gato();
        sonidoAnimal1.hablar();
        Animal sonidoAnimal2 = new Raton();
        sonidoAnimal2.hablar();
        System.out.println("----------------------------------------------------------------------------");
        // Encuentra el animal más pesado automáticamente
        Animal animalMasPesado = encontrarAnimalMasPesado(animalesDomesticos);

        // Muestra el mensaje
        if (animalMasPesado != null) {
            System.out.println("El animal más pesado es: " + animalMasPesado.getNombre() +
                    " con " + animalMasPesado.getPeso() + " Kg");
        } else {
            System.out.println("No hay animales en el array.");
        }
    }

    // Método para encontrar el animal más pesado en un array de animales
    public static Animal encontrarAnimalMasPesado(Animal[] animales) {
        if (animales == null || animales.length == 0) {
            return null; // Retorna null si el array está vacío o es null
        }

        Animal masPesado = animales[0]; // Supongamos que el primer animal es el más pesado

        for (Animal animal : animales) {
            if (animal.getPeso() > masPesado.getPeso()) {
                masPesado = animal;
            }
        }

        return masPesado;
    }
}

