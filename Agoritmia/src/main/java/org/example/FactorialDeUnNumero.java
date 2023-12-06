package org.example;
/*
 * Factorial de un Número:
 * Implementar un algoritmo para calcular el factorial de un número entero dado.
 */

import java.util.Scanner;

public class FactorialDeUnNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Calcular el factorial del número ingresado.
        long factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);

    }

    static long calcularFactorial(int n) {
        // Validar que el número no sea negativo.
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }

        // Inicializar el resultado del factorial.
        long resultado = 1;

        // Calcular el factorial utilizando un bucle.
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}

