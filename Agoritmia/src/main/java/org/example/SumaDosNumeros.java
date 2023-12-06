package org.example;

/*
 * Suma de Dos Números:
 * Escribir un algoritmo que tome dos números como entrada y devuelva su suma.
 */
public class SumaDosNumeros {
    public static void main(String[] args) {
        System.out.println("-------SUMA DE DOS NUMEROS-------");
        int resultado = suma(5, 7);
        System.out.println("resultado = " + resultado);
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}
