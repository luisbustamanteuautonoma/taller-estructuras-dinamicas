package listasenlacesimple;
public class NodoListaSimple {
    private int dato;
    private NodoListaSimple siguiente;

    public NodoListaSimple(int dato){
        this.dato = dato;
        this.siguiente = null;
        }
    public int getDato() {
        return dato;
        }
    public void setDato(int dato) {
        this.dato = dato;
        }
    public NodoListaSimple getSiguiente() {
        return siguiente;
        }
    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
        }
    
    }
