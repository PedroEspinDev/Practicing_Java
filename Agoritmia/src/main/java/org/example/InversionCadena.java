package org.example;

/*
 * Inversión de Cadena:
 * Escribir un algoritmo que invierta una cadena de caracteres.
 */
public class InversionCadena {
    public static void main(String[] args) {
        String cadenaOriginal = "Hola, mundo!";
        String cadenaInvertida = invertirCadena(cadenaOriginal);

        System.out.println("Cadena Original: " + cadenaOriginal);
        System.out.println("Cadena Invertida: " + cadenaInvertida);
    }

    static String invertirCadena(String cadena) {
        // Convertimos la cadena a un array de caracteres para facilitar la manipulación.
        char[] caracteres = cadena.toCharArray();

        // Inviertimos el array de caracteres.
        for (int i = 0, j = caracteres.length - 1; i < j; i++, j--) {
            char temporal = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temporal;
        }

        // Convierte el array de caracteres de nuevo a una cadena
        return new String(caracteres);
    }
}

