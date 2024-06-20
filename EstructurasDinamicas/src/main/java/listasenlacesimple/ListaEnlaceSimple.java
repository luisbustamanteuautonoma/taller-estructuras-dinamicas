package listasenlacesimple;

public class ListaEnlaceSimple {

    NodoListaSimple inicio; // Crea el puntero que apunta a la lista

    public ListaEnlaceSimple() {
        this.inicio = null; // Crea la lista vacía apuntada por inicio a null
    }

    public int CuentaElementos() {
        int acc = 0;
        NodoListaSimple recorre = inicio;
        while (recorre != null) {
            acc += 1;
            recorre = recorre.getSiguiente();
        }
        return acc;
    }

    public void InsertaInicio(int dato) {
        NodoListaSimple n = new NodoListaSimple(dato); // Crea el nodo apuntado por el puntero n
        n.setSiguiente(inicio); // El enlace del nodo apuntado por n apunta al puntero inicio
        inicio = n; // Inicio apunta al nodo apuntado por n
    }

    public void InsertaFin(int dato) {
        NodoListaSimple n = new NodoListaSimple(dato); // Crea el nodo apuntado por el puntero n
        // Revisa si la lista está vacía. De estarlo, apunta inicio al nodo apuntado por n
        if (inicio == null) {
            inicio = n;
        } else {
            // Si la lista no está vacía, se debe generar un puntero para recorrer la lista hasta el final
            // Nodo auxiliar para recorrer y se apunta al inicio
            NodoListaSimple recorre = inicio;
            // Recorre la lista hasta que el puntero recorre esté apuntando a un nodo cuyo siguiente esté apuntado a null
            while (recorre.getSiguiente() != null) {
                recorre = recorre.getSiguiente();
            }
            // Asigna el nodo a donde apunta recorre
            recorre.setSiguiente(n);
        }
    }

    public void insertaPosicion(int dato, int pos) {
        int pos_actual = 0;
        NodoListaSimple n = new NodoListaSimple(dato); // Crea el nodo apuntado por el puntero n
        if (pos > CuentaElementos()) { // Si la posición es mayor que la cantidad de elementos retorna mensaje
            System.out.println("La posición no existe en la lista");
        } else {
            if (pos == 0) {
                InsertaInicio(dato);
            } else {
                NodoListaSimple recorre = inicio;
                while ((recorre.getSiguiente() != null) && (pos_actual < pos - 1)) {
                    pos_actual++;
                    recorre = recorre.getSiguiente();
                }
                n.setSiguiente(recorre.getSiguiente());
                recorre.setSiguiente(n);
            }
        }
    }

    public void imprimirLista() {
        // Crea un puntero recorre, que se apunta al nodo inicio quien apunta al inicio de la lista
        NodoListaSimple recorre = inicio;
        // Recorre la lista hasta que recorre esté al final de la lista, en cada paso muestra la información
        while (recorre != null) {
            System.out.print(recorre.getDato() + " ");
            recorre = recorre.getSiguiente();
        }
        System.out.println();
    }

    public void EliminaElemento(int pos) {
        if (pos < 0 || pos >= CuentaElementos()) {
            System.out.println("La posición no existe en la lista");
            return;
        }

        if (pos == 0) {
            inicio = inicio.getSiguiente();
        } else {
            NodoListaSimple recorre = inicio;
            for (int i = 0; i < pos - 1; i++) {
                recorre = recorre.getSiguiente();
            }
            recorre.setSiguiente(recorre.getSiguiente().getSiguiente());
        }
    }

    public void EditaElemento(int pos, int nuevoDato) {
        if (pos < 0 || pos >= CuentaElementos()) {
            System.out.println("La posición no existe en la lista");
            return;
        }

        NodoListaSimple recorre = inicio;
        for (int i = 0; i < pos; i++) {
            recorre = recorre.getSiguiente();
        }
        recorre.setDato(nuevoDato);
    }
}
