public class NodoArbol {
    int dato;
    NodoArbol izquierda;
    NodoArbol derecha;

    // Constructor de NodoArbol
    public NodoArbol(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}