package org.example;
/*
 * Palíndromo:
 * Crear un algoritmo que verifique si una palabra o frase dada es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).
 */

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresamos una palabra o frase.
        System.out.print("Ingrese una palabra o frase: ");
        String entrada = scanner.nextLine();

        // Verificamos si la palabra introducida es un palíndromo.
        if (esPalindromo(entrada)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    // Eliminar espacios y convertir a minúsculas para hacer la comparación más sencilla,
    // compara la entrada original con su versión invertida.
    static boolean esPalindromo(String str) {
        String entrada = str.replaceAll("\\s", "").toLowerCase();

        // Creamos un objeto StringBuilder iniciandolo con el String entrada, invertimos la cadena con "reverse()",
        // volvemos a invertir de nuevo con "toString()" y con "equals()" compara la cadena original con su versión inertida.

        // Si la cadena original es igual a la invertida, es true por lo que es palindromo, de forma inversa dará false, por lo tanto no es palindromo.
        return entrada.equals(new StringBuilder(entrada).reverse().toString());
    }
}
