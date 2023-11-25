import java.time.LocalDate;

/*
----------------------------Ejercicio I----------------------------------
Vamos a crear una clase Persona.java esta clase tendrá todas las propiedades que declaramos en
el ejercicio de los datos primitivos, debemos poder acceder y/o modificar a cada propiedad,
tendrá un constructor con todos los parámetros.

A continuación desde una clase main llamada Clase.java almacenaremos 10 personas en un array,
por último recorreremos el array e imprimiremos el siguiente mensaje por cada persona:

Hola me llamo {Nombre} {Apellidos} y tengo {Edad} años.
Nací el {fecha de nacimiento} y vivo en {Ciudad}
Actualmente estoy/no estoy trabajando y estoy/no estoy estudiando.
 */

public class Clase {
    public static void main(String[] args) {
        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Juan", "Perez", 20, LocalDate.of(1998, 5, 15), "Toledo", true, false);
        personas[1] = new Persona("Andres", "Torres", 65, LocalDate.of(1953, 10, 20), "Sevilla", true, false);
        personas[2] = new Persona("Jorge", "Suarez", 55, LocalDate.of(1963, 8, 10), "Madrid", true, false);
        personas[3] = new Persona("Maria", "Gomez", 25, LocalDate.of(1993, 3, 10), "Zaragoza", false, true);
        personas[4] = new Persona("Pedro", "Garcia", 30, LocalDate.of(1988, 1, 5), "Asturias", true, true);
        personas[5] = new Persona("Luis", "Rodriguez", 35, LocalDate.of(1983, 2, 20), "Cádiz", false, true);
        personas[6] = new Persona("Carlos", "Sanchez", 45, LocalDate.of(1973, 6, 30), "Albacete", false, false);
        personas[7] = new Persona("Sofia", "Romero", 50, LocalDate.of(1968, 7, 15), "Barcelona", true, false);
        personas[8] = new Persona("Fernanda", "Diaz", 60, LocalDate.of(1958, 9, 5), "Alicante", true, false);
        personas[9] = new Persona("Ana", "Martinez", 40, LocalDate.of(1978, 4, 25), "Murcia", true, false);

        for (Persona persona : personas) {
            System.out.println("Hola, me llamo " + persona.getNombre() + " " + persona.getApellido() +
                    " y tengo " + persona.getEdad() + " años.");
            System.out.println("Nací el " + persona.getFechaNacimiento() + " y vivo en " + persona.getCiudad() + ".");
            System.out.println("Actualmente " + (persona.obtenerEstadoActual()));
            System.out.println();

        }
    }
}
