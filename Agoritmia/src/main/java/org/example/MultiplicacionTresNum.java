package org.example;
/*
 * Multiplicación de Tres Números:
 * Crear un algoritmo que multiplique tres números dados como entrada.
 */

import java.util.Scanner;

public class MultiplicacionTresNum {
    public static void main(String[] args) {
        // Objeto Scanner para introducir valores.
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese tres números.
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Calcular la multiplicación de los tres números.
        double resultado = multiplicarNumeros(numero1, numero2, numero3);

        // Imprimir el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }

    // Función donde se ejecuta la lógica de la multiplicación.
    static double multiplicarNumeros(double num1, double num2, double num3) {
        // Realizar la multiplicación de los tres números.
        return num1 * num2 * num3;
    }
}

