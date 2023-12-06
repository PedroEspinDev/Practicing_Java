        package org.example;


        /*
         * Ordenamiento de Lista:
         * Implementar un algoritmo de ordenamiento (por ejemplo, burbuja o selección) para ordenar una lista de números.
         *
         * Anotaré brevemente el código, ya que en mis inicios me resultó algo complejo,para poder ayudar a quien necesite.
         */
public class OrdenarLista {
    public static void main(String[] args) {

        int[] listaNumeros = {2, 10, 53, 8, 0, 33, 24, 15, 12};

        System.out.println("La lista sin ordenar es: ");
        //Llamamos a los métodos pertinentes indicando el array que deben ordenar e imprimir.
        imprimirLista(listaNumeros);

        ordenarBurbuja(listaNumeros);

        System.out.println("La lista ordenada es: ");
        imprimirLista(listaNumeros);

    }

    //Método donde usamos el algoritmo burbuja (con listas grandes no es eficiente),
    //se basa en comparar elementos adyacentes de la lista de izquierda a derecha,
    //donde si un elemento es mayor que el siguiente, se intecambian posiciones.
    static void ordenarBurbuja(int[] arr) {
        //Generamos una variable donde se almacene la longitud del array que queremos recorrer.
        int n = arr.length;

        //El primer bucle recorre el array hasta el penúltimo elemento.
        //Segundo bucle anidado que realiza comparaciones y intercambios.
        //Comprueba si el elemento actual es mayor que el siguiente.
        //
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    //Intercambia los elementos si es necesario, utilizando una variable temporal (temp).
                    //Si arr[j] es mayor que arr[j +1], se intercambian posiciones para ordenarlos en orden correcto.
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    //Bucle que recorre el array.
    //Imprime cada elemento del array seguido de un espacio en blanco.
    static void imprimirLista(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
