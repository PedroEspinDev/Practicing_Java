package org.example;
/*
 * Fibonacci:
 * Desarrollar un algoritmo para generar los primeros N términos de la secuencia de Fibonacci.
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de términos de la secuencia de Fibonacci a generar
        System.out.print("Ingrese la cantidad de términos de la secuencia de Fibonacci a generar: ");
        int cantidadTerminos = scanner.nextInt();

        // Generar y mostrar los primeros términos de la secuencia de Fibonacci
        System.out.println("Los primeros " + cantidadTerminos + " términos de la secuencia de Fibonacci son:");
        for (int i = 0; i < cantidadTerminos; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

