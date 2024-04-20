public class ListaEnlazada {
    private NodoLista cabeza;

    // Método para añadir un elemento al final de la lista
    public void incertar(int dato) {
        NodoLista nuevoNodo = new NodoLista(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoLista temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para buscar un elemento en la lista
    public boolean buscar(int dato) {
        NodoLista temp = cabeza;
        while (temp != null) {
            if (temp.dato == dato) {
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        NodoLista temp = cabeza;
        System.out.print( "(");
        while (temp != null) {
            if (temp.siguiente == null){System.out.print(temp.dato + ")");}
            else{System.out.print(temp.dato + ", ");}
            temp = temp.siguiente;
        }
        System.out.println();
    }

}
