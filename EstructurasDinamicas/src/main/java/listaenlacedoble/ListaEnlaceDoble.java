package listaenlacedoble;

public class ListaEnlaceDoble {
    NodoListaDoble inicio; // Crea el puntero que apunta al inicio de la lista
    NodoListaDoble fin; // Crea el puntero que apunta al fin de la lista

    public ListaEnlaceDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public int CuentaElementos() {
        int acc = 0;
        NodoListaDoble recorre = inicio;
        while (recorre != null) {
            acc += 1;
            recorre = recorre.getSiguiente();
        }
        return acc;
    }

    public void InsertaInicio(int dato) {
        NodoListaDoble n = new NodoListaDoble(dato); // Crea el nodo apuntado por el puntero n
        if (inicio == null) {
            // Si el puntero inicio apunta a null, lista vacía
            inicio = n; // Apunta inicio a n
            fin = n; // Apunta fin a n
        } else {
            n.setSiguiente(inicio); // Apunta el enlace siguiente del nodo apuntado por n al puntero inicio
            inicio.setAnterior(n); // Apunta el enlace anterior del nodo apuntado por inicio a n
            inicio = n; // Inicio se apunta a n
        }
    }

    public void InsertaFin(int dato) {
        NodoListaDoble n = new NodoListaDoble(dato); // Crea el nodo apuntado por el puntero n
        if (inicio == null) {
            // Si el puntero inicio apunta a null, lista vacía
            inicio = n; // Apunta inicio a n
            fin = n; // Apunta fin a n
        } else {
            fin.setSiguiente(n);
            n.setAnterior(fin);
            fin = n;
        }
    }

    public void insertaPosicion(int dato, int pos) {
        int pos_actual = 0;
        if (pos > CuentaElementos()) { // Si la posición es mayor que la cantidad de elementos retorna mensaje
            System.out.println("La posición no existe en la lista");
        } else {
            if (pos == 0) {
                InsertaInicio(dato);
            } else {
                NodoListaDoble n = new NodoListaDoble(dato); // Crea el nodo apuntado por el puntero n
                NodoListaDoble recorre = inicio;
                while ((recorre.getSiguiente() != null) && (pos_actual < pos - 1)) {
                    pos_actual++;
                    recorre = recorre.getSiguiente();
                }
                // Agrega al final, es decir se pasa la posición final
                if (recorre.getSiguiente() == null) {
                    recorre.setSiguiente(n);
                    n.setAnterior(recorre);
                    fin = n;
                } else {
                    NodoListaDoble aux = recorre.getSiguiente();
                    n.setSiguiente(recorre.getSiguiente());
                    recorre.setSiguiente(n);
                    n.setAnterior(recorre);
                    n.setSiguiente(aux);
                    aux.setAnterior(n);
                }
            }
        }
    }

    public void imprimirListaInicioFin() {
        // Crea un puntero recorre, que se apunta al nodo inicio quien apunta al inicio de la lista
        NodoListaDoble recorre = inicio;
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
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        } else {
            NodoListaDoble recorre = inicio;
            for (int i = 0; i < pos - 1; i++) {
                recorre = recorre.getSiguiente();
            }
            NodoListaDoble nodoAEliminar = recorre.getSiguiente();
            recorre.setSiguiente(nodoAEliminar.getSiguiente());
            if (nodoAEliminar.getSiguiente() != null) {
                nodoAEliminar.getSiguiente().setAnterior(recorre);
            } else {
                fin = recorre;
            }
        }
    }

    public void EditaElemento(int pos, int nuevoDato) {
        if (pos < 0 || pos >= CuentaElementos()) {
            System.out.println("La posición no existe en la lista");
            return;
        }

        NodoListaDoble recorre = inicio;
        for (int i = 0; i < pos; i++) {
            recorre = recorre.getSiguiente();
        }
        recorre.setDato(nuevoDato);
    }
}