package org.example;
/*
 * Números Primos:
 * Crear un algoritmo que determine si un número dado es primo o no.
 */
public class NumerosPrimos {
    public static void main(String[] args) {
        
        // Puedes cambiar este número para probar otros valores.
        int num = 17;

        if (esPrimo(num)) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
        }
    }

    static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos.
        }
        //Usamos Math.sqrt para calcular la raíz cuadrada de "i",
        //se utiliza para limitar la cantidad de iteraciones en el bucle que verifica si un número es divisible por algún otro número.

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si es divisible por algún número entre 2 y la raíz cuadrada, no es primo.
            }
        }

        return true; // Si no es divisible por ningún número entre 2 y la raíz cuadrada, es primo.
    }
}
