public class ArbolBinarioDeBusqueda {
    private NodoArbol raiz;

    // Método para insertar un elemento en el árbol
    public void insertar(int dato) {
        raiz = insertarRecursivo(raiz, dato);
    }

    // Método recursivo para insertar un nodo en el árbol
    private NodoArbol insertarRecursivo(NodoArbol raiz, int dato) {
        if (raiz == null) {
            raiz = new NodoArbol(dato);
            return raiz;
        }

        if (dato < raiz.dato) {
            raiz.izquierda = insertarRecursivo(raiz.izquierda, dato);
        } else if (dato > raiz.dato) {
            raiz.derecha = insertarRecursivo(raiz.derecha, dato);
        }

        return raiz;
    }

    // Método para buscar un elemento en el árbol
    public boolean buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    // Método recursivo para buscar un dato en el árbol
    private boolean buscarRecursivo(NodoArbol raiz, int dato) {
        if (raiz == null) {
            return false;  // El árbol está vacío o hemos llegado a una hoja sin encontrar el dato.
        }
        if (dato == raiz.dato) {
            return true;  // El dato buscado coincide con el dato en el nodo actual.
        }
        if (dato < raiz.dato) {
            return buscarRecursivo(raiz.izquierda, dato);  // Buscar en el subárbol izquierdo.
        } else {
            return buscarRecursivo(raiz.derecha, dato);  // Buscar en el subárbol derecho.
        }
    }
}