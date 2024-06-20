package arbolesbinarios;
public class NodoArbolBinario {
    private int dato;
    private NodoArbolBinario derecha;
    private NodoArbolBinario izquierda;

    public NodoArbolBinario(int dato) {
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
        }    

    public int getDato() {
        return dato;
        }

    public void setDato(int dato) {
        this.dato = dato;
        }

    public NodoArbolBinario getDerecha() {
        return derecha;
        }

    public void setDerecha(NodoArbolBinario derecha) {
        this.derecha = derecha;
        }

    public NodoArbolBinario getIzquierda() {
        return izquierda;
        }

    public void setIzquierda(NodoArbolBinario izquierda) {
        this.izquierda = izquierda;
    }
 
    
    
    }
