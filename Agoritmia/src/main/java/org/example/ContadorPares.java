package org.example;

/*
 * Contador de Pares:
 * Desarrollar un algoritmo que cuente la cantidad de números pares en una lista dada.
 */
public class ContadorPares {
    public static void main(String[] args) {
        // Lista predetermianda
        int[] listaNum = {2, 5, 3, 7, 9, 14, 11, 6};

        // Contamos la cantidad de números pares.
        int cantidadPares = contarPares(listaNum);

        System.out.println("La cantidad de números pares es: " + cantidadPares);

    }

    // Verificamos si el numero es par.
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static int contarPares(int[] numeros) {
        int contador = 0;

        //Recorremos la lista.
        for (int numero : numeros) {
            // Buscamos si el número es par con el método anterior.
            if (esPar(numero)) {
                contador++;
            }
        }
        return contador;
    }
}


