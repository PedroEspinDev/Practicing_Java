package org.example;

/*
 * Número Mayor:
 * Diseñar un algoritmo que determine el número más grande entre tres valores.
 */
public class NumeroMayor {
    public static void main(String[] args) {
        //Forma básica.
        int num1 = 1;
        int num2 = 5;
        int num3 = 3;
        if (num1 > num2 && num1 > num3) {
            System.out.println("El número mayor es: " + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("El número mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número mayor es: " + num3);
        }

        // Otra opción más eficiente es usar un ternario,
        // ya que implementar if anidados no es buena practica a gran escala.

        int numeroMayor = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;

        System.out.println("El número mayor es: " + numeroMayor);
    }
}
