import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de ListaEnlazada y ArbolBinarioDeBusqueda
        ListaEnlazada lista = new ListaEnlazada();
        ArbolBinarioDeBusqueda arbol = new ArbolBinarioDeBusqueda();

        // Crear una lista de números del 0 al 10000 y mezclarla
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 10000; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros); // Mezclar los números

        // Insertar los números en la lista enlazada y el árbol binario de búsqueda
        for (int numero : numeros) {
            lista.incertar(numero);
            arbol.insertar(numero);
        }

        Random random = new Random();
        int numAleatorio;
        long inicio, fin, duracionLista, duracionArbol;
        //ArrayList<Long> TiempoLista = new ArrayList<>();
        //ArrayList<Long> TiempoArbol = new ArrayList<>();
        //ArrayList<Integer> Numero = new ArrayList<>();

        // Realizar 500 búsquedas con números aleatorios
        for (int i = 0; i < 500; i++) {
            numAleatorio = random.nextInt(10001); // Generar un número aleatorio entre 0 y 5000
            //Numero.add(numAleatorio);

            // Medir el tiempo de búsqueda en la lista enlazada
            inicio = System.nanoTime();
            lista.buscar(numAleatorio);
            fin = System.nanoTime();
            duracionLista = fin - inicio;
            //TiempoLista.add(duracionLista);

            // Medir el tiempo de búsqueda en el árbol binario de búsqueda
            inicio = System.nanoTime();
            arbol.buscar(numAleatorio);
            fin = System.nanoTime();
            duracionArbol = fin - inicio;
            //TiempoArbol.add(duracionArbol);

            // Imprimir el número buscado y los tiempos de búsqueda
            System.out.println((i + 1) + ". Número a buscar: " + numAleatorio);
            System.out.println("    Tiempo lista: " + duracionLista + " ns");
            System.out.println("    Tiempo árbol: " + duracionArbol + " ns");
        }
        /*
        for (int i = 0; i < Numero.size(); i++) {
            System.out.println(Numero.get(i));
        }
        System.out.println();
        for (int i = 0; i < TiempoLista.size(); i++) {
            System.out.println(TiempoLista.get(i));
        }
        System.out.println();
        for (int i = 0; i < TiempoArbol.size(); i++) {
            System.out.println(TiempoArbol.get(i));
        }
        */
    }
}
